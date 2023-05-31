package com.Arr;

public class FindMax {
    public static void main(String[] args) {
        int[] yanzhi = {15, 9000, 10000, 20000, 9500, -5};
        int max = yanzhi[0];
        for (int i = 0; i < yanzhi.length; i++) {
            if (yanzhi[i] > max) {
                max = yanzhi[i];
            }
        }
        System.out.println("最好看的是：" + max);
    }
}
