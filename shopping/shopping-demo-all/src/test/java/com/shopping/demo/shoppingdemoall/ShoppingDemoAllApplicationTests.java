package com.shopping.demo.shoppingdemoall;

import com.shopping.demo.cro.UserCro;
import com.shopping.demo.entity.User;
import com.shopping.demo.repository.UserRepository;
import com.shopping.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class ShoppingDemoAllApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Test
    public void testAdd() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setEmail("270589908@qq.com");
        user.setPassword("111111");
        user.setMobileNum("17721163798");

        userRepository.save(user);
    }

    @Test
    public void getPageList(){

        UserCro userCro = new UserCro(1,3);

        Page<User> pageList = userService.findAll(userCro);

        for (User student : pageList.getContent()) {
            System.out.println(student);
        }
    }

}
