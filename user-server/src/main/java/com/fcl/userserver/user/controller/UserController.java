package com.fcl.userserver.user.controller;

import com.fcl.userserver.user.entity.User;
import com.fcl.userserver.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.PathParam;

/**
 * @Author: FCL
 * @DateTime: 2020/5/9 10:46
 * @Description: TODO
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable("id") Integer id){
        System.out.println("进入生产者服务");
        return "getUser id是"+id+"的用户 成功";
    }

}
