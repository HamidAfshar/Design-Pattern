package com.afshar.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory();
        Shape shape = shapeFactory.createShape();
        System.out.println("result is : " + shape.draw());
    }
}