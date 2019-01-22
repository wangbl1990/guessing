package com.mifan.guessing.domain.enums;

public enum EventType {

    ALL("ALL","全部"),
    ZHONGCHAO("ZHONGCHAO","中超"),
    XIJIA("XIJIA","西甲"),
    DEJIA("DEJIA","德甲"),
    OUGUAN("OUGUAN","欧冠"),
    ;

    private String code;
    private String message;

    EventType(String code, String message) {
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
