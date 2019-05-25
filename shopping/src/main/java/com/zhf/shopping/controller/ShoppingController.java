package com.zhf.shopping.controller;

import com.zhf.shopping.entity.Orders;
import com.zhf.shopping.entity.User;
import com.zhf.shopping.service.ItemsService;
import com.zhf.shopping.service.OrderDetailService;
import com.zhf.shopping.service.OrdersService;
import com.zhf.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShoppingController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrderDetailService detailService;
    @Autowired
    private ItemsService itemsService;

    @ResponseBody
    @GetMapping("orders/get")
    public List<User> getOrdersByUserId(@RequestParam("userId") Integer userId) {
        return userService.findOrdersByUserId(userId);
    }

    @ResponseBody
    @GetMapping("items/get")
    public List<User> getItemsByUserId(@RequestParam("userId") Integer userId) {
        return userService.findItemsByUserId(userId);
    }

    @ResponseBody
    @GetMapping("details/get")
    public List<Orders> findOrderDetailsByOrderId(@RequestParam("orderId") Integer orderId) {
        return ordersService.findOrderDetailsByOrderId(orderId);
    }
}
