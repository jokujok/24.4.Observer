package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private Double Pi;
    private Double radius;

    public Circle(String shapeName, Double pi, Double radius) {
        this.shapeName = shapeName;
        Pi = pi;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Double getField() {
        return Pi * radius * radius;
    }
}
