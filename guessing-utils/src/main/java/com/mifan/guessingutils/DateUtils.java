package com.mifan.guessingutils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static long getUnixDate(){
        //初始化时区对象，北京时间是UTC+8，所以入参为8
        ZoneOffset zoneOffset=ZoneOffset.ofHours(8);
        // 初始化LocalDateTime对象
        LocalDateTime localDateTime=LocalDateTime.now();
        //获取LocalDateTime对象对应时区的Unix时间戳
        long unixTimeStamp = localDateTime.toEpochSecond(zoneOffset);
        return unixTimeStamp;
    }

    public static Date addDays(Date date,int day){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        Date resultDate = c.getTime();
        return resultDate;
    }

    public static Date addMinutes(Date date,int minutes){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, minutes);
        c.set(Calendar.SECOND, 00);
        Date resultDate = c.getTime();
        return resultDate;
    }


    public static Date paseDateYYYYMMDD(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 00);
        c.set(Calendar.MINUTE, 00);
        c.set(Calendar.SECOND, 00);
        Date resultDate = c.getTime();
        return resultDate;
    }

}
