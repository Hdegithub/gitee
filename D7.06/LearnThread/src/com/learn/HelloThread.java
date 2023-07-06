package com.learn;

import java.util.Scanner;

public class HelloThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Scanner scanner=new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}