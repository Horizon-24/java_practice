package com.gp.primary.one;
public class  dan {
//    //创建 dan的一个对象
//    private static dan instance = new dan();
//
//    //让构造函数为 private，这样该类就不会被实例化
//    private dan(){}

//    //获取唯一可用的对象
//    public static dan getInstance(){
//        return instance;
//    }
//
//    public void showMessage(){
//        System.out.println("Hello World!");
//    }
    public static dan instance=null;
    private dan(){}
    public static dan GetInstance(){
        if (instance==null)
            instance=new dan();
        return instance;
    }
}

