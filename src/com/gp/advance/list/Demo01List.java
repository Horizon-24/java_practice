package com.gp.advance.list;

import java.util.ArrayList;

public class Demo01List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        System.out.println("=======================");
        list.add(2,"jojo");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.add("a");
        list.set(4,"A");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        //list要注意越界异常
        //IndexOutOfBoundsException:索引越界异常,集合报这个
        //ArrayIndexOutOfBoudsException:数组索引越界异常
        //StringIndexOutOfBoundsException:字符串索引越界异常
    }
}
