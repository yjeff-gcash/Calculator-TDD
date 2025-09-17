package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
