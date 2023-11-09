package com.coffeemachine.Coffee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    private Coffee coffee = new Espresso("Espresso");

    @Test
    public void testGetWater() {
        int expectedWater = 250;
        assertEquals(expectedWater, coffee.getWater());
    }

    @Test
    public void testGetMilk() {
        int expectedMilk = 0;
        assertEquals(expectedMilk, coffee.getMilk());
    }

    @Test
    public void testGetCoffee() {
        int expectedCoffee = 16;
        assertEquals(expectedCoffee, coffee.getCoffee());
    }

    @Test
    public void testGetCost() {
        int expectedCost = 4;
        assertEquals(expectedCost, coffee.getCost());
    }
}