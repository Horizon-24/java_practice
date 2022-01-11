package com.gp.advance.collections;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Dome01Sort {
    public static void main(String[] args) {
        Vector<?> objects = new Vector<>();
        ArrayList<Integer> list01 = new ArrayList<>();
        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list01,4,2,3,1);
        System.out.println(list01);
        //sort将集合按默认规则排序
        Collections.sort(list01);
        System.out.println(list01);

        Collections.addAll(list02,"a","c","b","e");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        Collections.addAll(list03,new Person("洪七公",58),new Person("郭靖",19),new Person("黄蓉",18));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);

    }
}
