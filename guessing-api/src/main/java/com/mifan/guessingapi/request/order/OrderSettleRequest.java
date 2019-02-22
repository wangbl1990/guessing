package com.mifan.guessingapi.request.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderSettleRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String vendor_id;//合作商ID
    private String vendor_order_id;//合作商订单号
    private String vendor_player_id;//合作商⽤用户ID
    private String event_id;//赛事ID
    private String market_id;//市场ID
    private String rule_type;//投注玩法
    private String selection_id;//选项ID
    private String selection_type;//选项描述
    private BigDecimal request_amount;//下单⾦金金额：分
    private BigDecimal request_price;//下单赔率
    private Date request_time;//下单时间
    private BigDecimal accepted_amount;//接单金额：分
    private BigDecimal accepted_price;//接单价格：赔率
    private String accepted_odds;//接单盘口
    private String accepted_result;//接单时比分
    private Date accepted_time;//接单时间
    private String placed_result;//验证参数
    private String status;//订单状态
    private String settled_result;//结算结果
    private Date settled_time;//结算时间
    private Date rejected_time;//拒单时间
    private Date cancelled_time;//取消时间
    private Date invalid_time;//无效时间
    private BigDecimal net_return;//中奖额度 分
    private BigDecimal net_pn_l;//净盈亏

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_order_id() {
        return vendor_order_id;
    }

    public void setVendor_order_id(String vendor_order_id) {
        this.vendor_order_id = vendor_order_id;
    }

    public String getVendor_player_id() {
        return vendor_player_id;
    }

    public void setVendor_player_id(String vendor_player_id) {
        this.vendor_player_id = vendor_player_id;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getMarket_id() {
        return market_id;
    }

    public void setMarket_id(String market_id) {
        this.market_id = market_id;
    }

    public String getRule_type() {
        return rule_type;
    }

    public void setRule_type(String rule_type) {
        this.rule_type = rule_type;
    }

    public String getSelection_id() {
        return selection_id;
    }

    public void setSelection_id(String selection_id) {
        this.selection_id = selection_id;
    }

    public String getSelection_type() {
        return selection_type;
    }

    public void setSelection_type(String selection_type) {
        this.selection_type = selection_type;
    }

    public BigDecimal getRequest_amount() {
        return request_amount;
    }

    public void setRequest_amount(BigDecimal request_amount) {
        this.request_amount = request_amount;
    }

    public BigDecimal getRequest_price() {
        return request_price;
    }

    public void setRequest_price(BigDecimal request_price) {
        this.request_price = request_price;
    }

    public Date getRequest_time() {
        return request_time;
    }

    public void setRequest_time(Date request_time) {
        this.request_time = request_time;
    }

    public BigDecimal getAccepted_amount() {
        return accepted_amount;
    }

    public void setAccepted_amount(BigDecimal accepted_amount) {
        this.accepted_amount = accepted_amount;
    }

    public BigDecimal getAccepted_price() {
        return accepted_price;
    }

    public void setAccepted_price(BigDecimal accepted_price) {
        this.accepted_price = accepted_price;
    }

    public String getAccepted_odds() {
        return accepted_odds;
    }

    public void setAccepted_odds(String accepted_odds) {
        this.accepted_odds = accepted_odds;
    }

    public String getAccepted_result() {
        return accepted_result;
    }

    public void setAccepted_result(String accepted_result) {
        this.accepted_result = accepted_result;
    }

    public Date getAccepted_time() {
        return accepted_time;
    }

    public void setAccepted_time(Date accepted_time) {
        this.accepted_time = accepted_time;
    }

    public String getPlaced_result() {
        return placed_result;
    }

    public void setPlaced_result(String placed_result) {
        this.placed_result = placed_result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSettled_result() {
        return settled_result;
    }

    public void setSettled_result(String settled_result) {
        this.settled_result = settled_result;
    }

    public Date getSettled_time() {
        return settled_time;
    }

    public void setSettled_time(Date settled_time) {
        this.settled_time = settled_time;
    }

    public Date getRejected_time() {
        return rejected_time;
    }

    public void setRejected_time(Date rejected_time) {
        this.rejected_time = rejected_time;
    }

    public Date getCancelled_time() {
        return cancelled_time;
    }

    public void setCancelled_time(Date cancelled_time) {
        this.cancelled_time = cancelled_time;
    }

    public Date getInvalid_time() {
        return invalid_time;
    }

    public void setInvalid_time(Date invalid_time) {
        this.invalid_time = invalid_time;
    }

    public BigDecimal getNet_return() {
        return net_return;
    }

    public void setNet_return(BigDecimal net_return) {
        this.net_return = net_return;
    }

    public BigDecimal getNet_pn_l() {
        return net_pn_l;
    }

    public void setNet_pn_l(BigDecimal net_pn_l) {
        this.net_pn_l = net_pn_l;
    }
}