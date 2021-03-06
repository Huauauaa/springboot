package com.huauauaa.springboot.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huauauaa.springboot.mapper.UserMapper;
import com.huauauaa.springboot.entity.User;

import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    public Page<User> getMixedUsers(Page<User> page) {
        List<User> records = this.baseMapper.selectList(null);
        // custom logic
        records.forEach(item -> item.setRemarks("aaa"));
        return page.setRecords(records);
    }

}
