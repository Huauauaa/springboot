package com.huauauaa.springboot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huauauaa.springboot.entity.User;
import com.huauauaa.springboot.mapper.UserMapper;

import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
