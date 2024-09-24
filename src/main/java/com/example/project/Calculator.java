package com.example.project;

public class Calculator{
    private String calcModel;

    // Constructor
    public Calculator(String calcType) {
        calcModel = calcType; 
    }
   
    public double performOperation(String operand, int n1, int n2) {
        switch (operand) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 != 0) {
                    return (double) n1 / n2;
                } else {
                    return 0.00;
                }
            default:
                return 0.00;
        }
    }

   public boolean divisibleBy(int n1, int n2) {
        if (n2 == 0) {
            return false;  // Division by zero is undefined
        }
        return n1 % n2 == 0;
    }

    public String coordinatePair(int x, int y) {
        return "(" + x + "," + y + ")";
    }

    public int absoluteValue(int n1, int n2) {
        return Math.abs(n1 - n2);
    }

    // Method that returns the model information of the calculator
    public String info() {
        return "This calculator is a model " + calcModel + " where " + calcModel + " should be filled in with the value stored in the calcModel instance variable.";
    }
}