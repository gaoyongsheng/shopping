package com.shopping.demo.repository;

import com.shopping.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @Author ldc
 * @Date 2020/12/10 15:28
 * @Version 1.0
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
    Order findOrderById(Long id);
}
