package com.shopping.demo.service.impl;

import com.shopping.demo.constants.ShopExceptionCode;
import com.shopping.demo.cro.UserCro;
import com.shopping.demo.cro.UserEditCro;
import com.shopping.demo.cro.UserRegisteCro;
import com.shopping.demo.dto.UserDto;
import com.shopping.demo.entity.User;
import com.shopping.demo.exception.MyShopException;
import com.shopping.demo.repository.UserRepository;
import com.shopping.demo.service.UserService;
import com.shopping.demo.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractBaseImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(UserRegisteCro userRegisteCro) throws MyShopException {

        User curUser = findUserByMobile(userRegisteCro.getMobileNum());
        if(curUser != null){
            throw new MyShopException(ShopExceptionCode.USER_ALREADY_EXISTS,"用户已存在");
        }
        UserDto userDto = userRegisteCro.toDto();
        userDto.setAddTime(DateTimeUtils.getSysCurDate());
        userRepository.save(new User(userDto));
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public Page<User> findAll(UserCro cro) {
        Pageable pageable = getPageable(cro.getOffset(),cro.getPageSize());
        Page<User> listUser = userRepository.findAllUsers(pageable);
        return listUser;
    }

    @Override
    public User findUserByMobile(String mobileNum) {
        User curUser = userRepository.findUserByMobileNum(mobileNum);
        return curUser;
    }

    @Override
    public User editUser(UserEditCro userEditCro) {

        return null;
    }


}
