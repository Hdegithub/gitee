package com.d16homework;

import java.util.Arrays;

public class HomeWork07 {
    public static void main(String[] args) {
        //找最大值
        int[] nums = {3, 4, 6, 1, 0};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        //找到索引
        //Arrays.binarySearch(数组名，值)，找到这个值在数组中的索引
        int suoyin = Arrays.binarySearch(nums, max);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=max&&max >= nums[i] * 2) {
                System.out.println(suoyin);
                break;
            } else if (max < nums[i] * 2) {
                System.out.println("-1");
                break;
            } else {
                System.out.println("0");
            }
        }
    }
}

