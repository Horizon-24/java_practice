package com.gp.advance.list;

import java.util.LinkedList;

public class DemoLinkeList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println("=========================");
        System.out.println(linked.removeFirst());
        System.out.println(linked.removeLast());
        System.out.println(linked);
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println("=========================");
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
        //clear()清空集合中的元素,在获取集合中的元素会抛出NoSuchElementException
        linked.getLast();
        System.out.println();
    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //addFirst(E e)将指定元素插入此列开头
        linked.addFirst("www");
        System.out.println(linked);
        //addLast(E e)将指定元素添加到此列表结尾
        linked.addLast(".com");
        System.out.println(linked);
    }
}
