package com.afshar.designpatterns.prototype;

import java.util.Objects;

public class Circle extends Shape {

    protected int radius;

    public Circle() {
    }

    public Circle(Circle value) {
        super(value);
        if (value != null) {
            this.radius = value.radius;
        }

    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

}
