package com.example;

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Soustraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Puissance
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Racine carrée
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}