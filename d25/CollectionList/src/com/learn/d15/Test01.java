package com.learn.d15;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<String>stu1=new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            stu1.add("Tom"+i);
        }
        List<String>stu2=new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            stu2.add("Tom"+i);
        }
        for (int i = 0; i < stu2.size(); i++) {
            Iterator<String>iterator=stu1.iterator();
            while (iterator.hasNext()){
                String temp=iterator.next();
                if (temp.equals(stu2.get(i))){
                    iterator.remove();
                }
            }
        }
        System.out.println(stu1);
    }
}