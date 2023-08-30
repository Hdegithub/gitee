package com.learnaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//切面 ，在这里做一些公共的操作
@Aspect
public class MyAdvice {
    /* 定义切入点  要在哪里 切入你的操作   切入点PointCut   利用规则表达式定义   函数名含有s的*/
    @Pointcut("execution(* com.learnaop.dao.BookDao.*s*(..))")
    private void pt() {
    }

    //环绕  参数指定 环绕谁
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("------------------------------");
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            //调用原始操作

            pjp.proceed();
        }
        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime - startTime;
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
        return null;
    }
}
