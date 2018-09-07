package com.dezso.varga.exercise.design_patterns.factory_pattern;

public class Square implements Shape{

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return side*side;
    }

}
