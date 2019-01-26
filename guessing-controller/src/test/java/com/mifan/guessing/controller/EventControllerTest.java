package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.MarketDomain;
import com.mifan.guessing.domain.model.EventMarket;
import com.mifan.guessingapi.request.event.EventListRequest;
import com.mifan.guessingapi.request.market.MarketListRequest;
import com.mifan.guessingapi.response.event.EventListResponse;
import com.mifan.guessingutils.MD5Utils;
import com.mifan.guessingutils.SocketUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @auther wangbinlei
 * @create 2019/1/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={GuessingApplication.class})// 指定启动类
public class EventControllerTest {

    @Autowired
    private EventDomain eventDomain;
    @Autowired
    private MarketDomain marketDomain;
    @Autowired
    private SocketUtils socketUtils;

    @Test
    public void eventList() throws UnsupportedEncodingException {
        EventListRequest request = new EventListRequest();
        request.setPageNum(1);
        request.setPageSize(10);
        PageInfo<EventListResponse> eventListResponsePageInfo = eventDomain.eventList(request);

//        String decode = URLDecoder.decode("\u975e\u6cd5\u8bf7\u6c42", "UTF-8");
        System.out.println(eventListResponsePageInfo);
    }

    @Test
    public void eventMarket(){
        MarketListRequest request = new MarketListRequest();
        request.setEnvetId("17175");
        marketDomain.marketList(request);
    }

    @Test
    public void Md5(){
//        String encode = MD5Utils.encode("vendor_id=mf&request_time=1548333671&mi%fan#4bg35n6e");
        String encode = DigestUtils.md5Hex("vendor_id=mf&request_time=1548333671&mi%fan#4bg35n6e");
        System.out.println(encode);
    }

    @Test
    public void socket(){
        socketUtils.getData("http://sendbox.io.987games.coms");
    }
}
