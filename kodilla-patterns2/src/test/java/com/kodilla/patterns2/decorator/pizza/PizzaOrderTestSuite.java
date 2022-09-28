package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test                                                 // [6]
    public void testBasicPizzaOrderGetCost() {             // [7]
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();         // [8]
        // When
        BigDecimal calculatedCost = theOrder.getCost();    // [9]
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);   // [10]
    }                                                     // [11]

    @Test                                                 // [12]
    public void testBasicPizzaOrderGetDescription() {      // [13]
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();         // [14]
        // When
        String description = theOrder.getDescription();    // [15]
        // Then
        assertEquals("Order a basic pizza", description);       // [16]
    }

    @Test
    public void testBasicPizzaOrderWithPepperoniGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testBasicPizzaOrderWithPepperoniGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a basic pizza + pepperoni", description);
    }

    @Test
    public void testBasicPizzaOrderWithMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), theCost);
    }

    @Test
    public void testBasicPizzaOrderWithMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a basic pizza + mushrooms", description);
    }

    @Test
    public void testBasicPizzaOrderWithPepperoniMushroomsAndOLivesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder =  new PepperoniOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new OlivesOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21), theCost);
    }

    @Test
    public void testBasicPizzaOrderWithPepperoniMushroomsAndOlivesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new OlivesOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a basic pizza + pepperoni + mushrooms + olives", description);
    }
}
