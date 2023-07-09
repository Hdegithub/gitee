package com.learn;

import java.util.concurrent.*;

public class ThreadpoolFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 10,
                TimeUnit.SECONDS, new ArrayBlockingQueue(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Future<String> future1 = pool.submit(new Mycallable(100));
        Future<String> future2 = pool.submit(new Mycallable(200));
        Future<String> future3 = pool.submit(new Mycallable(300));
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        pool.shutdown();
    }
}

class Mycallable implements Callable<String> {
    private int n;

    public Mycallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=n;
        }
        return Thread.currentThread().getName()+"执行求和的结果是："+sum;
    }
}
