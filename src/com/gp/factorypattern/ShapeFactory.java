package com.gp.factorypattern;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        // equalsIgnoreCase()方法用于将字符串与指定的对象比较，不考虑大小写。
        if (shapeType.equalsIgnoreCase("CRCLE")){
            return new Circleimpl();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangleimpl();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Squareimpl();
        }
        return null;
    }
}