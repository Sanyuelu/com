package com.igeekhome.colloa.mapper;

import com.igeekhome.colloa.domain.PositionCategory;
import com.igeekhome.colloa.domain.PositionCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PositionCategoryMapper {
    long countByExample(PositionCategoryExample example);

    int deleteByExample(PositionCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PositionCategory record);

    int insertSelective(PositionCategory record);

    List<PositionCategory> selectByExample(PositionCategoryExample example);

    PositionCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PositionCategory record, @Param("example") PositionCategoryExample example);

    int updateByExample(@Param("record") PositionCategory record, @Param("example") PositionCategoryExample example);

    int updateByPrimaryKeySelective(PositionCategory record);

    int updateByPrimaryKey(PositionCategory record);
}