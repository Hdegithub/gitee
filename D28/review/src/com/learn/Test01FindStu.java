package com.learn;

import java.util.HashMap;
import java.util.Map;

public class Test01FindStu {
    public static void main(String[] args) {
        Map<Integer, Stu> map = new HashMap<>();
        //不推荐这么写
        Stu stu = null;
        for (int i = 1; i < 20; i++) {
            stu = new Stu("Tom" + i, 0 + i);
            map.put(stu.getId(), stu);
        }
        map.forEach((k, v) -> {
            System.out.println(v);
        });
    }
}
