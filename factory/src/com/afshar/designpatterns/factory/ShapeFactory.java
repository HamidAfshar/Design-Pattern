package com.afshar.designpatterns.factory;

public class ShapeFactory {

    public Shape createShape(ShapeType type) {
        return switch (type) {
            case Circle -> new Circle();
            case Rectangle -> new Rectangle();
            case Square -> new Square();
            default -> new Shape() {
                @Override
                String draw() {
                    return "Default";
                }
            };
        };
    }
}
