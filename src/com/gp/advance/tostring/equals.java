package com.gp.advance.tostring;

public class equals {
    public static void main(String[] args) {

    Person p1 = new Person("迪丽热巴", 18);
    Person p2 = new Person("古力娜扎", 18);

    p1=p2;

    System.out.println("p1:"+p1);
    System.out.println("p2:"+p2);

    boolean b = p1.equals(p2);
    System.out.println(b);

    }
}
