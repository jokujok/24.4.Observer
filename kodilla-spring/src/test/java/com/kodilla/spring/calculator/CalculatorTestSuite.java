package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculationsAdd() {
        //Given
        //When
        double actual = calculator.add(1,2);
        double actual2 = calculator.add(-2,0);
        double actual3 = calculator.add(0,5);
        //Then
        Assertions.assertEquals(3, actual);
        Assertions.assertEquals(-2,actual2);
        Assertions.assertEquals(5,actual3);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        //When
        double actual = calculator.sub(1,2);
        double actual2 = calculator.sub(-2,0);
        double actual3 = calculator.sub(0,6);
        //Then
        Assertions.assertEquals(-1.0,actual);
        Assertions.assertEquals(-2,actual2);
        Assertions.assertEquals(-6.0,actual3);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        //When
        double actual = calculator.mul(1,2);
        double actual2 = calculator.mul(-2,4);
        double actual3 = calculator.mul(0,3);
        //Then
        Assertions.assertEquals(2.0,actual);
        Assertions.assertEquals(-8,actual2);
        Assertions.assertEquals(0,actual3);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        //When
        double actual = calculator.div(1,2);
        double actual2 = calculator.div(-3,-2);
        double actual3 = calculator.div(-5,2);
        //Then
        Assertions.assertEquals(0.5,actual);
        Assertions.assertEquals(1.5,actual2);
        Assertions.assertEquals(-2.5,actual3);
    }
}
