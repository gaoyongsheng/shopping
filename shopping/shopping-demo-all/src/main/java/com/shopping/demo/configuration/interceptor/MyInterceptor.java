package com.shopping.demo.configuration.interceptor;

import com.shopping.demo.utils.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(MyInterceptor.class);

    /*{
        content-type:application/json,
        serviceId:username,
        signInfo: sha5加密(username + password(MD5加密转大写))
        ts:当前请求的时间戳（毫秒）
    }*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String serviceId = request.getHeader("serviceId").trim();
        String signInfo = request.getHeader("signInfo").trim();
        String ts = request.getHeader("ts").trim();
        String reqBody = Util.getReqBodyStrByHeader(request);

        LOG.info("************serviceId************[{}]",serviceId);
        LOG.info("************signInfo*************[{}]",signInfo);
        LOG.info("************reqBody**************[{}]",reqBody);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("afterCompletion");
    }
}
