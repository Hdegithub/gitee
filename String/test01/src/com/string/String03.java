package com.string;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String string = scanner.next();
        int zimu = 0;
        int shuzi = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                zimu++;
            } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                zimu++;
            } else {
                shuzi++;
            }
        }
        System.out.println("字母有：" + zimu + "个");
        System.out.println("数字有：" + shuzi + "个");
    }
}
