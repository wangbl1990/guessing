package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.MarketDomain;
import com.mifan.guessing.domain.OrderDomain;
import com.mifan.guessing.domain.model.EventMarket;
import com.mifan.guessingapi.request.event.EventListRequest;
import com.mifan.guessingapi.request.market.MarketListRequest;
import com.mifan.guessingapi.request.order.MyOrderListRequest;
import com.mifan.guessingapi.request.order.SubmitOrderRequest;
import com.mifan.guessingapi.response.event.EventListResponse;
import com.mifan.guessingapi.response.order.MyOrderListResponse;
import com.mifan.guessingutils.MD5Utils;
import com.mifan.guessingutils.SocketUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
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
    private OrderDomain orderDomain;
//    @Autowired
//    private SocketUtils socketUtils;

    @Test
    public void eventList() throws UnsupportedEncodingException {
        EventListRequest request = new EventListRequest();
        request.setPageNum(1);
        request.setPageSize(10);
        PageInfo<EventListResponse> eventListResponsePageInfo = eventDomain.eventList(request);
        System.out.println(eventListResponsePageInfo);
    }

    @Test
    public void eventMarket(){
        MarketListRequest request = new MarketListRequest();
        request.setEnvetId("19879");
        marketDomain.marketList(request);
    }

    @Test
    public void order(){
        SubmitOrderRequest request = new SubmitOrderRequest();
        request.setUserCode("123456789");
        request.setEventId("19879");
        request.setEventName("东北联-泰坦");
        request.setSportId("1");
        request.setSelectionId("476201");
        request.setMarketId("207782");
        request.setRequestAmount(new BigDecimal(100));
        request.setRequestPrice(new BigDecimal(2.87));
        orderDomain.submitOrder(request);
    }

    @Test
    public void myOrderList(){
        MyOrderListRequest request = new MyOrderListRequest();
        request.setPageNum(1);
        request.setPageSize(10);
        request.setUserCode("123456789");
        PageInfo<MyOrderListResponse> myOrderListResponse = orderDomain.myOrderList(request);
        System.out.print(myOrderListResponse);

    }

    @Test
    public void Md5(){
//        String encode = MD5Utils.encode("vendor_id=mf&request_time=1548333671&mi%fan#4bg35n6e");
        String encode = DigestUtils.md5Hex("vendor_id=mf&request_time=1548333671&mi%fan#4bg35n6e");
        System.out.println(encode);
    }

}
