package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public final class Calculator {

    private Display display;

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
