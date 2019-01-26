package com.mifan.guessing.domain.manager;

/**
 * @auther wangbinlei
 * @create 2018/12/6
 */
public class RollingBallRequestUrl {

    //赛事列表
    public static String eventList = "http://sendbox.api.987games.com/Api/getEventList";
    //赛事详情
    public static String eventInfo = "http://sendbox.api.987games.com/api/eventInfo";
    //
    public static String eventMarkets = "http://sendbox.io.987games.com";

    public static String tradeOrderPlace = "http://sendbox.api.987games.com/api/tradeOrderPlace";

    public static String tradeOrderCancel = "http://sendbox.api.987games.com/api/tradeOrderCancel";

    public static String pushEventSubscription = "http://sendbox.api.987games.com/api/tradeOrderInfo ";

    public static String tradeOrderInfo = "http://sendbox.api.987games.com/api/tradeOrderList";

    public static String tradeOrderList = "http://sendbox.api.987games.com/api/pushEventSubscribe";

    public static String pushEventSubscribe = "http://sendbox.api.987games.com/api/pushEventSubscription";

    public static String pushEventUnSubscribe = "http://sendbox.api.987games.com/api/pushEventUnSubscribe";

}
