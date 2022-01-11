package com.gp.advance.set;

import com.gp.primary.one.Zi;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo02HashSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小仙女",18);
        Person p2 = new Person("小仙女",18);
        Person p3 = new Person("小仙女",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));


    }

}
