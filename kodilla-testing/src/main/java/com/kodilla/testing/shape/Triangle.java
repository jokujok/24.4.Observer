package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private Double length;
    private Double height;

    public Triangle(String shapeName, Double length, Double height) {
        this.shapeName = shapeName;
        this.length = length;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Double getField() {
        return length * height / 2;
    }
}
