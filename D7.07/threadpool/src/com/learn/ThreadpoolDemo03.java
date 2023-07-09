package com.learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadpoolDemo03 {
    public static void main(String[] args) {
        //线程池比较简便的创建方式
        //弊端：线程数不够就新建线程，占内存
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new ZuoCaiRunnable());
        executorService.execute(new ZuoCaiRunnable());
        executorService.execute(new ZuoCaiRunnable());
        //固定数量的线程池
        //弊端：队列无长度限制，队列容易胀满
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        executorService1.execute(new ZuoCaiRunnable());
        executorService1.execute(new ZuoCaiRunnable());
        executorService1.execute(new ZuoCaiRunnable());
        //池中只有一个线程，unbounded queue队列无限制，容易胀满
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(new ZuoCaiRunnable());
        executorService2.execute(new ZuoCaiRunnable());
        executorService2.execute(new ZuoCaiRunnable());
        //除非明确知道任务要求并且可控，谨慎使用！！！

        //定时器
        //按照固定时间间隔执行一个任务
        ScheduledExecutorService scheduledpool = Executors.newScheduledThreadPool(5);
        scheduledpool.scheduleAtFixedRate(new TestRunnable(), 0, 1, TimeUnit.SECONDS);
        //执行一次(适合延迟多少秒后执行一个任务)
        scheduledpool.schedule(new TestRunnable(), 1, TimeUnit.SECONDS);
        scheduledpool.shutdown();
    }
}

class TestRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello" + System.currentTimeMillis());
    }
}
