package com.learn;

public class ThreadTest {
    public static void main(String[] args) {
        MyRn rn = new MyRn();
        MyRn rn1 = new MyRn();
        Thread thread = new Thread(rn);
        Thread thread1 = new Thread(rn1);
        thread1.start();
        thread.start();
    }
}

class MyRn implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
