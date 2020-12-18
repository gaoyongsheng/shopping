package com.shopping.demo.controller;

import com.shopping.demo.cro.OrderCreateCro;
import com.shopping.demo.exception.MyShopException;
import com.shopping.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ldc
 * @Date 2020/12/10 15:38
 * @Version 1.0
 */

@RestController
@RequestMapping("/service/v1")
public class OrderController extends AbstractBaseCtrl{

    @Autowired
    OrderService orderService;

    @PostMapping("/orders.create")
    public Object createOrders(@RequestBody OrderCreateCro orderCreateCro){
        return success(orderService.createOrder(orderCreateCro));
    }

    @GetMapping("/order.findById/{id}")
    public Object findOrderById(@PathVariable("id") Long id){
        try{
            return success(orderService.findOrderById(id));
        } catch (MyShopException ex){
            return failure(ex.getErrorCode(),ex.getMessage());
        }
    }
}
