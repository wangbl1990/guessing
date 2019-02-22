package com.mifan.guessing.controller;

import com.alibaba.fastjson.JSONObject;
import com.mifan.guessing.domain.MarketDomain;
import com.mifan.guessing.domain.OrderDomain;
import com.mifan.guessingapi.request.callback.CallbackRequest;
import com.mifan.guessingapi.request.market.MarketChangeRequest;
import com.mifan.guessingapi.request.market.MarketChangeSelectionRequest;
import com.mifan.guessingapi.request.order.OrderSettleRequest;
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
            OrderSettleRequest orderSettleRequest = new OrderSettleRequest();
            orderSettleRequest.setVendor_id(jsonObject.get("vendor_id").toString());
            orderSettleRequest.setVendor_order_id(jsonObject.get("vendor_order_id").toString());
            orderSettleRequest.setVendor_player_id(jsonObject.get("vendor_player_id").toString());
            orderSettleRequest.setEvent_id(jsonObject.get("event_id").toString());
            orderSettleRequest.setMarket_id(jsonObject.get("market_id").toString());
            orderSettleRequest.setRule_type(jsonObject.get("rule_type").toString());
            orderSettleRequest.setSelection_id(jsonObject.get("selection_id").toString());
            orderSettleRequest.setSelection_type(jsonObject.get("selection_type").toString());
            orderSettleRequest.setRequest_amount(new BigDecimal(jsonObject.get("request_amount").toString()));
            orderSettleRequest.setRequest_price(new BigDecimal(jsonObject.get("request_price").toString()));
            orderSettleRequest.setRequest_time((Date)jsonObject.get("request_time"));
            orderSettleRequest.setAccepted_amount(new BigDecimal(jsonObject.get("accepted_amount").toString()));
            orderSettleRequest.setAccepted_price(new BigDecimal(jsonObject.get("accepted_price").toString()));
            orderSettleRequest.setAccepted_odds(jsonObject.get("accepted_odds").toString());
            orderSettleRequest.setAccepted_result(jsonObject.get("accepted_result").toString());
            orderSettleRequest.setAccepted_time((Date)jsonObject.get("accepted_time"));
            orderSettleRequest.setPlaced_result(jsonObject.get("placed_result").toString());
            orderSettleRequest.setStatus(jsonObject.get("status").toString());
            orderSettleRequest.setSettled_result(jsonObject.get("settled_result").toString());
            orderSettleRequest.setSettled_time((Date)jsonObject.get("settled_time"));
            orderSettleRequest.setRejected_time((Date)jsonObject.get("rejected_time"));
            orderSettleRequest.setCancelled_time((Date)jsonObject.get("cancelled_time"));
            orderSettleRequest.setInvalid_time((Date)jsonObject.get("invalid_time"));
            orderSettleRequest.setNet_return(new BigDecimal(jsonObject.get("net_return").toString()));
            orderSettleRequest.setNet_pn_l(new BigDecimal(jsonObject.get("net_pn_l").toString()));
            orderDomain.settle(orderSettleRequest);
            System.out.println(str);
        }catch (Exception e){
            logger.error(e);
        }
        return "ok";
    }

}
