package com.learnaop.dao.impl;

import com.learnaop.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    //JoinPoint连接点
//    @Override
//    public void save() {
    //侵入方式的
//        //记录程序当前执行执行（开始时间）
//        Long startTime = System.currentTimeMillis();
//        //业务执行万次
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("book dao save ...");
//            //省略了保存到数据库操作....
//        }
//        //记录程序当前执行时间（结束时间）
//        Long endTime = System.currentTimeMillis();
//        //计算时间差
//        Long totalTime = endTime - startTime;
//        //输出信息
//        System.out.println("执行万次消耗时间：" + totalTime + "ms");
//    }

    @Override
    public void save() {
        System.out.println("save.....");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete ...");
    }

    @Override
    public void select() {
        System.out.println("book dao select ...");
    }
}
