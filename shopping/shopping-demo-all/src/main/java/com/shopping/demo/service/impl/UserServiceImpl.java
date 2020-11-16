package com.shopping.demo.service.impl;

import com.shopping.demo.cro.UserCro;
import com.shopping.demo.entity.User;
import com.shopping.demo.repository.UserRepository;
import com.shopping.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Page<User> findAll(UserCro cro) {
        Pageable pageable = PageRequest.of(cro.getOffset(),cro.getPageSize());
        Page<User> listUser = userRepository.findAllUsers(pageable);
        return listUser;
    }


}
