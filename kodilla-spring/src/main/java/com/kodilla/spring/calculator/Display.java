package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public final class Display {

    public void displayValue(double val) {
    }

    public double add(double a, double b) {
        return a+b;
    }

    public double sub(double a, double b) {
        return a-b;
    }

    public double mul(double a, double b) {
        return a*b;
    }

    public double div(double a, double b) {
        return a/b;
    }
}
