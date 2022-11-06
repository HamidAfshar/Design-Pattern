package com.afshar.designpattern.adaptor;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }

        Person person = new Person("hamid", "afshar", 31);
        System.out.println(person.toJson());
        XmlAdapter xmlAdapter = new PersonXmlAdapterImpl(person);
        System.out.println(xmlAdapter.toXml());
    }
}