package com.d16homework;

public class HomeWork02 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 6, 7, 8, 9};
        boolean isfind = false;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {
                System.out.println(true);
                break;
            } else System.out.println(isfind);
            break;
        }
    }
}
