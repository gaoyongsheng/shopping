package com.shopping.demo.repository;

import com.shopping.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Gao
 * @Date 2020/10/22 0:27
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {


}
