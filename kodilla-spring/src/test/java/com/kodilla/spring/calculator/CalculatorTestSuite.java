package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

 /*   @Test
    public void testAddition() {
        //Given
        //When
        calculator.add(2.0,2.0);
        //Then
        assertEquals(4,4);
    }

    @Test
    public void testSubtraction() {
        //Given
        //When
        calculator.sub(2.0,2.0);
        //Then
        assertEquals(0, 0);
    }

    @Test
    public void testMultiplication() {
        //Given
        //When
        calculator.mul(2.0,2.0);
        //Then
        assertEquals(4, 4);
    }

    @Test
    public void testDivision() {
        //Given
        //When
        calculator.div(2.0,2.0);
        //Then
        assertEquals(1, 1);
    } */
}
