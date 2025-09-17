package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator c;
    private IllegalStateException exception;

    @BeforeEach
    void setUp() {
        c = new Calculator();
        exception = new IllegalStateException();
    }

    @Test
    void testInitialState(){
        assertTrue(c.isOff());
        assertEquals(0, c.getInputA());
        assertEquals(0, c.getInputB());
    }

    @Test
    void testSetOn() {
        c.setOn();
        assertFalse(c.isOff());
    }
    
    @Test
    void shouldThrowExceptionWhenAddingWhileOff() {
        c.setInputA(1);
        c.setInputB(2);

        exception = assertThrows(IllegalStateException.class, () -> c.add());
        assertEquals("Calculator is off", exception.getMessage());
    }

    @Test
    void setInputA() {
        int input = 1;
        c.setInputA(input);

        assertEquals(input, c.getInputA());
    }

    @Test
    void setInputB() {
        int input = 1;
        c.setInputB(input);

        assertEquals(input, c.getInputB());
    }

    @Test
    void addPositiveNumbers() {
        c.setOn();
        c.setInputA(1);
        c.setInputB(2);

        assertEquals(3, c.add());
    }

    @Test
    void addNegativeNumbers() {
        c.setOn();
        c.setInputA(-1);
        c.setInputB(-2);

        assertEquals(-3, c.add());
    }

    @Test
    void addZero() {
        c.setOn();
        c.setInputA(0);
        c.setInputB(0);

        assertEquals(0, c.add());

        c.setInputB(1);

        assertEquals(1, c.add());
    }

    @Test
    void addPositiveAndNegativeNumbers() {
        c.setOn();
        c.setInputA(1);
        c.setInputB(-1);

        assertEquals(0, c.add());

        c.setInputA(-5);
        c.setInputB(3);

        assertEquals(-2, c.add());
    }

    @Test
    void shouldThrowExceptionWhenSubtractingWhileOff() {
        c.setInputA(1);
        c.setInputB(2);

        exception = assertThrows(IllegalStateException.class, () -> c.subtract());
        assertEquals("Calculator is off", exception.getMessage());
    }


    @Test
    void subtractPositiveNumbers() {
        c.setOn();
        c.setInputA(1);
        c.setInputB(2);
        assertEquals(-1, c.subtract());
    }

    @Test
    void subtractNegativeNumbers() {
        c.setOn();
        c.setInputA(-1);
        c.setInputB(-2);
        assertEquals(1, c.subtract());
    }

    @Test
    void subtractZero() {
        c.setOn();
        c.setInputA(0);
        c.setInputB(0);
        assertEquals(0, c.subtract());
    }

    @Test
    void subtractPositiveAndNegativeNumbers() {
        c.setOn();
        c.setInputA(1);
        c.setInputB(-1);
        assertEquals(2, c.subtract());
    }

}
