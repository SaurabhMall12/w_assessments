package com.math.operations;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}
