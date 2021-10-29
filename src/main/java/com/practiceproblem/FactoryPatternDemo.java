package com.practiceproblem;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getInstance("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getInstance("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getInstance("SQUARE");
        shape3.draw();
//        Circle circle = new Circle();
//        circle.draw();
    }
}
