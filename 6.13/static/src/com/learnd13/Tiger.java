package com.learnd13;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "老虎在跑");
    }
}
