package com.learn;

import java.util.concurrent.*;

public class Threadpool02 {
    public static void main(String[] args) {
        // 1、创建线程池对象 游泳池
        /**
         public ThreadPoolExecutor(int corePoolSize,  池中 核心线程数量  默认有几个厨师
         int maximumPoolSize,  最多 线程数量 (当5个厨师都在做菜，来了第六个菜需要做，那就再雇佣一个厨师做
         不断的雇佣新的厨师，但是 最多 maximumPoolSize个
         )   当不够时会创建线程，但最多不超过 maximumPoolSize
         long keepAliveTime,  空闲后 ，最大存活时间（最多只等等待多少时间，超出这个时间，那些额外雇佣的厨师
         临时工
         会被销毁掉（解雇）
         ） ，超时Thread就会销毁
         TimeUnit unit,
         BlockingQueue<Runnable> workQueue,  承载任务的队列  任务队列（比如20个等待做的菜），厨房出菜口 门上订的菜单条
         ThreadFactory threadFactory,  控制创建Thread的方式，可以设置一些Thread的属性
         RejectedExecutionHandler handler)  拒绝策略  当池中的线程已经都被占用了，怎么办：拒绝策略

         ArrayBlockingQueue 一个线程安全的数组阻塞队列  排队
         不要记忆
         */
        //保存等待制作的菜
        ArrayBlockingQueue waitQueue = new ArrayBlockingQueue<>(5);
        //线程池的创建
        //默认三个厨师，最多五个厨师，多雇佣的两个能休息十秒，超过十秒就解雇
        //队列：最多有五个菜在等待制作
        //如果五个厨师都在忙，又有五个菜还没做，又来新的做菜需求->
        ExecutorService threadPool = new ThreadPoolExecutor(3, 5,
                10, TimeUnit.SECONDS, waitQueue, Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //向线程池提交任务
        ZuoCaiRunnable zuoCaiRunnable = new ZuoCaiRunnable();
        threadPool.execute(zuoCaiRunnable);
        threadPool.execute(zuoCaiRunnable);
        threadPool.execute(zuoCaiRunnable);
        //扩展新雇佣的厨师
        threadPool.execute(zuoCaiRunnable);
        threadPool.execute(zuoCaiRunnable);
        //再加五个菜的订单
        for (int i = 0; i < 5; i++) {
            threadPool.execute(zuoCaiRunnable);
        }
        threadPool.execute(zuoCaiRunnable);
        threadPool.shutdown();
    }
}
