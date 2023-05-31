package com.geekaca.d4;

public class FindMax {
    public static void main(String[] args) {
        /**
         * 求最大值
         */
        int[] yanzhiArr = {15, 9000, 10000, 20000, 9500, -5};
        //先定义一个当前最大的
        int max = yanzhiArr[0];
        for (int i = 0; i < yanzhiArr.length; i++) {
            //yanzhiArr[i] 循环访问数组的每一个元素
            //谁比我大，我就保存谁的值
            if (yanzhiArr[i] > max){
                max = yanzhiArr[i];
            }
        }
        System.out.println("最大的颜值是：" + max);
    }
}
