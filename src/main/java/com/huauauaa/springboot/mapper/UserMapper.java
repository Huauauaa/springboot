package com.huauauaa.springboot.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huauauaa.springboot.entity.User;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
