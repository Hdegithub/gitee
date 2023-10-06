package com.learn;

import java.util.Map;

import java.util.TreeMap;

public class HomeWork02 {
    public static void main(String[] args) {
        String str = "abcdfgca";
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //如果字符第一次出现，让值=1
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                //不是第一次出现就让值加1
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }
        }
        map.forEach((Character character, Integer count) -> {
            System.out.println(character + "出现了" + count + "次");
        });
    }
}
