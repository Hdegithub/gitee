package com.geekaca.d4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * 冒泡排序
         * 升序
         */
        int[] arr = {5, 2, 3, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果当前元素大于后面一个元素
                if (arr[j] > arr[j+1]){
                    //交换
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
