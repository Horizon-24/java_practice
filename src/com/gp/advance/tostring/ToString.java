package com.gp.advance.tostring;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);//com.gp.advance.tostring.Person@xxxxxxxx 没有重写方法
        System.out.println(p);
        Random r = new Random();
        System.out.println(r);

        Scanner sr = new Scanner(System.in);
        System.out.println(sr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
    }
}
