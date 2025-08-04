package com.nt.source;

import junit.framework.TestCase;

public class AppTest2 extends TestCase {

    Multiply mul = null;

    public void testMultiplyWithPositiveNumber() {
        mul = new Multiply();// here we creating hte object of that Multiply class

        int actual = mul.multiply(2, 5); // here it will take 2 number checks that our method is giving true result or not
        int expected = 10; // here it ask acutal result
        assertEquals(expected, actual); // here it compare acutal and expected
    }

    public void testMultiplyWithZero() {
        mul = new Multiply();

        int actual = mul.multiply(0, 5);
        int expected = 0;
        assertEquals(expected, actual);

    }

    public void testMultiplyWithNegative() {
        mul = new Multiply();

        int actual = mul.multiply(-5, -5);
        int expected = 25;
        assertEquals(expected, actual);

    }

    public void testMultiplyWithMixed() {
        mul = new Multiply();

        int actual = mul.multiply(-2, 5);
        int expected = -10;
        assertEquals(expected, actual);

    }

}