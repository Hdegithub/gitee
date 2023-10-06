package com.newstest.utils;

/**
 * 数据载体
 * <p>
 * 统一接口返回数据格式
 */
public class Result {
    //编码 ，用来代表 接口返回的 状态
    private Integer code;
    //提示信息
    private String message;
    //数据
    private Object data;

    public Result() {
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
