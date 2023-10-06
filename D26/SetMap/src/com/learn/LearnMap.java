package com.learn;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("衣服", 500);
        map.put("裤子", 100);
        Integer i = map.get("裤子");
        System.out.println("裤子的价格:" + i);
    }
}
