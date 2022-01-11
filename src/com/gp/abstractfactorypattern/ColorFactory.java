package com.gp.abstractfactorypattern;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
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
