package com.dezso.varga.exercise.design_patterns.factory_pattern;

public class ShapeTest {

    public static void main(String args[]) {

        Shape circle = ShapeFactory.createShape("circle");
        Shape rectangle = ShapeFactory.createShape("rectabgle");
        Shape square = ShapeFactory.createShape("square");

    }
}
