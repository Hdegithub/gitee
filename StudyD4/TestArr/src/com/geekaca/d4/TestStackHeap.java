package com.geekaca.d4;

import java.util.Arrays;

public class TestStackHeap {
    public static void main(String[] args) {
        /**
         * stack 栈
         * heap  堆
         */
        //引用类型
        /**
         * arr1   钥匙串 栈
         * {11, 22, 33}  堆
         */
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------");
        arr2[1] = 99;
        //是否变化？  1 会变  2 不会
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        /**
         * 异常
         */
        int[] ages = {22, 33};
        /**
         * 1，看懂异常
         * 2，知道原因
         * ArrayIndexOutOfBoundsException 数组越界
         */
//        System.out.println(ages[9]);
        //不指向任何一个对象
        /**
         * 断点 breakpoint
         * 当程序运行到此 ，可以暂停，查看变量的值
         * 排查 bug 虫子
         * debug
         */
        ages = null;
        /**
         * 空指针  java.lang.NullPointerException
         * 出现原因： 当你对null 调用.
         */
//        System.out.println(ages[0]);
        System.out.println(ages);
        System.out.println(ages.length);
    }
}
