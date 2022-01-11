package com.gp.advance.collection;

import java.util.ArrayList;
import java.util.Collection;

//  boolean 布尔型
//  boolean add(E e); 向集合中添加元素
//  boolean remover(E e); 删除集合中的某个元素
//  void clear(); 清空集合
//  boolean contains(E e); 判断集合中是否包含某个元素
//  boolean isEmpty(); 判断集合是否为空
//  int size(); 获取集合的长度
//  Object[] toArray(); 将集合转换成一个数组
public class Dome01Collection_ {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //  boolean add(E e); 向集合中添加元素
        {
            collection.add("hello");
            collection.add("world");
            collection.add("heima");
            collection.add("java");
            System.out.println(collection);
        }
        //  boolean remover(E e); 删除集合中的某个元素
        {
            collection.remove("heima");
            System.out.println(collection);
        }
        //  void clear(); 清空集合
        {
            collection.clear();
            System.out.println(collection);
        }
        {
            collection.add("hello");
            collection.add("world");
            collection.add("heima");
            collection.add("java");
            for (String s : collection) {
                System.out.println(s);
            }
        }
        //  boolean contains(E e); 判断集合中是否包含某个元素
        {
            boolean c = collection.contains("hello");
            System.out.println(c);
        }
        //  boolean isEmpty(); 判断集合是否为空
        {
            boolean a=collection.isEmpty();
            System.out.println(a);
        }
        //  int size(); 获取集合的长度
        {
            int a =collection.size();
            System.out.println(a);
        }
        //  Object[] toArray(); 将集合转换成一个数组
        {
            System.out.println(collection.toArray());
        }

    }
}
