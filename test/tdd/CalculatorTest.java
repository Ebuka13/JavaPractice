package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void startAllTestWith() {
        calculator =  new Calculator();
    }

    //@Test
     //void testThatObjectExit() {
       // assertNotNull(calculator);
    //}

    @Test
     void sum() {
        assertEquals(5, calculator.addTwoNumbers(2,3));
    }

    @Test
    void subtract() {

    }
    @Test
    void squareRoot() {
        assertEquals(2, calculator.squareRoot(4));
    }

}