package com.gp.primary.one;

import com.gp.primary.one.entity.Phone;

import java.util.ArrayList;

public  class type {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand="苹果";
        one.peice=8888.0;
        one.color="土豪金";
        method(one);
//        Scanner sum = new Scanner(System.in);
//        int num = sum.nextInt();
//        System.out.println(num);
       ArrayList<String> list = new ArrayList<>();
       list.add("迪丽热巴");
       list.add("古力娜扎");
       System.out.println(list.get(0));
       System.out.println(list.size());


    }

    public  static  void method(Phone p){
    System.out.println(p.brand);
    System.out.println(p.peice);
    System.out.println(p.color);
    }
}
