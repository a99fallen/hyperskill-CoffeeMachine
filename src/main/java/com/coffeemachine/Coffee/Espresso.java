package com.coffeemachine.Coffee;

public class Espresso extends Coffee{

    private final int WATER = 250;
    private final int MILK = 0;
    private final int COFFEE = 16;
    private final int COST = 4;

    public Espresso(String name) {
        super("Espresso");
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
