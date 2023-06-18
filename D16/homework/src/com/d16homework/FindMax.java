package com.d16homework;

public class FindMax {
    public static void main(String[] args) {
        findmax();
    }
    public static void findmax(){
        int[] nums ={34, 23, 56, 99, -2};
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("最大值为："+max);
    }
}
