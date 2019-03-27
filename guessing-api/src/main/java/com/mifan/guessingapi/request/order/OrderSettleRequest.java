package com.mifan.guessingapi.request.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}