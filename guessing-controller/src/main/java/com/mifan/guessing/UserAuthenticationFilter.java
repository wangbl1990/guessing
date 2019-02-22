package com.mifan.guessing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;
import tv.zhangyu.login.LoginUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserAuthenticationFilter extends OncePerRequestFilter {
    private static final Logger logger = LogManager.getLogger( UserAuthenticationFilter.class );

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ServletRequest requestWrapper = null;
        String userId = "" ;
        try {
            //从cookie中获取用户ID
            //userId = LoginUtils.tryAutoLogin(request,response);
            userId = "123456789";
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