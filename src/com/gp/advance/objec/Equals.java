package com.gp.advance.objec;

public class Equals {
    public static void main(String[] args) {
        String s1 = "abc";

        String s2 = "abc";

        System.out.println(s1.equals(s2));

        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        System.out.println(stu1.equals(stu2));//equals方法默认是比较:1.基本数据类型是比较两个具体的值 2.如果是引用数据类型就是比较地址值
        //如果要对比属性要重写equals


    }
}
