package com.shopping.demo.controller;

import com.shopping.demo.constants.ShopExceptionCode;
import com.shopping.demo.cro.UserCro;
import com.shopping.demo.cro.UserEditCro;
import com.shopping.demo.cro.UserLoginCro;
import com.shopping.demo.cro.UserRegisteCro;
import com.shopping.demo.entity.User;
import com.shopping.demo.exception.MyShopException;
import com.shopping.demo.service.UserService;
import com.shopping.demo.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Gao
 * @Date 2020/10/22 0:31
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/service/v1")
public class UserController extends AbstractBaseCtrl {

    @Autowired
    UserService userService;

    @PostMapping("/user.register")
    public Object registerUser(@RequestBody UserRegisteCro userRegisteCro){
        try{
            userService.registerUser(userRegisteCro);
            return success("");
        }catch(MyShopException ex){
            return failure(ex.getErrorCode(),ex.getMessage());
        }
    }

    @PostMapping("/user.login")
    @ResponseBody
    public Object userLogin(@RequestBody UserLoginCro userLoginCro){
        try{
            User user = userService.findUserByUserNameOrMobile(userLoginCro);
            return success(user);
        } catch (MyShopException ex){
            return failure(ex.getErrorCode(),ex.getMessage());
        }
    }

    @PostMapping("/user.findAll")
    public Object findAllUser(@RequestBody UserCro userCro){
        Page<User> listUser = userService.findAll(userCro);
        return success(getData(listUser));
    }

    @PostMapping("/user.edit")
    public Object editUser(@RequestBody UserEditCro userEditCro){
        return success(userService.editUser(userEditCro));
    }

//    @GetMapping("/user.findById")
//    public Object findUserById(@RequestParam(value = "id",defaultValue = "0") Long id){
//    @PathVariable("xxx")
//    通过 @PathVariable 可以将URL中占位符参数{xxx}绑定到处理器类的方法形参中@PathVariable(“xxx“)
    @GetMapping("/user.findById/{id}")
    public Object findUserById(@PathVariable("id") Long id){
        try{
            User curUser = userService.findUserById(id);
            return success(curUser);
        } catch (MyShopException ex){
            return failure(ex.getErrorCode(),ex.getMessage());
        }

    }

    @GetMapping("/user.deleteById")
    public Object deleteUserById(@RequestParam("id") Long id){
        try{
            userService.deleteUserById(id);
            return success("");
        } catch (MyShopException ex){
            return failure(ex.getErrorCode(),ex.getMessage());
        }
    }
}
