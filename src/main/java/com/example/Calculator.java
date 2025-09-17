package com.example;

public class Calculator {
    boolean on = false;
    int a;
    int b;

    public boolean setOn() {
        on = true;
        return on;
    }

    public boolean isOff() {
        return !on;
    }

    public int getInputA() {
        return a;
    }

    public void setInputA(int a) {
        this.a = a;
    }

    public int getInputB() {
        return b;
    }

    public void setInputB(int b) {
        this.b = b;
    }

    public int add() {
        return a + b;
    }
}
