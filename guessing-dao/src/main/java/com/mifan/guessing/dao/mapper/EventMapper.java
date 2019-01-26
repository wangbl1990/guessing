package com.mifan.guessing.dao.mapper;

import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.EventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMapper {
    int countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(String id);

    int insert(Event record);

    int insertSelective(Event record);

    List<Event> selectByExample(EventExample example);

    Event selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}