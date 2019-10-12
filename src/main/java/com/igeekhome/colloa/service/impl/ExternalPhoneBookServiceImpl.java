package com.igeekhome.colloa.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igeekhome.colloa.domain.ExternalCategory;
import com.igeekhome.colloa.domain.ExternalInfo;
import com.igeekhome.colloa.domain.ExternalInfoExample;
import com.igeekhome.colloa.mapper.ExternalCategoryMapper;
import com.igeekhome.colloa.mapper.ExternalInfoMapper;
import com.igeekhome.colloa.service.ExternalPhoneBookService;
import com.igeekhome.colloa.util.ResultObject;
import com.igeekhome.colloa.util.TableDataNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExternalPhoneBookServiceImpl implements ExternalPhoneBookService {

    @Autowired
    private ExternalCategoryMapper externalCategoryMapper;

    @Autowired
    private ExternalInfoMapper externalInfoMapper;

    @Override
    public ResultObject queryAllCategory() {

        List<ExternalCategory> categoryList = externalCategoryMapper.selectAll();
        return ResultObject.build(200, "成功", categoryList);
    }

    @Override
    public TableDataNode queryAllContacts(Integer page, Integer limit) {
        //开启分页查询
        PageHelper.startPage(page, limit);
        //从数据库查询
        List<ExternalInfo> externalInfoList = externalInfoMapper.selectAll();
        //获取页面显示数据并返回
        return getTableDataNode(externalInfoList);
    }

    @Override
    public TableDataNode queryContactsByCategory(Integer page, Integer limit, String cateCode) {
        //开启分页查询
        PageHelper.startPage(page, limit);
        //从数据库查询
        ExternalInfoExample example = new ExternalInfoExample();
        example.createCriteria()
                .andCategoryCodeEqualTo(cateCode)
                .andStatusEqualTo(0);
        List<ExternalInfo> externalInfoList = externalInfoMapper.selectByExample(example);
        //获取页面显示数据并返回
        return getTableDataNode(externalInfoList);
    }

    @Override
    public TableDataNode queryContactsByCondition(Integer page, Integer limit, ExternalInfo condition) {

        //开启分页查询
        PageHelper.startPage(page, limit);

        ExternalInfoExample example = new ExternalInfoExample();
        ExternalInfoExample.Criteria criteria = example.createCriteria();
        // 联系人信息状态可用
        criteria.andStatusEqualTo(0);
        // 判断是否输入名称
        if (condition.getName() != null && !condition.getName().equals("")) {
            criteria.andNameLike("%" + condition.getName() + "%");
        }
        // 判断是否输入公司名称
        if (condition.getCompanyName() != null && !condition.getCompanyName().equals("")) {
            criteria.andCompanyNameLike("%" + condition.getCompanyName() + "%");
        }
        // 判断是否输入固定电话
        if (condition.getTel() != null && !condition.getTel().equals("")) {
            criteria.andTelLike("%" + condition.getTel() + "%");
        }
        // 判断是否输入移动电话
        if (condition.getMobileTel() != null && !condition.getMobileTel().equals("")) {
            criteria.andMobileTelLike("%" + condition.getMobileTel() + "%");
        }
        // 判断是否输入电子邮件
        if (condition.getEmail() != null && !condition.getEmail().equals("")) {
            criteria.andEmailLike("%" + condition.getEmail() + "%");
        }
        // 判断是否输入微信号
        if (condition.getWechat() != null && !condition.getWechat().equals("")) {
            criteria.andWechatLike("%" + condition.getWechat() + "%");
        }
        List<ExternalInfo> externalInfoList = externalInfoMapper.selectByExample(example);
        //获取页面显示数据并返回
        return getTableDataNode(externalInfoList);
    }

    /**
     * 根据 externalInfoList 获取页面显示数据
     *
     * @param externalInfoList
     * @return
     */
    private TableDataNode getTableDataNode(List<ExternalInfo> externalInfoList) {
        /**
         * 封装 List<EmployeePhoneBookDTO>
         */
        //分页对象：（当前页 总条数  总页数....）
        PageInfo<ExternalInfo> pageInfo = new PageInfo<>(externalInfoList);
        //返回数据
        //employeeInfoList.size()  不是总条数 而是查询出当前页得 数据条数
        return TableDataNode.ok((int) pageInfo.getTotal(), externalInfoList);
    }

}
