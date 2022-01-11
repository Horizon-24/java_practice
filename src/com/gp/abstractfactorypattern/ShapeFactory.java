package com.gp.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shpaeType) {
        if (shpaeType == null){
            return null;
        }else if(shpaeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shpaeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shpaeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
