package com.mifan.guessing.domain.enums;

public enum SportType {

    FOOTBALL("1","FOOTBALL"),
    ;

    private String code;
    private String message;

    SportType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
