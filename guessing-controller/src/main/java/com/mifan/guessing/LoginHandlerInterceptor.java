package com.mifan.guessing;

import com.mifan.guessing.controller.Access;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    private static final PathMatcher pathMatcher = new AntPathMatcher();

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod) o;
        // 从方法处理器中获取出要调用的方法
        Method method = handlerMethod.getMethod();
        // 获取出方法上的Access注解
        Access access = method.getAnnotation(Access.class);
        String userId = (String) httpServletRequest.getAttribute( "userId" );
        if (access == null) {
            // 如果注解为null, 说明不需要拦截, 直接放过
            return true;
        }
        if ( StringUtils.isNotBlank(access.value())) {
            //取得用户编号
            if(StringUtils.isNotBlank( userId )) {
                return true;
            }else{
                httpServletRequest.setAttribute("error" , Boolean.TRUE );
            }
        }
        // 拦截之后应该返回公共结果, 这里没做处理
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }

    public String charReader(HttpServletRequest request) throws IOException {
        BufferedReader br = request.getReader();
        String str, wholeStr = "";
        while((str = br.readLine()) != null){
            wholeStr += str;
        }
        return wholeStr;
    }
}