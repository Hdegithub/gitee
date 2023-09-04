package com.learnssm.exception;

//自定义异常处理器，用于封装异常信息，对异常进行分类
//外壳，最有价值的就是类的名字
//自定义异常

/**
 * 系统异常
 * 子类 用来代表 系统发生问题的时候，抛出异常
 */
public class SystemException extends RuntimeException{
    //自定义属性，异常的编码
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
