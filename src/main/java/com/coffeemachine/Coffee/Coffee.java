package com.coffeemachine.Coffee;

public abstract class Coffee {

    public abstract int getWater();
    public abstract int getMilk();
    public abstract int getCoffee();
    public abstract int getCost();
    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
