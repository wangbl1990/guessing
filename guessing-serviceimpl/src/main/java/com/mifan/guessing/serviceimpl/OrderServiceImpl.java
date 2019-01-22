package com.mifan.guessing.serviceimpl;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.domain.OrderDomain;
import com.mifan.guessing.service.OrderService;
import com.mifan.guessingapi.request.order.BossOrderListRequest;
import com.mifan.guessingapi.request.order.BossSettleOrderListRequest;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.order.BossOrderListResponse;
import com.mifan.guessingapi.response.order.BossSettleOrderListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDomain orderDomain;

    @Override
    public BaseResponse<PageInfo<BossOrderListResponse>> orderList(BossOrderListRequest request) {
        PageInfo<BossOrderListResponse> result = orderDomain.orderList(request);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @Override
    public BaseResponse<PageInfo<BossSettleOrderListResponse>> settleList(BossSettleOrderListRequest request) {
        PageInfo<BossSettleOrderListResponse> result = orderDomain.settleOrderList(request);
        return BaseResponse.generateOKResponseEntity(result);
    }
}
