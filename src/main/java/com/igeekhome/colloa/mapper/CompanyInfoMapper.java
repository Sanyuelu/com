package com.igeekhome.colloa.mapper;

import com.igeekhome.colloa.domain.CompanyInfo;
import com.igeekhome.colloa.domain.CompanyInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyInfoMapper {

    /**
     * 查询所有子公司
     * @return
     */
    List<CompanyInfo> selectAll();

    long countByExample(CompanyInfoExample example);

    int deleteByExample(CompanyInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    List<CompanyInfo> selectByExample(CompanyInfoExample example);

    CompanyInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}