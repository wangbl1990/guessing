package com.mifan.guessing.controller;

import com.alibaba.fastjson.JSONObject;
import com.mifan.guessing.domain.MarketDomain;
import com.mifan.guessing.domain.OrderDomain;
import com.mifan.guessingapi.request.callback.CallbackRequest;
import com.mifan.guessingapi.request.market.MarketChangeRequest;
import com.mifan.guessingapi.request.market.MarketChangeSelectionRequest;
import com.mifan.guessingapi.request.order.OrderSettleRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/guessing/callback")
public class CallbackController{

    private static Logger logger = LoggerFactory.getLogger( CallbackController.class );

    @Autowired
    private OrderDomain orderDomain;
    @Autowired
    private MarketDomain marketDomain;

    @RequestMapping( value = "/callback" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void submitOrder(@RequestBody @Validated final CallbackRequest callbackRequest ){
        logger.info("滚球推送参数："+JSONObject.toJSONString(callbackRequest));
        //判断推送类型
        if("OrderChangedNotification".equals(callbackRequest.getType())){
            OrderSettleRequest orderSettleRequest = new OrderSettleRequest();
            JSONObject jsonObject = JSONObject.parseObject(callbackRequest.getContent());
            orderSettleRequest.setCorrelation_order_id(jsonObject.get("correlation_order_id").toString());
            orderSettleRequest.setEvent_id(jsonObject.get("event_id").toString());
            orderSettleRequest.setFill_amount(new BigDecimal(jsonObject.get("fill_amount").toString()));
            orderSettleRequest.setCorrelation_order_id(jsonObject.get("correlation_order_id").toString());
            orderSettleRequest.setFill_price(new BigDecimal(jsonObject.get("fill_price").toString()));
            orderSettleRequest.setMarket_id(jsonObject.get("market_id").toString());
            orderSettleRequest.setNet_pn_l(new BigDecimal(jsonObject.get("net_pn_l").toString()));
            orderSettleRequest.setNet_return(new BigDecimal(jsonObject.get("net_return").toString()));
            orderSettleRequest.setOrder_id(jsonObject.get("correlation_order_id").toString());
            orderSettleRequest.setPlaced_result(jsonObject.get("placed_result").toString());
            orderSettleRequest.setPn_l(new BigDecimal(jsonObject.get("pn_l").toString()));
            orderSettleRequest.setRequest_amount(new BigDecimal(jsonObject.get("request_amount").toString()));
            orderSettleRequest.setRequest_price(new BigDecimal(jsonObject.get("request_price").toString()));
            orderSettleRequest.setSelection_id(jsonObject.get("selection_id").toString());
            orderSettleRequest.setSettled_result(jsonObject.get("settled_result").toString());
            orderSettleRequest.setSettled_time((Date)jsonObject.get("settled_time"));
            orderSettleRequest.setStatus(jsonObject.get("status").toString());
            orderSettleRequest.setSubmitted_time((Date)jsonObject.get("correlation_order_id"));
            orderSettleRequest.setVendor_player_id(jsonObject.get("vendor_player_id").toString());
            orderDomain.settle(orderSettleRequest);
        }else if("EventMarketsChangedNotification".equals(callbackRequest.getType())){
            JSONObject jsonObject = JSONObject.parseObject(callbackRequest.getContent());
            MarketChangeRequest request = new MarketChangeRequest();
            request.setMarketId(jsonObject.get("market_id").toString());
            request.setBettingDelay(jsonObject.get("betting_delay").toString());
            request.setOpenResult(jsonObject.get("open_result").toString());
            request.setPeriodBegin(jsonObject.get("period_begin").toString());
            request.setPeriodEnd(jsonObject.get("period_end").toString());
            request.setPeriodType(jsonObject.get("period_type").toString());
            request.setPeriodValue(jsonObject.get("period_value").toString());
            request.setQuotaAppetite(jsonObject.get("quota_appetite").toString());
            request.setRuleType(jsonObject.get("rule_type").toString());
            request.setSettledResult(jsonObject.get("settled_result").toString());
            request.setVerifyResult(jsonObject.get("verify_result").toString());
            List<JSONObject> selectionList = (List<JSONObject>)jsonObject.get("selection");

            List<MarketChangeSelectionRequest> list = new ArrayList<MarketChangeSelectionRequest>();
            for(JSONObject selection:selectionList){
                MarketChangeSelectionRequest marketChangeSelectionRequest = new MarketChangeSelectionRequest();
                marketChangeSelectionRequest.setBackOdds(selection.get("back_odds").toString());
                marketChangeSelectionRequest.setMaxStakeLimit(selection.get("max_stake_limit").toString());
                marketChangeSelectionRequest.setLastBackOdds(selection.get("last_back_odds").toString());
                marketChangeSelectionRequest.setSelectionId(selection.get("selection_id").toString());
                list.add(marketChangeSelectionRequest);
            }
            request.setMarketChangeSelectionRequestList(list);
            marketDomain.EventMarketsChanged(request);
        }
    }

}
