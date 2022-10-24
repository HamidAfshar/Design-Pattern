package com.afshar.designpatterns.prototype;

public class Rectangle extends Shape {

    protected int width;
    protected int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle value) {
        super(value);
        if (value != null) {
            this.width = value.width;
            this.height = value.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

}
