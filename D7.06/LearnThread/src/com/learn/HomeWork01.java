package com.learn;

public class HomeWork01 {
    public static void main(String[] args) {
        Test test = new Test();
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}

class Test implements Runnable {
    int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i <= 2000) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                }
            }
        }
    }
}
