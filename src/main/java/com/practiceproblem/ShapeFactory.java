package com.practiceproblem;

public class ShapeFactory {

    public Shape getInstance(String shapeType){

        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
