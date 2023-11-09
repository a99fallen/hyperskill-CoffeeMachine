package com.coffeemachine.Coffee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LatteTest {

    Coffee coffee = new Latte("Latte");

    @Test
    public void testLatteConstructor() {
        assertEquals("Latte", coffee.getName());
    }
    @Test
    void getWater() {
        int expectedWater = 350;
        assertEquals(expectedWater, coffee.getWater());
    }

    @Test
    void getMilk() {
        int expectedMilk = 75;
        assertEquals(expectedMilk, coffee.getMilk());
    }

    @Test
    void getCoffee() {
        int expectedCoffee = 20;
        assertEquals(expectedCoffee, coffee.getCoffee());
    }

    @Test
    void getCost() {
        int expectedCost = 7;
        assertEquals(expectedCost, coffee.getCost());
    }
}