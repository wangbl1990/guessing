package com.mifan.guessingapi.exception;

public enum GuessingErrorCode {

    SUCCESS(0, "成功"),
    SYSTEM_ERROR(700, "系统异常"),
    NOT_LOGIN(203, "用户没登录"),
    SUBSCRIBE_REPEAT(204, "已预约成功，请勿重复预约"),
    MOENY_NOT_ENOUGH(205, "您的账户余额不足"),
    ;

    private int value;
    private String message;

    GuessingErrorCode(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public static GuessingErrorCode getErrorCode(int code){
        for(GuessingErrorCode obj : GuessingErrorCode.class.getEnumConstants()){
            if( obj.getValue() ==  code  ){
                return obj ;
            }
        }
        return null ;
    }
}
