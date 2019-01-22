package com.mifan.guessing.domain.enums;

public enum OrderStatus {

    INIT("0","初始"),
    PAYED("1","已投注"),
    SETTLED("2","已结算"),
    CANCLE("3","已取消"),
    INVALID("4","订单无效"),
    REJECTED("5","订单被拒绝"),
    FAIL("6","投注失败"),
    ;

    private String code;
    private String message;

    OrderStatus(String code, String message) {
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
