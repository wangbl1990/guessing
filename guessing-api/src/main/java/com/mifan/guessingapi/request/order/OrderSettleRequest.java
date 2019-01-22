package com.mifan.guessingapi.request.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderSettleRequest {

    private String order_id;//系统订单号唯⼀
    private String correlation_order_id;//合作商订单号唯⼀一
    private String vendor_player_id;//合作商⽤用户ID
    private String event_id;//赛事ID
    private String market_id;//市场ID
    private String selection_id;//⼦子项ID
    private BigDecimal request_amount;//下单⾦金金额：分
    private BigDecimal request_price;//下单价格：赔率
    private BigDecimal fill_amount;//接单⾦金金额：分
    private BigDecimal fill_price;//接单价格：赔率
    private String placed_result;//下单时⽐比分
    private String status;//订单状态
    private Date submitted_time;//下单时间
    private String settled_result;//结算结果
    private Date settled_time;//结算时间
    private BigDecimal pn_l;//结算盈亏
    private BigDecimal net_return;//净收⼊
    private BigDecimal net_pn_l;//净盈亏

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCorrelation_order_id() {
        return correlation_order_id;
    }

    public void setCorrelation_order_id(String correlation_order_id) {
        this.correlation_order_id = correlation_order_id;
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

    public String getSelection_id() {
        return selection_id;
    }

    public void setSelection_id(String selection_id) {
        this.selection_id = selection_id;
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

    public BigDecimal getFill_amount() {
        return fill_amount;
    }

    public void setFill_amount(BigDecimal fill_amount) {
        this.fill_amount = fill_amount;
    }

    public BigDecimal getFill_price() {
        return fill_price;
    }

    public void setFill_price(BigDecimal fill_price) {
        this.fill_price = fill_price;
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

    public Date getSubmitted_time() {
        return submitted_time;
    }

    public void setSubmitted_time(Date submitted_time) {
        this.submitted_time = submitted_time;
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

    public BigDecimal getPn_l() {
        return pn_l;
    }

    public void setPn_l(BigDecimal pn_l) {
        this.pn_l = pn_l;
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