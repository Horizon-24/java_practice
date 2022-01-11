package com.gp.abstractfactorypattern;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue(蓝色)覆盖重写了fill方法");
    }
}
