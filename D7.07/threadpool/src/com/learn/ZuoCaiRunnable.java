package com.learn;

public class ZuoCaiRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        try {
            Thread.sleep(1000 * 60 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
