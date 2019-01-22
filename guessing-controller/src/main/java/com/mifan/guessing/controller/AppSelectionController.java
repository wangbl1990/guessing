package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessingapi.request.event.EventListRequest;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.event.EventListResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/app/select")
public class AppSelectionController extends BaseController {

    private static Logger logger = LogManager.getLogger( AppSelectionController.class );
    @Autowired
    private EventDomain eventDomain;

    public BaseResponse<EventListResponse> eventList(@RequestBody @Validated final EventListRequest eventListRequest ){

        PageInfo<EventListResponse> result = eventDomain.eventList(eventListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
