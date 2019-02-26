package com.mifan.guessing.controller;

import com.alibaba.fastjson.JSONObject;
import com.mifan.guessing.domain.MarketDomain;
import com.mifan.guessing.domain.OrderDomain;
import com.mifan.guessingapi.request.callback.CallbackRequest;
import com.mifan.guessingapi.request.market.MarketChangeRequest;
import com.mifan.guessingapi.request.market.MarketChangeSelectionRequest;
import com.mifan.guessingapi.request.order.OrderSettleRequest;
import com.mifan.guessingutils.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/guessing")
public class CallbackController{

    private static Logger logger = LogManager.getLogger( CallbackController.class );

    @Autowired
    private OrderDomain orderDomain;
    @Autowired
    private MarketDomain marketDomain;

    @RequestMapping( value = "/callback" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String callback(HttpServletRequest request){
        try{
            StringBuffer sb = new StringBuffer() ;
            InputStream is = request.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = "" ;
            while((s=br.readLine())!=null){
                sb.append(s) ;
            }
            String str =sb.toString();
            logger.info("滚球推送参数："+str);
            JSONObject jsonObject = JSONObject.parseObject(str);
            JSONObject dataJson = (JSONObject) jsonObject.get("content");
            OrderSettleRequest orderSettleRequest = new OrderSettleRequest();
            orderSettleRequest.setVendor_id(dataJson.get("vendor_id").toString());
            orderSettleRequest.setVendor_order_id(dataJson.get("vendor_order_id").toString());
            orderSettleRequest.setVendor_player_id(dataJson.get("vendor_player_id").toString());
            orderSettleRequest.setEvent_id(dataJson.get("event_id").toString());
            orderSettleRequest.setMarket_id(dataJson.get("market_id").toString());
//            orderSettleRequest.setRule_type(dataJson.get("rule_type").toString());
            orderSettleRequest.setSelection_id(dataJson.get("selection_id").toString());
//            orderSettleRequest.setSelection_type(dataJson.get("selection_type").toString());
            orderSettleRequest.setRequest_amount(new BigDecimal(dataJson.get("request_amount").toString()));
            orderSettleRequest.setRequest_price(new BigDecimal(dataJson.get("request_price").toString()));
            orderSettleRequest.setRequest_time(DateUtils.parseDate(dataJson.get("request_time").toString()));
            orderSettleRequest.setAccepted_amount(new BigDecimal(dataJson.get("accepted_amount").toString()));
            orderSettleRequest.setAccepted_price(new BigDecimal(dataJson.get("accepted_price").toString()));
            orderSettleRequest.setAccepted_odds(dataJson.get("accepted_odds").toString());
            orderSettleRequest.setAccepted_result(dataJson.get("accepted_result").toString());
            orderSettleRequest.setAccepted_time(DateUtils.parseDate(dataJson.get("accepted_time")));
            orderSettleRequest.setPlaced_result(dataJson.get("placed_result").toString());
            orderSettleRequest.setStatus(dataJson.get("status").toString());
            orderSettleRequest.setSettled_result(null == dataJson.get("settled_result")?"":dataJson.get("settled_result").toString());
            orderSettleRequest.setSettled_time(DateUtils.parseDate(dataJson.get("settled_time")));
            orderSettleRequest.setRejected_time(DateUtils.parseDate(dataJson.get("rejected_time")));
            orderSettleRequest.setCancelled_time(DateUtils.parseDate(dataJson.get("cancelled_time")));
            orderSettleRequest.setInvalid_time(DateUtils.parseDate(dataJson.get("invalid_time")));
            orderSettleRequest.setNet_return(new BigDecimal(dataJson.get("net_return").toString()));
            orderSettleRequest.setNet_pn_l(new BigDecimal(dataJson.get("net_pn_l").toString()));
            if("2".equals(orderSettleRequest.getStatus())){
                //结算
                orderDomain.settle(orderSettleRequest);
            }else{
                //订单确认
                orderDomain.orderConfirm(orderSettleRequest);
            }

            System.out.println(str);
        }catch (Exception e){
            logger.error("结算异常",e);
        }
        return "ok";
    }

}
