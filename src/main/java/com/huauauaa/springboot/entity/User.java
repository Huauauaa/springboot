package com.huauauaa.springboot.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

@Data
public class User implements Serializable {
    private Long id;

    @TableField("firstName")
    private String firstName;

    @TableField("lastName")
    private String lastName;

    private Integer age;

    @TableField(exist = false)
    private String remarks;
}
