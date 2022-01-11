package com.gp.factorypattern;

public class Circleimpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle(圆，圆形物):覆盖重写了方法");
    }
}
