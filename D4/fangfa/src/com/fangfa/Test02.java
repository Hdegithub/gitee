package com.fangfa;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
    }

    public static void showArr(int[] arr) {
        String string = "该数组内容为：[";
        for (int i = 0; i < arr.length; i++) {
            string = string + arr[i];
        }
        string += "]";
        System.out.println(string);
    }

}
