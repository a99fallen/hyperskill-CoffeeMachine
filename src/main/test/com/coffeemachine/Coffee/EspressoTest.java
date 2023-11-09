package com.coffeemachine.Coffee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspressoTest {

    Coffee coffee = new Espresso("Espresso");

    @Test
    public void testEspressoConstructor() {

        assertEquals("Espresso", coffee.getName());
    }

    @Test
    void getWater() {
        int expectedWater = 250;
        assertEquals(expectedWater, coffee.getWater());
    }

    @Test
    void getMilk() {
        int expectedMilk = 0;
        assertEquals(expectedMilk, coffee.getMilk());
    }

    @Test
    void getCoffee() {
        int expectedCoffee = 16;
        assertEquals(expectedCoffee, coffee.getCoffee());
    }

    @Test
    void getCost() {
        int expectedCost = 4;
        assertEquals(expectedCost, coffee.getCost());
    }
}