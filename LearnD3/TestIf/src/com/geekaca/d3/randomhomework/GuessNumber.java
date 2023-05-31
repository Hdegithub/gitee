package com.geekaca.d3.randomhomework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /**
         * 猜数字
         */
        //先生成一个
        Random random = new Random();
        /**
         *
         * 随机整数
         * between 0 (inclusive 包含0) and the specified value (exclusive  不包含100)
         * 0~99
         *
         * 限定 只能猜测 4次
         * 达到次数 ，没猜对，游戏结束
         */
        int answer = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("系统生成了一个1~100的数字，请猜测（四次机会）：");
        int jihui = 4;
        while (jihui > 0) {
            jihui--;
            System.out.println("请输入：");
            int input = scanner.nextInt();
            if (input > answer) {
                System.out.println("猜测大了，请重新输入 ,剩余次数："+ jihui);
            } else if (input < answer) {
                System.out.println("猜测小了，请再次尝试 , 剩余次数:" + jihui);
            } else {
                System.out.println("猜对了, 答案是: " + answer);
                break;
            }
        }

    }
}
