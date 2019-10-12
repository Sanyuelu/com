package com.igeekhome.colloa.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igeekhome.colloa.condition.EmployeeCondition;
import com.igeekhome.colloa.domain.*;
import com.igeekhome.colloa.dto.EmployeePhoneBookDTO;
import com.igeekhome.colloa.mapper.CompanyInfoMapper;
import com.igeekhome.colloa.util.ResultObject;
import com.igeekhome.colloa.util.TableDataNode;
import com.igeekhome.colloa.mapper.DepartmentInfoMapper;
import com.igeekhome.colloa.mapper.EmployeeInfoMapper;
import com.igeekhome.colloa.service.InternalPhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InternalPhoneBookServiceImpl implements InternalPhoneBookService {

    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;
    @Autowired
    private DepartmentInfoMapper departmentInfoMapper;
    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public TableDataNode queryAllEmployee(Integer page, Integer limit) {
        //开启分页查询
        PageHelper.startPage(page,limit);
        //从数据库查询
        List<EmployeeInfo> employeeInfoList = employeeInfoMapper.selectAll();
        //获取页面显示数据并返回
        return getTableDataNode(employeeInfoList);
    }

    @Override
    public TableDataNode queryEmployeeByCompany(Integer page, Integer limit, String companyCode) {
        //开启分页查询
        PageHelper.startPage(page,limit);
        //自定义条件进行查询
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria employeeInfoExampleCriteria = employeeInfoExample.createCriteria();
        employeeInfoExampleCriteria.andCompanyCodeEqualTo(companyCode);
        //从数据库查询
        List<EmployeeInfo> employeeInfoList = employeeInfoMapper.selectByExample(employeeInfoExample);
        //获取页面显示数据并返回
        return getTableDataNode(employeeInfoList);
    }

    @Override
    public TableDataNode queryEmployeeByDepartment(Integer page, Integer limit, String companyCode, String depaCode) {
        //开启分页查询
        PageHelper.startPage(page,limit);
        //自定义条件进行查询
        EmployeeInfoExample example = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyCodeEqualTo(companyCode);
        criteria.andDepaCodeEqualTo(depaCode);
        //从数据库查询
        List<EmployeeInfo> employeeInfoList = employeeInfoMapper.selectByExample(example);
        //获取页面显示数据并返回
        return getTableDataNode(employeeInfoList);
    }

    @Override
    public TableDataNode queryEmployeeByCondition(Integer page, Integer limit, EmployeeCondition condition) {
        //开启分页查询
        PageHelper.startPage(page,limit);
        //自定义条件进行查询
        EmployeeInfoExample example = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria criteria = example.createCriteria();
        if(condition.getEmplCode()!=null&&!"".equals(condition.getEmplCode().trim())){
            criteria.andEmplCodeLike("%"+condition.getEmplCode()+"%");
        }
        if(condition.getName()!=null&&!"".equals(condition.getName().trim())){
            criteria.andNameLike("%"+condition.getName()+"%");
        }
        if(condition.getTel()!=null&&!"".equals(condition.getTel().trim())){
            criteria.andTelLike("%"+condition.getTel()+"%");
        }
        if(condition.getMobileTel()!=null&&!"".equals(condition.getMobileTel().trim())){
            criteria.andMobileTelLike("%"+condition.getMobileTel()+"%");
        }
        if(condition.getEmail()!=null&&!"".equals(condition.getEmail().trim())){
            criteria.andEmailLike("%"+condition.getEmail()+"%");
        }
        if(condition.getWechat()!=null&&!"".equals(condition.getWechat().trim())){
            criteria.andWechatLike("%"+condition.getWechat()+"%");
        }
        //从数据库查询
        List<EmployeeInfo> employeeInfoList = employeeInfoMapper.selectByExample(example);
        //获取页面显示数据并返回
        return getTableDataNode(employeeInfoList);
    }

    @Override
    public ResultObject queryAllCompany() {
        List<CompanyInfo> companyInfoList = companyInfoMapper.selectAll();
        return ResultObject.ok(companyInfoList);
    }

    @Override
    public ResultObject queryDepartmentByCompany(String companyCode) {
        //自定义条件进行查询
        DepartmentInfoExample departmentInfoExample = new DepartmentInfoExample();
        DepartmentInfoExample.Criteria departmentInfoExampleCriteria = departmentInfoExample.createCriteria();
        departmentInfoExampleCriteria.andCompanyCodeEqualTo(companyCode);
        //从数据库查询
        List<DepartmentInfo> departmentInfoList = departmentInfoMapper.selectByExample(departmentInfoExample);
        //返回数据及状态码
        return ResultObject.ok(departmentInfoList);
    }

    @Override
    public ResultObject updateEmployeeInfo(EmployeeCondition condition) {
        if(null == condition || null == condition.getEmplCode()){
            return ResultObject.fail(500,"参数有误!");
        }
        //根据 condition 中 emplCode 查询 Employee
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria employeeInfoExampleCriteria = employeeInfoExample.createCriteria();
        employeeInfoExampleCriteria.andEmplCodeEqualTo(condition.getEmplCode());
        //从数据库查询
        List<EmployeeInfo> employeeInfoList = employeeInfoMapper.selectByExample(employeeInfoExample);
        if(null != employeeInfoList && 0 != employeeInfoList.size()){
            EmployeeInfo employeeInfo = employeeInfoList.get(0);
            employeeInfo.setAvatarUrl(condition.getAvatarUrl());
            employeeInfo.setSelfDesc(condition.getSelfDesc());
            employeeInfo.setWorkStatus(condition.getWorkStatus());
            employeeInfo.setTel(condition.getTel());
            employeeInfo.setMobileTel(condition.getMobileTel());
            employeeInfo.setEmail(condition.getEmail());
            employeeInfo.setWechat(condition.getWechat());
            //更新员工通讯信息
            int effectedNum = employeeInfoMapper.updateByExample(employeeInfo,employeeInfoExample);
            if (effectedNum <= 0){
                return ResultObject.fail(500,"更新失败！");
            }
        }else {
            return ResultObject.fail(500,"此员工不存在");
        }
        return ResultObject.ok();
    }

    /**
     * 根据 employeeInfoList 获取页面显示数据
     * @param employeeInfoList
     * @return
     */
    private TableDataNode getTableDataNode(List<EmployeeInfo> employeeInfoList){
        /**
         * 封装 List<EmployeePhoneBookDTO>
         */
        List<EmployeePhoneBookDTO> employeePhoneBookDTOList = new ArrayList<>();
        for(EmployeeInfo employeeInfo : employeeInfoList){
            //将 EmployeePhoneBookDTO 添加到 List<EmployeePhoneBookDTO>
            employeePhoneBookDTOList.add(getEmployeePhoneBookDTO(employeeInfo));
        }
        //分页对象：（当前页 总条数  总页数....）
        PageInfo<EmployeePhoneBookDTO> pageInfo = new PageInfo<>(employeePhoneBookDTOList);
        //返回数据
        //employeeInfoList.size()  不是总条数 而是查询出当前页得 数据条数
        return TableDataNode.ok((int)pageInfo.getTotal(),employeePhoneBookDTOList);
    }

    /**
     * 获取员工的所属部门 根据 EmployeeInfo 封装 EmployeePhoneBookDTO
     * @return
     */
    private EmployeePhoneBookDTO getEmployeePhoneBookDTO(EmployeeInfo employeeInfo){
        //构造 EmployeePhoneBookDTO 对象
        EmployeePhoneBookDTO employeePhoneBookDTO = new EmployeePhoneBookDTO();
        employeePhoneBookDTO.setName(employeeInfo.getName());
        employeePhoneBookDTO.setTel(employeeInfo.getTel());
        employeePhoneBookDTO.setMobileTel(employeeInfo.getMobileTel());
        employeePhoneBookDTO.setEmail(employeeInfo.getEmail());
        employeePhoneBookDTO.setWechat(employeeInfo.getWechat());
        employeePhoneBookDTO.setAvatarUrl(employeeInfo.getAvatarUrl());
        //自定义条件进行查询职员所在部门
        DepartmentInfoExample departmentInfoExample = new DepartmentInfoExample();
        DepartmentInfoExample.Criteria departmentInfoExampleCriteria = departmentInfoExample.createCriteria();
        departmentInfoExampleCriteria.andCompanyCodeEqualTo(employeeInfo.getCompanyCode());
        departmentInfoExampleCriteria.andDepaCodeEqualTo(employeeInfo.getDepaCode());
        List<DepartmentInfo> departmentInfoList = departmentInfoMapper.selectByExample(departmentInfoExample);
        if(null != departmentInfoList && 0 != departmentInfoList.size()){
            employeePhoneBookDTO.setDepartmentInfo(departmentInfoList.get(0));
        }
        return employeePhoneBookDTO;
    }
}
