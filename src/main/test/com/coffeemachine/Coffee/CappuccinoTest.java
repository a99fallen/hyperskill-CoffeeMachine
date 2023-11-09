package com.coffeemachine.Coffee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CappuccinoTest {

    Coffee coffee = new Cappuccino("Cappuccino");

    @Test
    public void testCappuccinoConstructor() {
        assertEquals("Cappuccino", coffee.getName());
    }

    @Test
    void getWater() {
        int expectedWater = 200;
        assertEquals(expectedWater, coffee.getWater());
    }

    @Test
    void getMilk() {
        int expectedMilk = 100;
        assertEquals(expectedMilk, coffee.getMilk());
    }

    @Test
    void getCoffee() {
        int expectedCoffee = 12;
        assertEquals(expectedCoffee, coffee.getCoffee());
    }

    @Test
    void getCost() {
        int expectedCost = 6;
        assertEquals(expectedCost, coffee.getCost());
    }
}