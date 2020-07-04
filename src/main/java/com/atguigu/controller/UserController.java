package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        //userService = class com.sun.proxy.$Proxy68
        System.out.println("userService = " + userService.getClass());
        return userService.findAll();
    }
}
