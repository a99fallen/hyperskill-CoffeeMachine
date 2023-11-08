package com.coffeemachine.Coffee;

public class Cappuccino extends Coffee {

    private final int WATER = 200;
    private final int MILK = 100;
    private final int COFFEE = 12;
    private final int COST = 6;
    public Cappuccino(String name) {
        super("Cappuccino");
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
