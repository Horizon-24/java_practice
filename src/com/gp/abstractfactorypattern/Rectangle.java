package com.gp.abstractfactorypattern;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle(矩形，长方形)覆盖重写了draw方法");
    }
}
