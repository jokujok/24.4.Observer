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
        calculator.add(1,2);
        //Then
        Assertions.assertEquals(3.0,3.0);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        //When
        calculator.sub(1,2);
        //Then
        Assertions.assertEquals(-1.0,-1.0);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        //When
        calculator.mul(1,2);
        //Then
        Assertions.assertEquals(2.0,2.0);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        //When
        calculator.div(1,2);
        //Then
        Assertions.assertEquals(0.5,0.5);
    }
}
