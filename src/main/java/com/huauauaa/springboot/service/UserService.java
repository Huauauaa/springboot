package com.huauauaa.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huauauaa.springboot.entity.User;

import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<User> {
    Page<User> getMixedUsers(Page<User> page);
}
