package com.mifan.guessing.domain.manager;

import com.alibaba.fastjson.JSONObject;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.TradeOrder;
import com.mifan.guessing.domain.model.EventMarket;
import com.mifan.guessing.domain.model.MarketSelection;
import com.mifan.guessingapi.exception.GuessingErrorCode;
import com.mifan.guessingapi.exception.GuessingRunTimeException;
import com.mifan.guessingapi.request.order.SubmitOrderRequest;
import com.mifan.guessingutils.DateUtils;
import com.mifan.guessingutils.HttpClientUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 滚球接口
 * @auther wangbinlei
 * @create 2018/12/5
 */
@Component
public class RollingBallManager {

    private static Logger logger = LogManager.getLogger( RollingBallManager.class );

    private static final String vendorIdKey = "vendor_id=";

    private static final String vendorAppAIdKey = "vendor_app_id=";

    private static final String requestTimeKey = "request_time=";

    private static final String requestSgin = "request_sgin=";

    @Value("${gunqiu.vendorIdValue}")
    private String vendorIdValue;
    @Value("${gunqiu.vendorAppIdValue}")
    private String vendorAppIdValue;
    @Value("${gunqiu.secretKey}")
    private String secretKey;


    private String sign(){
        StringBuffer stringBuffer = new StringBuffer();
        long unixTimeStamp = DateUtils.getUnixDate();
        stringBuffer.append(vendorIdKey).append(vendorIdValue).append("&").append(vendorAppAIdKey).append(vendorAppIdValue)
                .append("&").append(requestTimeKey).append(unixTimeStamp).append("&").append(secretKey);
        String encode = MD5Encoder.encode(stringBuffer.toString().getBytes());
        return encode;
    }

    /**
     * 赛事列表查询
     * @return
     */
    public List<Event> eventList(Date beginDate, Date endDate){

        Map<String,Object> param = new HashMap<String,Object>();
        param.put("vendor_id",vendorIdValue);
        param.put("vendor_app_id",vendorAppIdValue);
        param.put("request_time",new Date().getTime());
        param.put("request_sgin",sign());
        param.put("sport_id",1);
        param.put("begin_time",beginDate.getTime()/1000);
        param.put("end_time",endDate.getTime()/1000);
        logger.info("赛事列表入参:"+ JSONObject.toJSONString(param));
        String result = HttpClientUtil.post(RollingBallRequestUrl.eventList, null, param);
        logger.info("赛事列表结果:"+ result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        List<Event> eventList = new ArrayList<Event>();
        if("0".equals(jsonObject.get("errno"))){
            List<JSONObject> datas = (List<JSONObject>)jsonObject.get("data");
            for(JSONObject data:datas){
                Event event = JSONObject.toJavaObject(data,Event.class);
                eventList.add(event);
            }
        }else{
            logger.error("赛事列表查询失败"+result);
            throw new GuessingRunTimeException(GuessingErrorCode.SYSTEM_ERROR);
        }
        return eventList;
    }

    /**
     * 赛事详情查询
     * @return
     */
    public Event eventInfo(String eventId){

        Map<String,Object> param = new HashMap<String,Object>();
        param.put("vendor_id",vendorIdValue);
        param.put("vendor_app_id",vendorAppIdValue);
        param.put("request_time",new Date().getTime());
        param.put("request_sgin",sign());
        param.put("event_id",eventId);
        logger.info("赛事详情入参:"+ JSONObject.toJSONString(param));
        String result = HttpClientUtil.post(RollingBallRequestUrl.eventInfo, null, param);
        logger.info("赛事详情结果:"+ result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        Event event = null;
        if("0".equals(jsonObject.get("errno"))){
            JSONObject data = (JSONObject)jsonObject.get("data");
            event = JSONObject.toJavaObject(data,Event.class);
        }else{
            logger.error("赛事详情查询失败"+result);
            throw new GuessingRunTimeException(GuessingErrorCode.SYSTEM_ERROR);
        }
        return event;
    }

    /**
     * 赛事行情查询
     * @return
     */
    public List<EventMarket> eventMarket(String eventId){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("vendor_id",vendorIdValue);
        param.put("vendor_app_id",vendorAppIdValue);
        param.put("request_time",new Date().getTime());
        param.put("request_sgin",sign());
        param.put("event_id",eventId);
        logger.info("赛事市场入参:"+ JSONObject.toJSONString(param));
        String result = HttpClientUtil.post(RollingBallRequestUrl.eventMarkets, null, param);
        logger.info("赛事市场结果:"+ result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        List<EventMarket> eventMarketList = new ArrayList<EventMarket>();
        if("0".equals(jsonObject.get("errno"))){
            List<JSONObject> datas = (List<JSONObject>)jsonObject.get("data");
            for(JSONObject data:datas){
                EventMarket eventMarket = JSONObject.toJavaObject(data,EventMarket.class);
                List<JSONObject> selectonList = (List<JSONObject>)data.get("selection");
                List<MarketSelection> marketSelectionList = new ArrayList<MarketSelection>();
                for(JSONObject selection:selectonList){
                    MarketSelection marketSelection = JSONObject.toJavaObject(selection,MarketSelection.class);
                    marketSelectionList.add(marketSelection);
                }
                eventMarket.setMarketSelectionList(marketSelectionList);
                eventMarketList.add(eventMarket);
            }
        }else{
            logger.error("赛事市场查询失败"+result);
            throw new GuessingRunTimeException(GuessingErrorCode.SYSTEM_ERROR);
        }
        return eventMarketList;
    }

    /**
     * 下单
     */
    public TradeOrder order(TradeOrder tradeOrder, SubmitOrderRequest submitOrderRequest){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("vendor_id",vendorIdValue);
        param.put("vendor_app_id",vendorAppIdValue);
        param.put("request_time",new Date().getTime());
        param.put("request_sgin",sign());
        param.put("correlation_order_id",tradeOrder.getOrderId());
        param.put("vendor_player_id",tradeOrder.getUserCode());
        param.put("event_id",tradeOrder.getEventId());
        param.put("market_id",tradeOrder.getMarketId());
        param.put("selection_id",tradeOrder.getSelectionId());
        param.put("placed_result",submitOrderRequest.getPlaceResult());
        param.put("request_price",tradeOrder.getRequestPrice());
        param.put("request_amount",tradeOrder.getRequestAmount());
        logger.info("下单入参:"+ JSONObject.toJSONString(param));
        String result = HttpClientUtil.post(RollingBallRequestUrl.eventInfo, null, param);
        logger.info("下单结果:"+ result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        TradeOrder orderResult = null;
        if("0".equals(jsonObject.get("errno"))){
            JSONObject data = (JSONObject)jsonObject.get("data");
            orderResult = JSONObject.toJavaObject(data,TradeOrder.class);
        }else{
            logger.error("下单失败"+result);
            throw new GuessingRunTimeException(GuessingErrorCode.SYSTEM_ERROR);
        }
        return orderResult;
    }

    /**
     * 取消订单
     */
    public void cancleOrder(){

    }

    /**
     * 订单详情
     * @return
     */
    public TradeOrder orderDetail(){

        return new TradeOrder();
    }

    /**
     * 订单列表
     * @return
     */
    public List<TradeOrder> orderList(){

        return null;
    }

    /**
     * 订阅赛事变化通知
     */
    public void subscribeEvent(){

    }

    /**
     * 取消订阅赛事变化通知
     */
    public void unSubscribeEvent(){

    }


}
