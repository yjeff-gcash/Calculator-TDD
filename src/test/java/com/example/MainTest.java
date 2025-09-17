package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void isOff() {
        assertTrue(c.isOff());
    }

    @Test
    void isOn() {
        c.setOn(true);
        assertFalse(c.isOff());
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
        c.setInputA(1);
        c.setInputB(2);

        assertEquals(3, c.add());
    }

    @Test
    void addNegativeNumbers() {
        c.setInputA(-1);
        c.setInputB(-2);

        assertEquals(-3, c.add());
    }

    @Test
    void addZero() {
        c.setInputA(0);
        c.setInputB(0);

        assertEquals(0, c.add());

        c.setInputB(1);

        assertEquals(1, c.add());
    }

    @Test
    void addPositiveAndNegativeNumbers() {
        c.setInputA(1);
        c.setInputB(-1);

        assertEquals(0, c.add());

        c.setInputA(-5);
        c.setInputB(3);

        assertEquals(-2, c.add());
    }
}
