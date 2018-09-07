package com.dezso.varga.exercise.design_patterns.factory_pattern;

public class ShapeFactory {

    public static Shape createShape(String name) {
        Shape shape;
        switch (name) {
            case "circle": shape = new Circle(); break;
            case "square": shape =  new Square(); break;
            case "rectangle": shape = new Rectangle(); break;
            default: throw new UnsupportedOperationException("Unsupported shape");
        }
        return shape;
    }
}
