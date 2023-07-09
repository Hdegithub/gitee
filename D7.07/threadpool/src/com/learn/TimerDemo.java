package com.learn;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer=new Timer();
        //匿名内部类
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行aaa"+new Date());
            }
        },0,2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行bbb"+new Date());
                //Timer弊端：程序运行中异常会导致程序怪掉
                System.out.println(10/0);
            }
        },0,3000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行ccc"+new Date());
            }
        },0,1000);
    }
}
