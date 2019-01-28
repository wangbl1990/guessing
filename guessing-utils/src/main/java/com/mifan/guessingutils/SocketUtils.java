package com.mifan.guessingutils;


import com.alibaba.fastjson.JSONObject;
import io.socket.client.IO;
import io.socket.emitter.Emitter;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2019/1/25
 */
@Component
public class SocketUtils {

    public static String getData(String eventId){
        IO.Options options = new IO.Options();
        options.transports = new String[]{"websocket"};
        options.reconnectionAttempts = 2;
        //失败重连的时间间隔
        options.reconnectionDelay = 1000;
        //连接超时时间(ms)
        options.timeout = 500;

        List<String> resultList = new ArrayList<String>();
        try {
            final Socket socket = IO.socket("http://sendbox.io.987games.com",options);
            socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    System.out.println(DateUtils.paseDateYYYYMMDD(new Date()) + ":client connect! ");
                    socket.emit("event_markets", eventId);
                }
            });

            socket.on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    System.out.println(DateUtils.paseDateYYYYMMDD(new Date()) + ":client disconnect!");
                }
            });

            socket.on("event_markets", new Emitter.Listener() {
                @Override
                public void call(Object... args) {
//                    for (Object obj : args) {
                        Object obj = args[0];
                        System.out.println(DateUtils.paseDateYYYYMMDD(new Date()) + ":receive server message=" + obj);
                        resultList.add(args.toString());
//                    }
                }
            });
            socket.connect();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args){

        SocketUtils.getData("19879");
    }
}
