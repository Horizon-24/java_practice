package com.gp.abstractfactorypattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red(红色)覆盖重写了fill方法");
    }
}
