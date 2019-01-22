package com.mifan.guessing.dao.mapper;

import com.mifan.guessing.dao.model.Selection;
import com.mifan.guessing.dao.model.SelectionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SelectionMapper {
    int countByExample(SelectionExample example);

    int deleteByExample(SelectionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Selection record);

    int insertSelective(Selection record);

    List<Selection> selectByExample(SelectionExample example);

    Selection selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Selection record, @Param("example") SelectionExample example);

    int updateByExample(@Param("record") Selection record, @Param("example") SelectionExample example);

    int updateByPrimaryKeySelective(Selection record);

    int updateByPrimaryKey(Selection record);
}