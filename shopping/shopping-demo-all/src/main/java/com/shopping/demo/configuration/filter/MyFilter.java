package com.shopping.demo.configuration.filter;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Map<String,String[]> map = request.getParameterMap();
//        for(Map.Entry<String,String[]> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        String reUrl = String.valueOf(request.getRequestURL());
        System.out.println("===>"+reUrl);
        System.out.println("===>"+reUrl.substring(21));
        if("/hello".equals(reUrl.substring(21))){
            System.out.println("===>拦截hello请求并做相应处理");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("destory");
    }
}
