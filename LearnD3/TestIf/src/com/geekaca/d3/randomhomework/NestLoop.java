package com.geekaca.d3.randomhomework;

//循环嵌套
public class NestLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            //内循环   连着打印50个*   一行
            for (int j = 0; j < 50; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
