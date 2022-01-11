package com.gp.abstractfactorypattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle(圆，圆形物)覆盖重写了draw方法");
    }
}
