package com.gp.primary.polymorphic;

public class Zi extends Fu{
    int num = 30;

    @Override
    public void Fu_a() {
       System.out.println("子类方法的数:"+num);
    }
}
