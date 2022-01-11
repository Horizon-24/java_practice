package com.gp.advance.generic;

public class GenericClassDemo {
    public static void main(String[] args) {
        //不写数据默认为Object类型
        GenericClass genericClass = new GenericClass();
        genericClass.setName("只能说字符串");
        Object obj = genericClass.getName();
        System.out.println(obj);

        GenericClass<Object> gc = new GenericClass<>();
        gc.setName(1);
        System.out.println(gc.getName());

        GenericClass<Integer> aClass = new GenericClass<>();
        aClass.setName(1);

        System.out.println(aClass.getName());


    }
}
