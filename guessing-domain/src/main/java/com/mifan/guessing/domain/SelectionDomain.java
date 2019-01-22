package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.mifan.guessing.dao.mapper.EventMapper;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.EventExample;
import com.mifan.guessingapi.request.event.EventListRequest;
import com.mifan.guessingapi.response.event.EventListResponse;
import com.mifan.guessingutils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class SelectionDomain {

    @Autowired
    private EventMapper eventMapper;

    /**
     * 赛事活动列表
     * @param eventListRequest
     * @return
     */
    public PageInfo<EventListResponse> eventList(EventListRequest eventListRequest) {

        EventExample example = new EventExample();
        PageHelper.startPage(eventListRequest.getPageNum(), eventListRequest.getPageSize(),true);
        List<Event> events = eventMapper.selectByExample(example);
        PageInfo<EventListResponse> repageList = new PageInfo(events);
        List<EventListResponse> eventList = BeanMapper.mapList(events, EventListResponse.class);
        repageList.setList(eventList);
        return repageList;
    }
}
