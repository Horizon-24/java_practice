package com.gp.advance.hashcode;

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int i = p1.hashCode();
        System.out.println(i);

        Person p2 = new Person();
        int i1 = p2.hashCode();
        System.out.println(i1);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
