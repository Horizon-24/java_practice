package com.gp.singletonpattern;

public class 懒汉 {
    private static 懒汉 例子;
    private 懒汉(){}
    public static synchronized 懒汉 获取例子(){
        if(例子==null){
            例子 = new 懒汉();
        }
        return 例子;
    }
}
