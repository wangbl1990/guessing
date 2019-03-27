package com.mifan.guessingutils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static Date parseDate(Object dateObj){

        if(null == dateObj){
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateObj.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date paseDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        Date formatDate = null;
        try {
            formatDate = simpleDateFormat.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatDate;
    }
}
