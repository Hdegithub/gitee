package com.learn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HelloFuture {
    public static void main(String[] args) {
        Callable<String> mycall = new mycallable(30000);
        Callable<String> mycall2 = new mycallable(20000);
        FutureTask<String> futureTask = new FutureTask<>(mycall);
        FutureTask<String> futureTask1 = new FutureTask<>(mycall2);
        Thread thread1 = new Thread(futureTask);
        new Thread(futureTask1).start();
        thread1.start();

        String s = null;
        try {
            s = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("我的线程结果：" + s);

        String rs = null;
        try {
            rs = futureTask1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("第二个线程结果：" + rs);
    }
}

class mycallable implements Callable<String> {
    private int number;

    public mycallable(int number) {
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        System.out.println("开始累加：" + number);
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return "线程累加的结果：" + sum;
    }
}
