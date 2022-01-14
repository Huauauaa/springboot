package com.huauauaa.springboot.util;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result<T> implements Serializable {
    private String code;
    private String desc;
    private T data;

    public Result(String code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public Result(String code, String desc) {
        this(code, desc, null);
    }

    public Result() {
        this("", "", null);
    }

    public static Result<Object> failure(String code, String desc) {
        return new Result<Object>(code, desc, null);
    }

    public static <T> Result<T> failure(String code, String desc, T data) {
        return new Result<T>(code, desc, data);
    }

    public static Result<Object> failure(String desc) {
        return new Result<Object>("1", desc, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>("0", "", data);
    }

    public static <T> Result<T> success(String desc, T data) {
        return new Result<T>("0", desc, data);
    }

    // public String toString() {
    // return "Result(code=" + this.getCode() + ", desc=" + this.getDesc() + ",
    // data=" + this.getData() + ")";
    // }
}
