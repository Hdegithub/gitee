package com.atmtest;

import java.util.ArrayList;

public class Stringtest {
    public static void main(String[] args) {

        String names = "张无忌,张三丰,刘德华,周芷若";
        String[] splitArr = names.split(",");
        ArrayList<Account> accountList = new ArrayList<>();
        for (int i = 0; i < splitArr.length; i++) {
            String name = splitArr[i];
            Account acc = new Account();
            acc.setName(name);
            accountList.add(acc);
        }
        boolean isfind = false;
        for (int i = 0; i < accountList.size(); i++) {
            Account account = accountList.get(i);
            String name1 = account.getName();
            if (name1.contains("张")) {
                System.out.println("找到了：" + account);
                isfind = true;
            }
        }
        if (!isfind) {
            System.out.println("没有找到该学生");
        }
    }
}
