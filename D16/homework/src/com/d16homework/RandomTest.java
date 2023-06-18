package com.d16homework;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //生成79-100随机数
        Random random=new Random();
        int num=random.nextInt(21)+79;
        System.out.println(num);
    }
}
