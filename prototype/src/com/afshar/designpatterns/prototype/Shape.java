package com.afshar.designpatterns.prototype;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape(Shape value) {
        if (value != null) {
            this.x = value.x;
            this.y = value.y;
            this.color = value.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }


}
