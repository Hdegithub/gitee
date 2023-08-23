package com.learnjsp.json;

import com.alibaba.fastjson.JSON;
import com.learnjsp.pojo.Brand;

import java.util.ArrayList;
import java.util.List;

public class TestJson {
    public static void main(String[] args) {
        List<Brand> list = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Brand brand = new Brand();
            brand.setId(i);
            brand.setBrandName("比亚迪");
            brand.setDescription("混动汽车");
            brand.setCompanyName("深圳比亚迪");
            brand.setStatus(1);
            list.add(brand);
        }
        //把List 转换为JSON 字符串
        String s = JSON.toJSONString(list);
        System.out.println(s);
    }
}
