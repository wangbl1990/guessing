package com.mifan.guessing.dao.mapper;

import com.mifan.guessing.dao.model.SubscribeEvent;
import com.mifan.guessing.dao.model.SubscribeEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribeEventMapper {
    int countByExample(SubscribeEventExample example);

    int deleteByExample(SubscribeEventExample example);

    int deleteByPrimaryKey(String id);

    int insert(SubscribeEvent record);

    int insertSelective(SubscribeEvent record);

    List<SubscribeEvent> selectByExample(SubscribeEventExample example);

    SubscribeEvent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SubscribeEvent record, @Param("example") SubscribeEventExample example);

    int updateByExample(@Param("record") SubscribeEvent record, @Param("example") SubscribeEventExample example);

    int updateByPrimaryKeySelective(SubscribeEvent record);

    int updateByPrimaryKey(SubscribeEvent record);
}