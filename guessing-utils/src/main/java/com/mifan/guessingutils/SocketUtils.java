package com.mifan.guessingutils;


import io.socket.client.IO;
//import io.socket.emitter.Emitter;
//import io.socket.engineio.client.Socket;
//import org.json.JSONObject;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.util.Date;

/**
 * @auther wangbinlei
 * @create 2019/1/25
 */
@Component
public class SocketUtils {

    public static void getData(String requestUrl){
//        Socket socket ;
//        try {
//            socket = new Socket(requestUrl);
//            socket.open();
//
//            // Receiving an object
//            socket.on("event_markets", new Emitter.Listener() {
//                @Override
//                public void call(Object... args) {
//                    JSONObject obj = (JSONObject)args[0];
//                    System.out.println(obj.toString());
//                }
//            });
//
////            JSONObject obj = new JSONObject();
////            obj.put("uuid", "123");
//            socket.emit("event_markets", "17175");
//
//            // Sending an object
//
////            while(true) {
////                System.out.println("===");
////                obj = new JSONObject();
////                obj.put("user_id", "xs01");
////                obj.put("user_name", "xs01");
////                obj.put("score", "100");
////
////                socket.emit("broadcast event", obj);
////                Thread.currentThread().sleep(1000);
////                socket.close();
////            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) throws URISyntaxException {

//        getData("http://sendbox.io.987games.com");

        IO.Options options = new IO.Options();
        options.transports = new String[]{"websocket"};
        options.reconnectionAttempts = 2;
        //失败重连的时间间隔
        options.reconnectionDelay = 1000;
        //连接超时时间(ms)
        options.timeout = 500;

        final Socket socket = IO.socket("http://sendbox.io.987games.com", options);

        socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println(DateUtils.paseDateYYYYMMDD(new Date()) + ":client connect! ");

                socket.emit("event_markets", "17175");
//                socket.send("hello server, my name is client");
            }
        });

        socket.on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println(DateUtils.paseDateYYYYMMDD(new Date()) + ":client disconnect!");
            }
        });

        socket.on(Socket.EVENT_MESSAGE, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                for (Object obj : args) {
                    System.out.println(DateUtils.paseDateYYYYMMDD(new Date()) + ":receive server message="+obj);
                }
            }
        });
        socket.connect();
    }
}
