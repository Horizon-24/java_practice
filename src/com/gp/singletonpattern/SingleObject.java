package com.gp.singletonpattern;

public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance= new SingleObject();
    //创建 SingleObject 的一个对象
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }

}
