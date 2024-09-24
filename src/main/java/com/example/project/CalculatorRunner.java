package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        // 1. Create an instance of the calculator class
        Calculator calculator = new Calculator("TI84");
        System.out.println(calculator);
        // 2. Call any methods of that class to test

        // Testing performOperation method
        System.out.println("5 + 3 = " + calculator.performOperation("+", 5, 3));
        System.out.println("10 - 2 = " + calculator.performOperation("-", 10, 2));
        System.out.println("4 * 7 = " + calculator.performOperation("*", 4, 7));
        System.out.println("9 / 3 = " + calculator.performOperation("/", 9, 3));
        System.out.println("9 / 0 (invalid) = " + calculator.performOperation("/", 9, 0));
        System.out.println("Invalid operand test: " + calculator.performOperation("%", 9, 3));

        // Testing divisibleBy method
        System.out.println("Is 10 divisible by 2? " + calculator.divisibleBy(10, 2));
        System.out.println("Is 10 divisible by 3? " + calculator.divisibleBy(10, 3));
        System.out.println("Is 10 divisible by 0? " + calculator.divisibleBy(10, 0)); 

        // Testing coordinatePair method
        System.out.println("Coordinate pair for (5, 7): " + calculator.coordinatePair(5, 7));

        // Testing absoluteValue method
        System.out.println("Absolute value of 10 - 4: " + calculator.absoluteValue(10, 4));
        System.out.println("Absolute value of 4 - 10: " + calculator.absoluteValue(4, 10));

        // Testing info method
        System.out.println(calculator.info());
    }
}