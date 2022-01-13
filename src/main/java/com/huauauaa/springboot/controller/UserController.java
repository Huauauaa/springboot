package com.huauauaa.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huauauaa.springboot.entity.User;
import com.huauauaa.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Page<User> list(@RequestParam(defaultValue = "1", required = false) Integer currentPage,
            @RequestParam(defaultValue = "10", required = false) Integer pageSize,
            @RequestParam(defaultValue = "", required = false) String q) {
        QueryWrapper queryWrapper = new QueryWrapper<User>();
        if (q != null) {
            queryWrapper.like("firstName", q);
        }
        Page<User> pager = new Page<>(currentPage, pageSize);
        pager.addOrder(OrderItem.desc("id"));
        return userService.page(pager, queryWrapper);
    }
}
