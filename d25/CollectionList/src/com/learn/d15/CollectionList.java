package com.learn.d15;

import java.util.ArrayList;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Tom");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
