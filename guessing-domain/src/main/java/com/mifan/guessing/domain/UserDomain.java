package com.mifan.guessing.domain;

import org.springframework.beans.factory.annotation.Autowired;
import tv.zhangyu.rpcservice.MoneyService;

/**
 * @auther wangbinlei
 * @create 2019/3/26
 */
public class UserDomain {

    @Autowired
    private MoneyService moneyService;
}
