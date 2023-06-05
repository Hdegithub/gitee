package com.fangfa;

public class test01 {
    public static void main(String[] args) {
        System.out.println(qiuhe());
    }

    public static int qiuhe() {
        int result = 0;
        for (int i = 1; i < 20; i++) {
            result += i;
        }
        return result;
    }

}
