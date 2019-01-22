package com.mifan.guessing.service;


import com.github.pagehelper.PageInfo;
import com.mifan.guessingapi.request.order.BossOrderListRequest;
import com.mifan.guessingapi.request.order.BossSettleOrderListRequest;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.order.BossOrderListResponse;
import com.mifan.guessingapi.response.order.BossSettleOrderListResponse;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
public interface OrderService {

    public BaseResponse<PageInfo<BossOrderListResponse>> orderList(BossOrderListRequest request);

    public BaseResponse<PageInfo<BossSettleOrderListResponse>> settleList(BossSettleOrderListRequest request);
}
