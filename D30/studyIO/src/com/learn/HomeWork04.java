package com.learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork04 {
    public static void main(String[] args) {
        List<String> wordlist = new ArrayList<>();
        String filepath = "D:\\Java单词.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filepath));
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String str = "Java Hello main class file";
                Pattern pattern = Pattern.compile("[a-zA-Z]+");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                    String word = matcher.group();
                    wordlist.add(word);
                    // System.out.println("找到单词："+word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //wordlist.forEach(wd-> System.out.println(wd));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordlist.size(); i++) {
            String word = wordlist.get(i);
            if (map.containsKey(word)) {
                Integer cnt = map.get(word);
                map.put(word, cnt + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println("单词统计如下：");
        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }
}
