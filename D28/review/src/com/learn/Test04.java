package com.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该 年
        //没有举办世界杯，则输出：没有举办世界杯。
        //附：世界杯冠军以及对应的夺冠年份，请参考本章附录。 附录
        //历届世界杯冠军
        //届数 举办年份 举办地点 冠军
        //第一届 1930 年 乌拉圭 乌拉圭
        //第二届 1934 年 意大利 意大利
        //第三届 1938 年 法国 意大利
        //第四届 1950 年 巴西 乌拉圭
        //第五届 1954 年 瑞士 西德
        //第六届 1958 年 瑞典 巴西
        //第七届 1962 年 智利 巴西
        //第八届 1966 年 英格兰 英格兰
        //第九届 1970 年 墨西哥 巴西
        //第十届 1974 年 前西德 西德
        //第十一届 1978 年 阿根廷 阿根廷
        //第十二届 1982 年 西班牙 意大利
        //第十三届 1986 年 墨西哥 阿根廷
        //第十四届 1990 年 意大利 西德
        //第十五届 1994 年 美国 巴西
        //第十六届 1998 年 法国 法国
        //第十七届 2002 年 韩日 巴西
        //第十八届 2006 年 德国 意大利
        //第十九届 2010 年 南非 西班牙
        //第二十届 2014 年 巴西 德国
        Map<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");

        //录入字符
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年份：");
            int put = sc.nextInt();
            if (map.containsKey(put)) {
                System.out.println("冠军是" + map.get(put));
            } else {
                System.out.println("这一年没有举办世界杯，请输入别的年份");
            }
        }
    }
}
