package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private Double length;

    public Square(String shapeName, Double length) {
        this.shapeName = shapeName;
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Double getField() {
        return length * 2;
    }
}
