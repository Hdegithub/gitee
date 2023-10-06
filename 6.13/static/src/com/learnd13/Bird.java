package com.learnd13;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "鸟在飞");
    }
}
