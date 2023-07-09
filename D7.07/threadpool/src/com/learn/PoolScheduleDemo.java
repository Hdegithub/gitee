package com.learn;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PoolScheduleDemo {
    public static void main(String[] args) {
        //线程池方式实现定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "SSS" + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + "BBB" + new Date());
                    System.out.println(10 / 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "CCC" + new Date());
            }
        }, 0, 2, TimeUnit.HOURS);
    }
}
