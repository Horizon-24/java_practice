package com.gp.advance.dateformat;

public class Integer_ {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        System.out.println(i1);//重写了tostring方法

        Integer i2 = new Integer("1");
        System.out.println(i2);

        System.out.println("===========================");
        Integer i3 = Integer.valueOf(1);
        System.out.println(i3);
//        Integer i4 = Integer.valueOf("a");必须是基本类型
//        System.out.println(i4);
        System.out.println("===========================");
        int i = i1.intValue();
        System.out.println(i);


    }
}
