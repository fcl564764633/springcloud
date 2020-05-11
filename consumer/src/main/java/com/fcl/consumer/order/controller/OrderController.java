package com.fcl.consumer.order.controller;

import com.fcl.consumer.order.service.UserService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: FCL
 * @DateTime: 2020/5/9 11:27
 * @Description: TODO
 */
@RequestMapping("/order")
@Controller
public class OrderController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserName")
    @ResponseBody
    public String getUserName(@RequestParam Integer id){
        System.out.println("进入消费者");
        return userService.getUserName(id);
    }
}
