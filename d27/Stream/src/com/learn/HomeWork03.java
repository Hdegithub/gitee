package com.learn;

import java.util.*;

public class HomeWork03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> zhangsanSet = new HashSet<>();
        Collections.addAll(zhangsanSet, "D", "D", "D");
        Set<String> tomSet = new HashSet<>();
        Collections.addAll(tomSet, "A", "B", "C", "D");
        Set<String> jackSet = new HashSet<>();
        Collections.addAll(jackSet, "B", "C", "D");
        Set<String> lisiSet = new HashSet<>();
        Collections.addAll(lisiSet, "A");
        //把集合的所有元素加入List
        list.addAll(zhangsanSet);
        list.addAll(tomSet);
        list.addAll(jackSet);
        list.addAll(lisiSet);
        //所有人的投票结果
        System.out.println(list);
        //统计各个字母的数量
        Map<String, Integer> map = new HashMap<>();
        list.forEach((item) -> {
            Integer cnt = map.get(item);
            if (cnt == null) {
                map.put(item, 1);
            } else map.put(item, cnt + 1);
        });
        System.out.println("投票结果：" + map);
    }
}
