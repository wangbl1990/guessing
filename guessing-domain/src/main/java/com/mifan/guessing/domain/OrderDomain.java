package com.mifan.guessing.domain;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.dao.mapper.OrderSettleMapper;
import com.mifan.guessing.dao.mapper.TradeOrderMapper;
import com.mifan.guessing.dao.model.OrderSettle;
import com.mifan.guessing.dao.model.OrderSettleExample;
import com.mifan.guessing.dao.model.TradeOrder;
import com.mifan.guessing.dao.model.TradeOrderExample;
import com.mifan.guessing.domain.enums.OrderStatus;
import com.mifan.guessing.domain.job.SubEventMsgJob;
import com.mifan.guessing.domain.manager.RollingBallManager;
import com.mifan.guessingapi.exception.GuessingErrorCode;
import com.mifan.guessingapi.exception.GuessingRunTimeException;
import com.mifan.guessingapi.request.order.*;
import com.mifan.guessingapi.response.order.BossOrderListResponse;
import com.mifan.guessingapi.response.order.BossSettleOrderListResponse;
import com.mifan.guessingapi.response.order.MyOrderListResponse;
import com.mifan.guessingapi.response.order.SubmitOrderResponse;
import com.mifan.guessingutils.BeanMapper;
import com.mifan.guessingutils.IdMakerUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tv.zhangyu.rpcservice.MoneyService;
import tv.zhangyu.rpcservice.UserService;
import tv.zhangyu.rpcservice.base.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class OrderDomain {

    private static Logger logger = LogManager.getLogger( OrderDomain.class );

    @Autowired
    private TradeOrderMapper tradeOrderMapper;
    @Autowired
    private RollingBallManager rollingBallManager;
    @Autowired
    private UserService userService;
    @Autowired
    private MoneyService moneyService;
    @Autowired
    private OrderSettleMapper orderSettleMapper;

    /**
     * 下注
     * @param submitOrderRequest
     * @return
     */
//    @Transactional
    public SubmitOrderResponse submitOrder(SubmitOrderRequest submitOrderRequest) {

        logger.info("下注入参"+ JSONObject.toJSONString(submitOrderRequest));
        //校验用户信息
        User user = userService.getUserByUserId(submitOrderRequest.getUserCode());
//        User user = new User();
        //落单
        TradeOrder tradeOrder = new TradeOrder();
        tradeOrder.setEventId(submitOrderRequest.getEventId());
        tradeOrder.setEventName(submitOrderRequest.getEventName());
        tradeOrder.setEventType(submitOrderRequest.getSportId());
        tradeOrder.setId(IdMakerUtils.getOrderId());
        tradeOrder.setMarketId(submitOrderRequest.getMarketId());
        tradeOrder.setOrderId(tradeOrder.getId());
        tradeOrder.setRequestAmount(submitOrderRequest.getRequestAmount());
        tradeOrder.setRequestPrice(submitOrderRequest.getRequestPrice());
        tradeOrder.setSelectionId(submitOrderRequest.getSelectionId());
        tradeOrder.setSubmittedTime(new Date());
        tradeOrder.setStatus(OrderStatus.INIT.getCode());
        tradeOrder.setUserCode(submitOrderRequest.getUserCode());
        tradeOrder.setUserName(user.getNickname());
        tradeOrder.setCompetitionName(submitOrderRequest.getCompetitionName());
        tradeOrder.setSeasonName(submitOrderRequest.getSeasonName());
        tradeOrder.setRuleTypeName(submitOrderRequest.getRuleTypeName());
        tradeOrder.setRoundName(submitOrderRequest.getRoundName());
        tradeOrder.setSelectionOdds(submitOrderRequest.getSelectionOdds());
        tradeOrder.setEventTime(submitOrderRequest.getEventTime());
        tradeOrder.setHomeTeamName(submitOrderRequest.getHomeTeamName());
        tradeOrder.setHomeTeamNameEn(submitOrderRequest.getHomeTeamNameEn());
        tradeOrder.setAwayTeamName(submitOrderRequest.getAwayTeamName());
        tradeOrder.setAwayTeamNameEn(submitOrderRequest.getAwayTeamNameEn());
        tradeOrderMapper.insert(tradeOrder);
        //冻结用户下单米粒
        moneyService.removeMoney(submitOrderRequest.getUserCode(),submitOrderRequest.getRequestAmount().longValue(),"竞猜投注扣减用户米粒");
        //请求滚球下单
        SubmitOrderResponse response = null;
        try {
            TradeOrder order = rollingBallManager.order(tradeOrder, submitOrderRequest);
            response = BeanMapper.map(order,SubmitOrderResponse.class);
        }catch (Exception e){
            logger.error("滚球下注异常",e);
            //解冻用户米粒
            moneyService.addMoney(submitOrderRequest.getUserCode(),submitOrderRequest.getRequestAmount().longValue(),"竞猜投注失败恢复扣减用户米粒");
            //更新订单状态投注失败
            TradeOrder updateOrder = new TradeOrder();
            updateOrder.setId(tradeOrder.getId());
            updateOrder.setStatus(OrderStatus.FAIL.getCode());
            tradeOrderMapper.updateByPrimaryKeySelective(updateOrder);
            throw e;
        }
        return response;

    }

    /**
     * 结算
     * @param orderSettleRequest
     */
    @Transactional
    public void settle(OrderSettleRequest orderSettleRequest){
        logger.info("结算入参"+ JSONObject.toJSONString(orderSettleRequest));
        //原订单信息
        TradeOrder tradeOrder = tradeOrderMapper.selectByPrimaryKey(orderSettleRequest.getVendor_order_id());
        //更新原订单已结算
        TradeOrderExample tradeOrderExample = new TradeOrderExample();
        tradeOrderExample.createCriteria().andIdEqualTo(orderSettleRequest.getVendor_order_id()).andStatusEqualTo(OrderStatus.PAYED.getCode());
        TradeOrder updateTradeOrder = new TradeOrder();
        updateTradeOrder.setStatus(OrderStatus.SETTLED.getCode());
        int result = tradeOrderMapper.updateByExampleSelective(updateTradeOrder, tradeOrderExample);
        if(1 == result){
            //新增结算单
            OrderSettle orderSettle = new OrderSettle();
            orderSettle.setCreateTime(new Date());
            orderSettle.setId(IdMakerUtils.getOrderId());
            orderSettle.setEventName(tradeOrder.getEventName());
            orderSettle.setEventType(tradeOrder.getEventType());
            orderSettle.setOrderAmount(tradeOrder.getRequestAmount().longValue());
            orderSettle.setOrderId(tradeOrder.getOrderId());
            orderSettle.setPlayName("");
            orderSettle.setSettleIncomeLose(orderSettleRequest.getNet_pn_l().longValue());//结算盈亏
            orderSettle.setSettleTime(orderSettleRequest.getSettled_time());
            orderSettle.setStatus(OrderStatus.valueOf(orderSettleRequest.getStatus()).getCode());
            orderSettle.setType("");
            orderSettleMapper.insertSelective(orderSettle);
            //根据结算盈亏增加或者扣减用户米粒值
            if(null != orderSettleRequest.getNet_return() && 1 == orderSettleRequest.getNet_return().compareTo(new BigDecimal(0))){
                //盈利
                BigDecimal addAmount = orderSettleRequest.getRequest_amount().add(orderSettleRequest.getNet_return());
                moneyService.addMoney(tradeOrder.getUserCode(),addAmount.longValue(),"结算盈利加账");
            }else{
                //亏损
                BigDecimal addAmount = orderSettleRequest.getRequest_amount().add(orderSettleRequest.getNet_return());
                if(1 == addAmount.compareTo(new BigDecimal(0))){
                    moneyService.addMoney(tradeOrder.getUserCode(),addAmount.longValue(),"结算亏损加账");
                }

            }
        }
    }

    /**
     * 管理后台订单列表
     * @param bossOrderListRequest
     * @return
     */
    public PageInfo<BossOrderListResponse> orderList(BossOrderListRequest bossOrderListRequest) {

        TradeOrderExample example = new TradeOrderExample();
        TradeOrderExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(bossOrderListRequest.getUserName())) {
            criteria.andUserNameLike("%" + bossOrderListRequest.getUserName() + "%");
        }
        if (StringUtils.isNotEmpty(bossOrderListRequest.getOrderId())) {
            criteria.andOrderIdEqualTo(bossOrderListRequest.getOrderId());
        }
        PageHelper.startPage(bossOrderListRequest.getPageNum(), bossOrderListRequest.getPageSize(), true);
        List<TradeOrder> tradeOrders = tradeOrderMapper.selectByExample(example);
        PageInfo<BossOrderListResponse> pageInfo = new PageInfo(tradeOrders);
        if (null != tradeOrders) {
            pageInfo.setList(BeanMapper.mapList(tradeOrders, BossOrderListResponse.class));
        }
        return pageInfo;
    }

    /**
     * 管理后台注单列表
     * @param bossSettleOrderListRequest
     * @return
     */
    public PageInfo<BossSettleOrderListResponse> settleOrderList(BossSettleOrderListRequest bossSettleOrderListRequest) {
        OrderSettleExample example = new OrderSettleExample();
        OrderSettleExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(bossSettleOrderListRequest.getUserName())) {
            criteria.andUserNameLike("%" + bossSettleOrderListRequest.getUserName() + "%");
        }
        if (StringUtils.isNotEmpty(bossSettleOrderListRequest.getOrderId())) {
            criteria.andOrderIdEqualTo(bossSettleOrderListRequest.getOrderId());
        }
        PageHelper.startPage(bossSettleOrderListRequest.getPageNum(), bossSettleOrderListRequest.getPageSize(), true);
        List<OrderSettle> tradeOrders = orderSettleMapper.selectByExample(example);
        PageInfo<BossSettleOrderListResponse> pageInfo = new PageInfo(tradeOrders);
        if (null != tradeOrders) {
            pageInfo.setList(BeanMapper.mapList(tradeOrders, BossSettleOrderListResponse.class));
        }
        return pageInfo;
    }

    public PageInfo<MyOrderListResponse> myOrderList(MyOrderListRequest myOrderListRequest) {

        TradeOrderExample example = new TradeOrderExample();
        example.createCriteria().andUserCodeEqualTo(myOrderListRequest.getUserCode());
        PageHelper.startPage(myOrderListRequest.getPageNum(), myOrderListRequest.getPageSize(), true);
        List<TradeOrder> tradeOrders = tradeOrderMapper.selectByExample(example);
        PageInfo<MyOrderListResponse> pageInfo = new PageInfo(tradeOrders);
        if (null != tradeOrders) {
            pageInfo.setList(BeanMapper.mapList(tradeOrders, MyOrderListResponse.class));
        }
        return pageInfo;
    }

    public void orderConfirm(OrderSettleRequest orderSettleRequest) {
        //根据下单确认结果更新订单状态
        if("1".equals(orderSettleRequest.getStatus())){
            //接单成功,更新订单状态
            TradeOrderExample tradeOrderExample = new TradeOrderExample();
            tradeOrderExample.createCriteria().andIdEqualTo(orderSettleRequest.getVendor_order_id()).andStatusEqualTo(OrderStatus.INIT.getCode());
            TradeOrder updateTradeOrder = new TradeOrder();
            updateTradeOrder.setStatus(OrderStatus.PAYED.getCode());
            tradeOrderMapper.updateByExampleSelective(updateTradeOrder, tradeOrderExample);
        }else if("3".equals(orderSettleRequest.getStatus()) || "4".equals(orderSettleRequest.getStatus()) || "5".equals(orderSettleRequest.getStatus())){
            //订单取消;订单无效;订单被拒 更新订单状态，退还用户下单米粒
            TradeOrderExample tradeOrderExample = new TradeOrderExample();
            tradeOrderExample.createCriteria().andIdEqualTo(orderSettleRequest.getVendor_order_id()).andStatusEqualTo(OrderStatus.INIT.getCode());
            TradeOrder updateTradeOrder = new TradeOrder();
            updateTradeOrder.setStatus(orderSettleRequest.getStatus());
            int result = tradeOrderMapper.updateByExampleSelective(updateTradeOrder, tradeOrderExample);
            if(1 == result){
                TradeOrder tradeOrder = tradeOrderMapper.selectByPrimaryKey(orderSettleRequest.getVendor_order_id());
                moneyService.addMoney(tradeOrder.getUserCode(),tradeOrder.getRequestAmount().longValue(),"下注失败退还用户米粒");
            }
        }
    }
}
