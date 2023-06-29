package com.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        //（1. 使用 HashMap 类实例化一个 Map 类型的对象 m1，键（String 类型）和值（int 型）分
        //别用于存储员工的姓名和工资，存入数据如下： 张三——800 元；李四——1500 元；王五
        //——3000 元；
        //（2. 将张三的工资更改为 2600 元
        //（3. 为所有员工工资加薪 100 元；
        //（4. 遍历集合中所有的员工
        //（5. 遍历集合中所有的工资
        Map<String, Integer> map = new HashMap();
        map.put("张三", 800);
        map.put("李四", 1500);
        map.put("王五", 3000);
        //改张三工资
        map.put("张三", 2600);
        System.out.println(map);
        //给全部人加钱
        map.forEach((k, v) -> {
            map.put(k, v + 100);
        });
        System.out.println(map);

        //遍历所有员工
        map.forEach((k, v) -> {
            System.out.println(k);
        });

        //遍历所有工资
        map.forEach((k, v) -> {
            System.out.println(v);
        });
    }
}
