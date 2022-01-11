package com.gp.singletonpattern;

public class 饿汉 {
    private static 饿汉 例子 = new 饿汉();
    private 饿汉(){}
    public static 饿汉 获取饿汉(){
        return 例子;
    }
}
