package com.shopping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ShoppingDemoAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingDemoAllApplication.class, args);
    }

}
