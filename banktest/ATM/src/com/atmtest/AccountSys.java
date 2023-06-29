package com.atmtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum AccountSys {
    ACC_INSTANCE;
    ArrayList<Account> accounts = new ArrayList<>();

    Map<String,Account>accountsMap=new HashMap<>();
}
