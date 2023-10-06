package com.geekaca.studentsys.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //出生日期
    private LocalDate birth;
    //居住地
    private String address;


    public Student(String sid, String name, LocalDate birth, String address) {
        this.sid = sid;
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public Student() {

    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                '}';
    }
}