package com.example;

public class Calculator {
    boolean on = false;
    int a;
    int b;

    public boolean isOn() {
        return on;
    }

    public boolean isOff() {
        return !on;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int add() {
        return a + b;
    }
}
