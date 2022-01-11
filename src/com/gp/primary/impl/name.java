package com.gp.primary.impl;

public interface name {
    public abstract void name();//抽象方法
    void name_1();
    void name_2();

    //默认方法,接口的默认方法可以通过接口实现类对象直接调用
    default void name_3(){
        //方法体
    }
    public static void static_(){
        System.out.println("这是接口的静态方法");
    }
    private void name_4(){
        System.out.println("私有方法");
    }
    default void name_5(){
        name_4();
    }
    default void name_6(){
        name_4();
    }
    default void name_7(){
        name_4();
    }
    default void name_8(){
        name_4();
    }
    public static final int NUM_OF_MY_CALL= 100;
}
