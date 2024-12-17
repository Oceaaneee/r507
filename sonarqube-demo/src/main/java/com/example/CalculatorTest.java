package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Test pour l'addition
    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0);
        assertEquals(-1.0, calculator.add(2.0, -3.0), 0.0);
    }

    // Test pour la soustraction
    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.0);
        assertEquals(-5.0, calculator.subtract(-3.0, 2.0), 0.0);
    }

    // Test pour la multiplication
    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0);
        assertEquals(-6.0, calculator.multiply(-2.0, 3.0), 0.0);
    }

    // Test pour la division
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0);
        try {
            calculator.divide(1.0, 0.0);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test pour la puissance
    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.0);
        assertEquals(1.0, calculator.power(3.0, 0.0), 0.0);
    }

    // Test pour la racine carrée
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16.0), 0.0);
        try {
            calculator.squareRoot(-1.0);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}
