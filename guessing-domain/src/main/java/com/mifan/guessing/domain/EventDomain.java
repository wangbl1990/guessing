package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.dao.mapper.EventMapper;
import com.mifan.guessing.dao.mapper.SubscribeEventMapper;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.EventExample;
import com.mifan.guessing.dao.model.SubscribeEvent;
import com.mifan.guessing.dao.model.SubscribeEventExample;
import com.mifan.guessing.domain.manager.RollingBallManager;
import com.mifan.guessing.domain.manager.SmsManager;
import com.mifan.guessingapi.request.event.EventDetailRequest;
import com.mifan.guessingapi.request.event.EventListRequest;
import com.mifan.guessingapi.request.event.SubscribeEventRequest;
import com.mifan.guessingapi.response.event.EventListResponse;
import com.mifan.guessingutils.BeanMapper;
import com.mifan.guessingutils.DateUtils;
import com.mifan.guessingutils.IdMakerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class EventDomain {

    @Autowired
    private EventMapper eventMapper;
    @Autowired
    private RollingBallManager rollingBallManager;
    @Autowired
    private SubscribeEventMapper subscribeEventMapper;
    @Autowired
    private SmsManager smsManager;

    /**
     * 赛事活动列表
     * @param eventListRequest
     * @return
     */
    public PageInfo<EventListResponse> eventList(EventListRequest eventListRequest) {

        //查询从今天开始四天之内的赛事
        Date date = new Date();
        Date beginDate = DateUtils.paseDateYYYYMMDD(date);
        Date endDate = DateUtils.addDays(beginDate,4);
        PageHelper.startPage(eventListRequest.getPageNum(), eventListRequest.getPageSize(),true);
        List<Event> events = rollingBallManager.eventList(beginDate, endDate);
        PageInfo<EventListResponse> repageList = new PageInfo(events);
        List<EventListResponse> eventList = BeanMapper.mapList(events, EventListResponse.class);
        repageList.setList(eventList.subList(eventListRequest.getPageNum()-1,eventListRequest.getPageNum() + eventListRequest.getPageSize() -1));
        return repageList;
    }

    /**
     * 赛事详情查询
     * @param eventDetailRequest
     * @return
     */
    public EventListResponse eventDetail(EventDetailRequest eventDetailRequest) {
//        Event event = eventMapper.selectByPrimaryKey(eventDetailRequest.getEventId());
        Event event = rollingBallManager.eventInfo(eventDetailRequest.getEventId());
        return BeanMapper.map(event,EventListResponse.class);
    }

    /**
     * 预约赛事
     * @param subscribeEventRequest
     * @return
     */
    public Integer subscribeEvent(SubscribeEventRequest subscribeEventRequest) {

        SubscribeEvent subscribeEvent = BeanMapper.map(subscribeEventRequest,SubscribeEvent.class);
        subscribeEvent.setId(IdMakerUtils.getOrderId());
        subscribeEvent.setCreateTime(new Date());
        int result = subscribeEventMapper.insertSelective(subscribeEvent);
        return result;
    }

    /**
     * 发送预约短信
     */
    public void sendSubscribeMsg(){
        //查询5分钟后开始的比赛
        SubscribeEventExample eventExample = new SubscribeEventExample();
        Date date = DateUtils.addMinutes(new Date(),5);
        eventExample.createCriteria().andEventTimeEqualTo(date);
        List<SubscribeEvent> subscribeEvents = subscribeEventMapper.selectByExample(eventExample);
        for(SubscribeEvent subscribeEvent : subscribeEvents){
            smsManager.sendSms(subscribeEvent.getPhone(),"");
        }
    }
}
