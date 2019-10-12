package com.igeekhome.colloa.mapper;

import com.igeekhome.colloa.domain.ExternalCategory;
import com.igeekhome.colloa.domain.ExternalCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExternalCategoryMapper {

    /**
     * 查询所有的类别信息
     * @return
     */
    List<ExternalCategory> selectAll();

    long countByExample(ExternalCategoryExample example);

    int deleteByExample(ExternalCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExternalCategory record);

    int insertSelective(ExternalCategory record);

    List<ExternalCategory> selectByExample(ExternalCategoryExample example);

    ExternalCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExternalCategory record, @Param("example") ExternalCategoryExample example);

    int updateByExample(@Param("record") ExternalCategory record, @Param("example") ExternalCategoryExample example);

    int updateByPrimaryKeySelective(ExternalCategory record);

    int updateByPrimaryKey(ExternalCategory record);
}