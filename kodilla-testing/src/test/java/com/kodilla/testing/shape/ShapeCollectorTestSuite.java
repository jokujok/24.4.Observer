package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Circle");
        Circle circle = new Circle("circle",6.28,10.0);

        //When
        shapeCollector.addFigure(circle);

        //Then
        assertEquals(1,shapeCollector.getFigure(1));
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Circle");
        Circle circle = new Circle("circle",6.28,10.0);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        assertFalse(result);
    }
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Circle");
        Circle circle = new Circle("circle",6.28,10.0);
        shapeCollector.addFigure(circle);

        //When
        Circle retrivedCircle;
        retrivedCircle = shapeCollector.getFigure(0);

        //Then
        assertEquals(circle,retrivedCircle);
    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCircle = new ShapeCollector("Circle");
        ShapeCollector shapeSquare = new ShapeCollector("Square");
        ShapeCollector shapeTriangle = new ShapeCollector("Triangle");
        Circle circle = new Circle("circle",6.28,10.0);
        Square square = new Square("square",5.0);
        Triangle triangle = new Triangle("triangle",5.0,10.0);

        //When
        shapeCircle.showFigures();
        shapeSquare.showFigures();
        shapeTriangle.showFigures();

        //Then
        assertEquals(1,shapeCircle.showFigures());
        assertEquals(1,shapeSquare.showFigures());
        assertEquals(1,shapeTriangle.showFigures());
    }
}
