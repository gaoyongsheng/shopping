package com.shopping.demo.controller;

import com.shopping.demo.constants.ShopExceptionCode;
import com.shopping.demo.cro.UserCro;
import com.shopping.demo.entity.User;
import com.shopping.demo.exception.MyShopException;
import com.shopping.demo.service.UserService;
import com.shopping.demo.utils.PageUtils;
import com.shopping.demo.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Gao
 * @Date 2020/10/22 0:31
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/service/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user.register")
    public Object registerUser(@RequestBody User user){
        try{
            userService.registerUser(user);
            return  ResponseUtils.success("");
        }catch(MyShopException ex){
            return ResponseUtils.failure(ex.getErrorCode(),ex.getMessage());
        }
    }

    @PostMapping("/user.findAll")
    public Object findAllUser(@RequestBody UserCro userCro, HttpServletRequest request){
        Page<User> listUser = userService.findAll(userCro);
        return  ResponseUtils.success(PageUtils.getData(listUser));
    }

}
