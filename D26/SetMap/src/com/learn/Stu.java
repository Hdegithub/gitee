package com.learn;

import java.util.Objects;

public class Stu {
    private String name;
    private String id;

    @Override
    public int hashCode() {
         return Objects.hash(name,id);
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Stu(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
