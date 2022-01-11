package com.gp.abstractfactorypattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square(正方形；（方形）广场)覆盖重写了draw方法");
    }
}
