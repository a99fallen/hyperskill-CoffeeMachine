package com.coffeemachine.CoffeeVendingMachine;

import com.coffeemachine.Coffee.Cappuccino;
import com.coffeemachine.Coffee.Coffee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeVendingMachineTest {

    CoffeeVendingMachine cvm = new CoffeeVendingMachine(400, 540, 120, 9, 550);
    Coffee coffee = new Cappuccino("Cappuccino");
    @Test
    void getAmountOfWater() {
        int expectedWater = 400;
        assertEquals(expectedWater, cvm.getAmountOfWater());
    }

    @Test
    void getAmountOfMilk() {
        int expectedMilk = 540;
        assertEquals(expectedMilk, cvm.getAmountOfMilk());
    }

    @Test
    void getAmountOfCoffee() {
        int expectedCoffee = 120;
        assertEquals(expectedCoffee, cvm.getAmountOfCoffee());
    }

    @Test
    void getAmountOfDisposableCups() {
        int expectedDisposableCups = 9;
        assertEquals(expectedDisposableCups, cvm.getAmountOfDisposableCups());
    }

    @Test
    void getAmountOfMoney() {
        int expectedMoney = 550;
        assertEquals(expectedMoney, cvm.getAmountOfMoney());
    }

    @Test
    void setAmountOfWater() {
        int expectedWaterToSet = 200;
        cvm.setAmountOfWater(200);
        assertEquals(expectedWaterToSet, cvm.getAmountOfWater());
    }

    @Test
    void setAmountOfMilk() {
        int expectedMilkToSet = 200;
        cvm.setAmountOfMilk(200);
        assertEquals(expectedMilkToSet, cvm.getAmountOfMilk());
    }

    @Test
    void setAmountOfCoffee() {
        int expectedCoffeeToSet = 200;
        cvm.setAmountOfCoffee(200);
        assertEquals(expectedCoffeeToSet, cvm.getAmountOfCoffee());
    }

    @Test
    void setAmountOfDisposableCups() {
        int expectedCupsToSet = 20;
        cvm.setAmountOfDisposableCups(20);
        assertEquals(expectedCupsToSet, cvm.getAmountOfDisposableCups());
    }

    @Test
    void setAmountOfMoney() {
        int expectedMoneyToSet = 200;
        cvm.setAmountOfMoney(200);
        assertEquals(expectedMoneyToSet, cvm.getAmountOfMoney());
    }

    @Test
    void makeCoffeeCheckTest() {

        cvm.makeCoffee(coffee);

        assertEquals(200, cvm.getAmountOfWater());
        assertEquals(440, cvm.getAmountOfMilk());
        assertEquals(108, cvm.getAmountOfCoffee());
        assertEquals(8, cvm.getAmountOfDisposableCups());
    }

    @Test
    void makeCoffeeWithEnoughSupplies() {
        String expectedString = "I have enough resources, making you a coffee!";

        Coffee coffee = new Cappuccino("Cappuccino");

        assertEquals(expectedString, cvm.makeCoffee(coffee));
    }

    @Test
    void makeCoffeeWithInsufficientWater() {
        String expectedOutput = "Sorry, not enough water!";

        cvm.setAmountOfWater(50);
        boolean notEnoughWater = coffee.getWater() > cvm.getAmountOfWater();

        assertTrue(notEnoughWater);
        assertEquals(expectedOutput, cvm.makeCoffee(coffee));
    }

    @Test
    void makeCoffeeWithInsufficientMilk() {
        String expectedOutput = "Sorry, not enough milk!";

        cvm.setAmountOfMilk(10);
        boolean notEnoughMilk = coffee.getMilk() > cvm.getAmountOfMilk();

        assertTrue(notEnoughMilk);
        assertEquals(expectedOutput, cvm.makeCoffee(coffee));
    }

    @Test
    void makeCoffeeWithInsufficientCoffee() {
        String expectedOutput = "Sorry, not enough coffee!";

        cvm.setAmountOfCoffee(5);
        boolean notEnoughCoffee = coffee.getCoffee() > cvm.getAmountOfCoffee();

        assertTrue(notEnoughCoffee);
        assertEquals(expectedOutput, cvm.makeCoffee(coffee));
    }

    @Test
    void makeCoffeeWithInsufficientDisposableCups() {
        String expectedOutput = "Sorry, not enough disposable cups!";

        cvm.setAmountOfDisposableCups(0);
        boolean notEnoughDisposableCups = cvm.getAmountOfDisposableCups() <= 0;

        assertTrue(notEnoughDisposableCups);
        assertEquals(expectedOutput, cvm.makeCoffee(coffee));
    }

    @Test
    void testToString() {
        String coffeeVendingMachineOutputString = "The coffee machine has:\n" +
                "100 ml of water\n" +
                "200 ml of milk\n" +
                "50 g of coffee beans\n" +
                "15 disposable cups\n" +
                "$200 of money";
        cvm.setAmountOfWater(100);
        cvm.setAmountOfMilk(200);
        cvm.setAmountOfCoffee(50);
        cvm.setAmountOfDisposableCups(15);
        cvm.setAmountOfMoney(200);

        assertEquals(coffeeVendingMachineOutputString, cvm.toString());
    }
}