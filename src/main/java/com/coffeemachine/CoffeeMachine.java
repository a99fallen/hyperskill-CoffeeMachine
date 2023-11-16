package com.coffeemachine;

import com.coffeemachine.Coffee.Cappuccino;
import com.coffeemachine.Coffee.Coffee;
import com.coffeemachine.Coffee.Espresso;
import com.coffeemachine.Coffee.Latte;
import com.coffeemachine.CoffeeVendingMachine.CoffeeVendingMachine;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CoffeeMachine {

    private static final int INITIAL_WATER = 400;
    private static final int INITIAL_MILK = 540;
    private static final int INITIAL_COFFEE = 120;
    private static final int INITIAL_DISPOSABLE_CUPS = 9;
    private static final int INITIAL_MONEY = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stillNeedToBeSet = true;
        String action = " ";

        CoffeeVendingMachine coffeeVendingMachine =
                new CoffeeVendingMachine(
                        INITIAL_WATER,
                        INITIAL_MILK,
                        INITIAL_COFFEE,
                        INITIAL_DISPOSABLE_CUPS,
                        INITIAL_MONEY);

        while(!action.equals("exit")) {
            printTakeAction();
            do {
                try {
                    action = scanner.nextLine();
                } catch (NoSuchElementException | IllegalStateException exception) {
                    printErrorMessage();
                    scanner.nextLine();
                    continue;
                }
                if (action.equals("buy")
                        || action.equals("fill")
                        || action.equals("take")
                        || action.equals("remaining")
                        || action.equals("exit")) {
                    stillNeedToBeSet = false;
                }
                else {
                    printErrorMessage();
                }
            } while (stillNeedToBeSet);

            takeAction(coffeeVendingMachine, action);
        }
        scanner.close();
    }    // END OF PROGRAM

    private static void printTakeAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
    }

    private static void printErrorMessage() {
        System.out.println("Please select on of values: 'buy', 'fill', 'take', 'remaining' or 'exit'");
    }

    private static void printChooseCoffeeType() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back:");
    }

    private static void buyAction(CoffeeVendingMachine coffeeVendingMachine) {
        printChooseCoffeeType();
        int number = setAmount("NUMBER");
        switch (number) {
            case 1 -> {
                Coffee espresso = new Espresso("Espresso");
                coffeeVendingMachine.makeCoffee(espresso);
            }
            case 2 -> {
                Coffee latte = new Latte("Latte");
                coffeeVendingMachine.makeCoffee(latte);
            }
            case 3 -> {
                Coffee cappuccino = new Cappuccino("Cappuccino");
                coffeeVendingMachine.makeCoffee(cappuccino);
            }
            default -> {
            }
        }
    }

    private static void takeAction(CoffeeVendingMachine coffeeVendingMachine, String action) {
        switch (action) {
            case "buy" -> buyAction(coffeeVendingMachine);
            case "fill" -> fillAction(coffeeVendingMachine);
            case "take" -> {
                System.out.println("I give you $" + coffeeVendingMachine.getAmountOfMoney());
                coffeeVendingMachine.setAmountOfMoney(0);
            }
            case "remaining" -> System.out.println("\n" + coffeeVendingMachine);
        }
    }

    public static int setAmount(String message) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 0) {
                    System.out.println("The " + message + " should be positive");
                }
            } catch (InputMismatchException | NumberFormatException ime) {
                System.out.println("Please insert NUMBER");
            }
        }
        while (number < 0);
        return number;
    }

    public static void fillAction(CoffeeVendingMachine cvm) {
        System.out.println("Write how many ml of water you want to add:");
        cvm.setAmountOfWater(cvm.getAmountOfWater()
                + setAmount("amount of water"));
        System.out.println("Write how many ml of milk you want to add:");
        cvm.setAmountOfMilk(cvm.getAmountOfMilk()
                + setAmount("amount of milk"));
        System.out.println("Write how many grams of coffee beans you want to add:");
        cvm.setAmountOfCoffee(cvm.getAmountOfCoffee()
                + setAmount("amount of coffee"));
        System.out.println("Write how many disposable cups you want to add:");
        cvm.setAmountOfDisposableCups(cvm.getAmountOfDisposableCups()
                + setAmount("amount of cups"));
    }
}
