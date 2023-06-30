package com.learn;

public class Stu {
    private String name;
    private int id;

    public Stu(String s, int i) {
        this.name = s;
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public Stu(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
