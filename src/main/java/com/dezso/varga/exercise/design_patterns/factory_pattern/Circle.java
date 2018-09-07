package com.dezso.varga.exercise.design_patterns.factory_pattern;

public class Circle implements Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI*radius*radius;
    }
}
