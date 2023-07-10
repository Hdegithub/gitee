package com.learn;

import java.util.concurrent.locks.ReentrantLock;

public class HomeWork01 {
    public static void main(String[] args) {
        station station = new station();
        Thread thread1 = new Thread(station);
        Thread thread2 = new Thread(station);
        Thread thread3 = new Thread(station);
        thread1.setName("检票口1");
        thread2.setName("检票口2");
        thread3.setName("检票口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class station implements Runnable {
    private ReentrantLock rLock = new ReentrantLock();
    //火车票从1开始自增到20就卖完
    int ticket = 1;
    //加锁
    Object object = new Object();

    @Override
    public void run() {
        while (ticket <= 20) {
            buyticket();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    private void buyticket() {
        rLock.lock();
        try {
            if (ticket <= 20) {
                System.out.println(Thread.currentThread().getName() + "卖出第" + ticket + "张票");
                ticket++;
            } else {
                System.out.println("票卖完了");
                return;
            }
        } finally {
            rLock.unlock();
        }
    }
}