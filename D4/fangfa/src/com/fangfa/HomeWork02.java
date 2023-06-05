package com.fangfa;

public class HomeWork02 {
    public static void main(
            String[] args) {
        double[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        pingjun(arr);
    }

    public static void pingjun(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("平均数是：" + sum / arr.length);
        return;
    }
}
