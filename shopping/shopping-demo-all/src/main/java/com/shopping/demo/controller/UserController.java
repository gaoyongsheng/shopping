package com.shopping.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

/**
 * @Author Gao
 * @Date 2020/10/22 0:31
 * @Version 1.0
 */

@RestController
@Slf4j
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello!!!";
    }

    @GetMapping("/hello/world")
    public String helloWorld(){
        return "hello world!!!";
    }

    @GetMapping("/say")
    public String say(){
        return "hahaha!!!";
    }
}
