package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private String nameOfFigure;
    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }

    public void addFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector(nameOfFigure);
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Circle getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return (Circle) shapes.get(n);
        }
        return null;
    }

    public String showFigures() {
        return String.valueOf(shapes.size());
    }

    public String getNameOfFigure() {
        return nameOfFigure;
    }
}
