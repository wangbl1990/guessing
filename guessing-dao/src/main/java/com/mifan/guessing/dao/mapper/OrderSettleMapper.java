package com.mifan.guessing.dao.mapper;

import com.mifan.guessing.dao.model.OrderSettle;
import com.mifan.guessing.dao.model.OrderSettleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderSettleMapper {
    int countByExample(OrderSettleExample example);

    int deleteByExample(OrderSettleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderSettle record);

    int insertSelective(OrderSettle record);

    List<OrderSettle> selectByExample(OrderSettleExample example);

    OrderSettle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderSettle record, @Param("example") OrderSettleExample example);

    int updateByExample(@Param("record") OrderSettle record, @Param("example") OrderSettleExample example);

    int updateByPrimaryKeySelective(OrderSettle record);

    int updateByPrimaryKey(OrderSettle record);
}