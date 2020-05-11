package com.fcl.consumer.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: FCL
 * @DateTime: 2020/5/9 11:28
 * @Description: TODO
 */
@FeignClient(value = "user-server")
public interface UserService{

    @GetMapping("/user/getUser/{id}")
    String getUserName(@PathVariable("id") Integer id);

}
