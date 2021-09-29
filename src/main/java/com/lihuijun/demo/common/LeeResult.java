package com.lihuijun.demo.common;

import lombok.Data;

/**
 * 接口返回封装类
 */
@Data
public class LeeResult<T> {
    private int code;
    private String message;
    private T data;

    public LeeResult(){}

    public LeeResult(int code, T data){
        this.code = code;
        this.data = data;
    }

    public LeeResult(int code, String message){
        this.code = code;
        this.message = message;
    }

    public LeeResult(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> LeeResult<T> success(T data){
        return new LeeResult<>(200, data);
    }

    public static <T> LeeResult<T> success(String message){
        return new LeeResult<>(200, message);
    }

    public static <T> LeeResult<T> success(String message, T data){
        return new LeeResult<>(200, message, data);
    }

    public static <T> LeeResult<T> error(String message){
        return new LeeResult<>(500, message);
    }
}
