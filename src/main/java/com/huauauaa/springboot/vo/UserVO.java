package com.huauauaa.springboot.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserVO implements Serializable {
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    // some new fields
    private String remarks;
}
