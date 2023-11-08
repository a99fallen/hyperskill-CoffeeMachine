package com.coffeemachine.CoffeeVendingMachine;

import com.coffeemachine.Coffee.Coffee;

public class CoffeeVendingMachine {

    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfCoffee;
    private int amountOfDisposableCups;
    private int amountOfMoney;

    public CoffeeVendingMachine (int amountOfWater,
                                 int amountOfMilk,
                                 int amountOfCoffee,
                                 int amountOfDisposableCups,
                                 int amountOfMoney) {
        this.amountOfWater = amountOfWater;
        this.amountOfMilk = amountOfMilk;
        this.amountOfCoffee = amountOfCoffee;
        this.amountOfDisposableCups = amountOfDisposableCups;
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public int getAmountOfCoffee() { return amountOfCoffee; }

    public int getAmountOfDisposableCups() { return amountOfDisposableCups; }

    public int getAmountOfMoney() { return amountOfMoney; }

    public void setAmountOfWater(int water) {
        this.amountOfWater = water;
    }

    public void setAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }

    public void setAmountOfCoffee(int amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }

    public void setAmountOfDisposableCups(int amountOfDisposableCups) {
        this.amountOfDisposableCups = amountOfDisposableCups; }

    public void setAmountOfMoney(int amountOfMoney) { this.amountOfMoney = amountOfMoney; }

    public void makeCoffee(Coffee coffee) {
        int requiredWater = coffee.getWater();
        int requiredMilk = coffee.getMilk();
        int requiredCoffee = coffee.getCoffee();
        int earnedCash = coffee.getCost();
        if (amountOfWater >= requiredWater
                && amountOfMilk >= requiredMilk
                && amountOfCoffee >= requiredCoffee
                && amountOfDisposableCups > 0) {
            System.out.println("I have enough resources, making you a coffee!");
            this.amountOfWater -= requiredWater;
            this.amountOfMilk -= requiredMilk;
            this.amountOfCoffee -= requiredCoffee;
            this.amountOfDisposableCups -= 1;
            this.amountOfMoney += earnedCash;
        } else if (amountOfWater < requiredWater) {
            System.out.println("Sorry, not enough water!");
        } else if (amountOfMilk < requiredMilk) {
            System.out.println("Sorry, not enough milk!");
        } else if (amountOfCoffee < requiredCoffee) {
            System.out.println("Sorry, not enough coffee!");
        } else if (amountOfDisposableCups <= 0) {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                amountOfWater + " ml of water\n" +
                amountOfMilk + " ml of milk\n" +
                amountOfCoffee + " g of coffee beans\n" +
                amountOfDisposableCups + " disposable cups\n" +
                "$" + amountOfMoney + " of money";
    }
}
