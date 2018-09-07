package com.dezso.varga.exercise.design_patterns.factory_pattern;

public class Rectangle implements Shape {

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getSurface() {
        return length*width;
    };
}
