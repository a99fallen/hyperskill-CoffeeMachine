package com.coffeemachine.Coffee;

public class Latte extends Coffee{

    private final int WATER = 350;
    private final int MILK = 75;
    private final int COFFEE = 20;
    private final int COST = 7;
    public Latte(String name) {
        super("Latte");
    }

    @Override
    public int getWater() {
        return WATER;
    }

    @Override
    public int getMilk() {
        return MILK;
    }

    @Override
    public int getCoffee() {
        return COFFEE;
    }

    @Override
    public int getCost() {
        return COST;
    }
}
