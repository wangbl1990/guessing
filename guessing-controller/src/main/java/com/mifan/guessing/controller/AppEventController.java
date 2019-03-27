package com.mifan.guessing.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.enums.EventType;
import com.mifan.guessingapi.request.event.*;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.event.EventListResponse;
import com.mifan.guessingapi.response.event.SubscribeEventListResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/app/event")
public class AppEventController extends BaseController {

    private static Logger logger = LogManager.getLogger( AppEventController.class );

    @Autowired
    private EventDomain eventDomain;

    @ApiOperation(value = "赛事列表" , notes = "赛事列表" )
    @ApiImplicitParam(name = "eventListRequest" , value = "赛事列表" , required = true , dataType = "EventListRequest" )
    @RequestMapping( value = "/list" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<PageInfo<EventListResponse>> eventList(@RequestBody @Validated final EventListRequest eventListRequest ){
        logger.info("赛事列表入参"+ JSONObject.toJSONString(eventListRequest));
        PageInfo<EventListResponse> result = eventDomain.eventList(eventListRequest);
        logger.info("赛事列表出参"+ JSONObject.toJSONString(result));
        return BaseResponse.generateOKResponseEntity(result);
    }

//    @ApiOperation(value = "赛事详情" , notes = "赛事详情" )
//    @ApiImplicitParam(name = "eventDetailRequest" , value = "赛事详情" , required = true , dataType = "EventDetailRequest" )
//    @RequestMapping( value = "/eventDetail" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public BaseResponse<EventListResponse> eventDetail(@RequestBody @Validated final EventDetailRequest eventDetailRequest ){
//        EventListResponse result = eventDomain.eventDetail(eventDetailRequest);
//        return BaseResponse.generateOKResponseEntity(result);
//    }

    @ApiOperation(value = "赛事分类" , notes = "赛事分类" )
    @RequestMapping( value = "/eventType" , method = RequestMethod.POST ,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<List<String>> eventType(){
        List<String> eventList = new ArrayList<String>();
        for(EventType eventType:EventType.values()){
            eventList.add(eventType.getCode());
        }
        return BaseResponse.generateOKResponseEntity(eventList);
    }

    @ApiOperation(value = "预约赛事" , notes = "预约赛事" )
    @ApiImplicitParam(name = "subscribeEventRequest" , value = "预约赛事" , required = true , dataType = "SubscribeEventRequest" )
    @RequestMapping( value = "/subscribeEvent" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Access
    public BaseResponse<Integer> subscribeEvent(@RequestBody @Validated final SubscribeEventRequest subscribeEventRequest ){
        logger.info("预约赛事入参"+ JSONObject.toJSONString(subscribeEventRequest));
        Integer result = eventDomain.subscribeEvent(subscribeEventRequest);
        logger.info("预约赛事出参"+ JSONObject.toJSONString(result));
        return BaseResponse.generateOKResponseEntity(result);
    }

    @ApiOperation(value = "预约赛事列表" , notes = "预约赛事列表" )
    @ApiImplicitParam(name = "subscribeEventListRequest" , value = "预约赛事" , required = true , dataType = "SubscribeEventListRequest" )
    @RequestMapping( value = "/subscribeEventList" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Access
    public BaseResponse<PageInfo<SubscribeEventListResponse>> subscribeEvent(@RequestBody @Validated final SubscribeEventListRequest subscribeEventListRequest ){
        logger.info("预约赛事列表入参"+ JSONObject.toJSONString(subscribeEventListRequest));
        PageInfo<SubscribeEventListResponse> result = eventDomain.subscribeEventList(subscribeEventListRequest);
        logger.info("预约赛事列表出参"+ JSONObject.toJSONString(result));
        return BaseResponse.generateOKResponseEntity(result);
    }

    @ApiOperation(value = "取消预约" , notes = "取消预约" )
    @ApiImplicitParam(name = "cancleSubscribeRequest" , value = "取消预约" , required = true , dataType = "CancleSubscribeRequest" )
    @RequestMapping( value = "/cancleSubscribeEvent" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Access
    public BaseResponse<Integer> cancleSubscribeEvent(@RequestBody @Validated final CancleSubscribeRequest cancleSubscribeRequest ){
        logger.info("取消预约赛事入参"+ JSONObject.toJSONString(cancleSubscribeRequest));
        Integer result = eventDomain.cancleSubscribeEvent(cancleSubscribeRequest);
        logger.info("取消预约赛事出参"+ JSONObject.toJSONString(result));
        return BaseResponse.generateOKResponseEntity(result);
    }



}
