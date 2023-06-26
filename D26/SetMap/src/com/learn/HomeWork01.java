package com.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork01 {
    public static void main(String[] args) {
        //1,比如： 我有 10 万个学生，每个学生都有唯一的学号
        // HashMap
        //* 如何快速定位查找某一个学生，根据学号 Tom89898
        Map<String, String> map = new HashMap<>();
        for (int i = 1; i < 100000; i++) {
            map.put("Tom" + i, "id" + i);
        }
        Set<String> set = map.keySet();
        long st = System.currentTimeMillis();
        for (String key : set) {
            System.out.println(map.get("Tom89898"));
            break;
        }
        long et = System.currentTimeMillis();
        System.out.println(et - st);
        //ArrayList
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i < 100000; i++) {
            list.add(new Student("Tom" + i, 0 + i));
        }
        long st1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId() == 89898) {
                System.out.println(stu.getName());
                break;
            }
        }
        long et1 = System.currentTimeMillis();
        System.out.println(et1 - st1);
    }
}
