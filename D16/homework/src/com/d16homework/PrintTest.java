package com.d16homework;

public class PrintTest {
    public static void main(String[] args) {
        String str = "@";
        String str1 = "#";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    System.out.print(str1);
                } else {
                    System.out.print(str);
                }
            }
            System.out.println();
        }
    }
}
