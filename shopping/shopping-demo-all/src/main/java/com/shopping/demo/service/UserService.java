package com.shopping.demo.service;

import com.shopping.demo.cro.UserCro;
import com.shopping.demo.entity.User;
import org.springframework.data.domain.Page;


/**
 * @Author Gao
 * @Date 2020/10/22 0:31
 * @Version 1.0
 */
public interface UserService {

    /**
     * 注册用户
     * */
    void registerUser(User user);

    /**
     * 分页查询所有用户
     * */
    Page<User> findAll(UserCro cro);

}
