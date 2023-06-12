package com.learn.arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            Integer score = list.get(i);
            if (score < 80) {
                Integer removd = list.remove(i);
                System.out.println("删除了" + removd);
            }
        }
    }
}
