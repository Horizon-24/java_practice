package com.gp.factorypattern;

public class Rectangleimpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle(矩形，长方形):实现类覆盖重写了方法");
    }
}
