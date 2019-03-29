package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.dao.mapper.SubscribeEventMapper;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.SubscribeEvent;
import com.mifan.guessing.dao.model.SubscribeEventExample;
import com.mifan.guessing.domain.manager.PushManager;
import com.mifan.guessing.domain.manager.RollingBallManager;
import com.mifan.guessingapi.exception.GuessingErrorCode;
import com.mifan.guessingapi.exception.GuessingRunTimeException;
import com.mifan.guessingapi.request.event.CancleSubscribeRequest;
import com.mifan.guessingapi.request.event.EventListRequest;
import com.mifan.guessingapi.request.event.SubscribeEventListRequest;
import com.mifan.guessingapi.request.event.SubscribeEventRequest;
import com.mifan.guessingapi.response.event.EventListResponse;
import com.mifan.guessingapi.response.event.SubscribeEventListResponse;
import com.mifan.guessingutils.BeanMapper;
import com.mifan.guessingutils.DateUtils;
import com.mifan.guessingutils.IdMakerUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
public class EventDomain {

    private static Logger logger = LogManager.getLogger( EventDomain.class );

    @Autowired
    private RollingBallManager rollingBallManager;
    @Autowired
    private SubscribeEventMapper subscribeEventMapper;
//    @Autowired
//    private SmsManager smsManager;
    @Autowired
    private UserService userService;
    @Autowired
    private PushManager pushManager;

    /**
     * 赛事活动列表
     * @param eventListRequest
     * @return
     */
    public PageInfo<EventListResponse> eventList(EventListRequest eventListRequest) {

        //查询从今天开始四天之内的赛事
        Date date = new Date();
//        Date beginDate = DateUtils.paseDateYYYYMMDD(date);
        Date beginDate = new Date();
        Date endDate = DateUtils.addDays(beginDate,4);
        PageHelper.startPage(eventListRequest.getPageNum(), eventListRequest.getPageSize(),true);
        List<Event> events = rollingBallManager.eventList(beginDate, endDate);
        PageInfo<EventListResponse> repageList = new PageInfo(events);
        int totalPages = new BigDecimal(events.size()).divide(new BigDecimal(10),BigDecimal.ROUND_UP).intValue() ;
        int startIndex = 0;
        if(eventListRequest.getPageNum() > totalPages){
            startIndex = (totalPages-1) * eventListRequest.getPageSize();
        }else {
            startIndex =  (eventListRequest.getPageNum()-1) * eventListRequest.getPageSize();
        }
        int endIndex =  (eventListRequest.getPageNum()) * eventListRequest.getPageSize() - 1;
        if(endIndex>events.size()){
            endIndex = events.size();
        }
        List<Event> resultList = events.subList(startIndex,endIndex);
        List<EventListResponse> eventList = BeanMapper.mapList(resultList, EventListResponse.class);
        repageList.setList(eventList);
        int pages = new BigDecimal(events.size()).divide(new BigDecimal(eventListRequest.getPageSize()),BigDecimal.ROUND_UP).intValue();
        repageList.setPages(pages);
        repageList.setPageSize(eventListRequest.getPageSize());
        repageList.setTotal(events.size());
        return repageList;
    }

    /**
     * 预约赛事
     * @param subscribeEventRequest
     * @return
     */
    public Integer subscribeEvent(SubscribeEventRequest subscribeEventRequest) {


        SubscribeEventExample subscribeEventExample = new SubscribeEventExample();
        SubscribeEventExample.Criteria criteria = subscribeEventExample.createCriteria();
        criteria.andUserCodeEqualTo(subscribeEventRequest.getUserCode());
        criteria.andEventIdEqualTo(subscribeEventRequest.getEventId());
        criteria.andDeletedEqualTo(0);
        int count = subscribeEventMapper.countByExample(subscribeEventExample);
        if(count > 0){
            throw new GuessingRunTimeException(GuessingErrorCode.SUBSCRIBE_REPEAT);
        }
        SubscribeEvent subscribeEvent = BeanMapper.map(subscribeEventRequest,SubscribeEvent.class);
        User user = userService.getUserByUserId(subscribeEvent.getUserCode());
//        User user = new User();
        subscribeEvent.setId(IdMakerUtils.getOrderId());
        subscribeEvent.setCreateTime(new Date());
        subscribeEvent.setPhone(user.getPhone());
        subscribeEvent.setDeleted(0);
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
        Date paseDate = DateUtils.paseDate(date);
        eventExample.createCriteria().andEventTimeEqualTo(paseDate).andDeletedEqualTo(0);
        List<SubscribeEvent> subscribeEvents = subscribeEventMapper.selectByExample(eventExample);
        for(SubscribeEvent subscribeEvent : subscribeEvents){
            logger.debug("push发送："+subscribeEvent.getId());
            try{
                String pushContent = "您预约的比赛'"+subscribeEvent.getHomeTeamName()+"vs"+subscribeEvent.getAwayTeamName()+"'还有五分钟就要开始了";
                pushManager.pushSingle(subscribeEvent.getClientId(),pushContent);
            }catch (Exception e){
                logger.error("push发送异常"+subscribeEvent.getId(),e);
            }

//            smsManager.sendSms(subscribeEvent.getPhone(),"您预约的比赛'"+subscribeEvent.getHomeTeamName()+"vs"+subscribeEvent.getAwayTeamName()+"'还有五分钟就要开始了");
        }
    }

    public PageInfo<SubscribeEventListResponse> subscribeEventList(SubscribeEventListRequest subscribeEventListRequest) {
        SubscribeEventExample example = new SubscribeEventExample();
        example.setOrderByClause(" event_time desc ");
        SubscribeEventExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(subscribeEventListRequest.getUserCode()).andDeletedEqualTo(0);
        PageHelper.startPage(subscribeEventListRequest.getPageNum(), subscribeEventListRequest.getPageSize(),true);
        List<SubscribeEvent> subscribeEvents = subscribeEventMapper.selectByExample(example);
        PageInfo<SubscribeEventListResponse> pageList = new PageInfo(subscribeEvents);
        pageList.setList(BeanMapper.mapList(subscribeEvents,SubscribeEventListResponse.class));
        return pageList;
    }

    public Integer cancleSubscribeEvent(CancleSubscribeRequest cancleSubscribeRequest) {
        SubscribeEvent subscribeEvent = new SubscribeEvent();
        subscribeEvent.setId(cancleSubscribeRequest.getSubscribeEventId());
        subscribeEvent.setDeleted(1);
        int result = subscribeEventMapper.updateByPrimaryKeySelective(subscribeEvent);
        return result;
    }
}
