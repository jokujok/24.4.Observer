package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {

    @Autowired
    private Display display;

    public void addition() {
        display.add(2,2);
    }
    public void subtraction() {
        display.sub(2,2);
    }
    public void multiplication() {
        display.mul(2,2);
    }
    public void division() {
        display.div(2,2);
    }

}
