package com.gp.factorypattern;

public class Squareimpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Square(正方形):实现类覆盖重写了方法");
    }
}
