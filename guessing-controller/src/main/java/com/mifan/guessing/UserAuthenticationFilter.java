package com.mifan.guessing;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;
import tv.zhangyu.login.LoginUtils;
import tv.zhangyu.rpcservice.UserService;
import tv.zhangyu.rpcservice.base.User;
import tv.zhangyu.util.CookieUtils;
import tv.zhangyu.util.MD5Util;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserAuthenticationFilter extends OncePerRequestFilter {
    private static final Logger logger = LogManager.getLogger( UserAuthenticationFilter.class );

    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ServletRequest requestWrapper = null;
        String userId = "" ;
        try {
            //从cookie中获取用户ID
            User user = null;
            logger.info("cookies："+ JSONObject.toJSONString(request.getCookies()));
            String u = CookieUtils.getCookieValue(request.getCookies(), "u");
            String p = CookieUtils.getCookieValue(request.getCookies(), "p");
            if (u != null && p != null) {
                user = userService.getUserByUserId(u);
                logger.info("用户信息："+ JSONObject.toJSONString(user));
                if (user != null && StringUtils.isNotEmpty(user.getUpass())) {
                    String md5passMd5 = MD5Util.salt(user.getUpass(), user.getRandom());
                    if (!StringUtils.equals(p, md5passMd5)) {
                        user = null;
                    }
                }
            }
            if(null != user){
                userId = user.get_id();
            }
            logger.debug("从cookie中获取userId:"+userId);
//            userId = "123456789";
            request.setAttribute("userId", userId);
            if (request instanceof HttpServletRequest) {
                requestWrapper = new RequestWrapper((HttpServletRequest) request);
            }
        } catch (Exception e) {
            logger.error("token error:",e);
            if (request instanceof HttpServletRequest) {
                requestWrapper = new RequestWrapper((HttpServletRequest) request);
            }
        }
        HttpServletResponse resp = (HttpServletResponse) response;
        ResponseWrapper responseWrapper = new ResponseWrapper(resp); // 包装响应对象 resp 并缓存响应数据
        if (null == requestWrapper) {
            //如果jwt令牌通过了检测, 那么就把request传递给后面的RESTful api
            filterChain.doFilter(request, response);
        } else {
            filterChain.doFilter(requestWrapper, responseWrapper);
            byte[] bytes = responseWrapper.getBytes(); // 获取缓存的响应数据
            resp.getOutputStream().write( bytes ); // 将压缩数据响应给客户端
        }
    }
}