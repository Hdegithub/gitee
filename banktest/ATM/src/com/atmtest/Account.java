package com.atmtest;

public class Account {
    private String cardid;//卡号
    private String name;//用户名
    private String mima;//银行卡密码
    private double money;//存款
    private double tixian;//提现额度

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTixian() {
        return tixian;
    }

    public void setTixian(double tixian) {
        this.tixian = tixian;
    }
}
