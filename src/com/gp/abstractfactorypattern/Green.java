package com.gp.abstractfactorypattern;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green(绿色)覆盖重写了fill方法");
    }
}
