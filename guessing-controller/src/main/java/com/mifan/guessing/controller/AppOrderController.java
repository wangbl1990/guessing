package com.mifan.guessing.controller;

import com.mifan.guessing.domain.OrderDomain;
import com.mifan.guessingapi.request.order.SubmitOrderRequest;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.order.SubmitOrderResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/app/select")
public class AppOrderController extends BaseController {

    private static Logger logger = LoggerFactory.getLogger( AppOrderController.class );

    @Autowired
    private OrderDomain orderDomain;

    @ApiOperation(value = "下注" , notes = "下注" )
    @ApiImplicitParam(name = "submitOrderRequest" , value = "下注" , required = true , dataType = "SubmitOrderRequest" )
    @RequestMapping( value = "/submitOrder" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Access
    public BaseResponse<SubmitOrderResponse> submitOrder(@RequestBody @Validated final SubmitOrderRequest submitOrderRequest ){
        SubmitOrderResponse result = orderDomain.submitOrder(submitOrderRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
