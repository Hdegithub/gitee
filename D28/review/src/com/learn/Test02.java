package com.learn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        //1， 有 2 个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]， 第二个
        //数组为：[哈尔滨,杭州,南昌,广州,福州]， 将第一个数组元素作为 key，第二个数组元素作为
        //value 存储到 Map 集合中。 如{黑龙江省=哈尔滨, 浙江省=杭州, …}
        List<String> list = new ArrayList();
        list.add("黑龙江省");
        list.add("浙江省");
        list.add("江西省");
        list.add("广东省");
        list.add("福建省");
        List<String> list1 = new ArrayList<>();
        list1.add("哈尔滨");
        list1.add("杭州");
        list1.add("南昌");
        list1.add("广州");
        list1.add("福州");

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), list1.get(i));
        }
        System.out.println(map);
    }
}
