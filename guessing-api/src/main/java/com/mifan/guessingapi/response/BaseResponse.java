package com.mifan.guessingapi.response;

import com.mifan.guessingapi.exception.GuessingErrorCode;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable{

    private static final long serialVersionUID = 1L;

    private int responseCode;

    private String responseMsg;

    private T result;

    public BaseResponse(){ }
    public BaseResponse(int responseCode, String responseMsg, T result) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        this.result = result;
    }
    //这两个方法写在这里纯粹为了省地儿
    public static BaseResponse generateOKResponseEntity(Object object) {
        return new BaseResponse(GuessingErrorCode.SUCCESS.getValue(), "Success", object);
    }

    public static BaseResponse generateBadResponseEntity(String message, Object object) {
        return new BaseResponse<>(GuessingErrorCode.SYSTEM_ERROR.getValue(), message, object);
    }

    public static BaseResponse generateBadResponseEntity(int code, String message, Object object) {
        return new BaseResponse<>(code, message, object);
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public T getResult() {
        return result;
    }
}


