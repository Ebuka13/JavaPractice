package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    Arithmetic arithmetic;

    @BeforeEach
    void startAllWithTest() {
        arithmetic = new Arithmetic();
    }
    @Test
    void squareSum() {
        assertEquals(25, arithmetic.squareSum(5));
    }

    @Test
    void squareMinus() {
        assertEquals(0, arithmetic.squareMinus(5, 5));
    }

    @Test
    void sum() {
        assertEquals(10, arithmetic.sum(5, 5));
    }

    @Test
    void average() {
        assertEquals(2, arithmetic.average(2, 2, 2));
    }

    @Test
    void product() {
        assertEquals(20, arithmetic.product(5, 1, 4));
    }
}