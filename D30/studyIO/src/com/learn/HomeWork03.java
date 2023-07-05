package com.learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork03 {
    public static void main(String[] args) {

        try {
            Map<String, Integer> map = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader("D:\\Java单词.txt"));
            String line = "";

            while ((line = br.readLine()) != null) {
                String[] wordline = line.split(" ");
                for (String word : wordline) {
                    if (map.containsKey(word)) {
                        Integer value = map.get(word);
                        map.put(word, value + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
            br.close();
            Set<String> keyset = map.keySet();
            for (String key : keyset) {
                int value = map.get(key);
                System.out.println(key + ":" + value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
