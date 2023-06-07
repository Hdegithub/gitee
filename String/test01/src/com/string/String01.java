package com.string;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号：");
            String zhanghao1 = scanner.next();
            System.out.println("请输入密码");
            String mima1 = scanner.next();

            String zhanghao = "何剑波";
            String mima = "111111";

            if (zhanghao1.equals(zhanghao) && mima1.equals(mima)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("账号或密码错误");

            }
        }
    }
}
