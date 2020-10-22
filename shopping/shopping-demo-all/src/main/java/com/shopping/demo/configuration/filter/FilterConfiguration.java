package com.shopping.demo.configuration.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean registrationFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // 设置过滤器
        filterRegistrationBean.setFilter(new MyFilter());
        // 指定url策略
        filterRegistrationBean.addUrlPatterns("/hello");
        // 设置过滤器名称
        filterRegistrationBean.setName("myFilter");

        return filterRegistrationBean;
    }

}
