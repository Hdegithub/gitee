package com.d16homework;

public class HomeWork02 {
    public static void main(String[] args) {
        int[] nums = {9, 3, 4, 5, 6, 1, 8, 1};
        boolean isfind = false;
        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            for (int i = j + 1; i < nums.length; i++) {
                if (num == nums[i]) {
                    System.out.println(true);
                    return;
                } else {
                    System.out.println(isfind);
                    return;
                }
            }
        }
    }
}
