package com.learn;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(50);
        set1.add(20);
        System.out.println(set1);
    }
}
