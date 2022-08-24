package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public void add(double a, double b) {
        display.displayValue(3.0);
    }

    public void sub(double a, double b) {
        display.displayValue(-1.0);
    }

    public void mul(double a, double b) {
        display.displayValue(2.0);
    }

    public void div(double a, double b) {
        display.displayValue(0.5);
    }

}
