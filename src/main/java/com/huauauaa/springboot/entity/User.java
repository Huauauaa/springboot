package com.huauauaa.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName(value = "user")
public class User {
    private Long id;

    @TableField(value = "firstName")
    private String firstName;

    @TableField(value = "lastName")
    private String lastName;

    private Integer age;
}
