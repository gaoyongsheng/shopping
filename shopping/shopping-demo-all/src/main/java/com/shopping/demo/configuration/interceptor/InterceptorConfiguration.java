package com.shopping.demo.configuration.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截器，配置拦截地址
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/service/**")
            .excludePathPatterns(           // 个人注册相关接口
                    "/service/v1/user.register" // 个人注册
            );

    }
}
