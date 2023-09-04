package com.learnssm.controller;
import com.learnssm.exception.BusinessException;
import com.learnssm.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 针对 REST controller抛出的异常，由他来统一处理
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //@ExceptionHandler用于设置当前处理器类对应的异常类型
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //当发生这种异常的时候，这个函数会被调用
        return new Result(ex.getCode(), ex.getMessage(), null);
    }

    //handler：处理器   参数指定 要处理的异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        //构造一个统一的接口数据格式对象，返回给前端
        //log 日志写文件，写DB
        return new Result(ex.getCode(),ex.getMessage(), null);
    }
}
