package com.gp.primary.one;

import com.gp.primary.one.entity.Student;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Random r = new Random();//产生随机数
//        for (int i = 0; i < 6; i++) {
//            int num = r.nextInt(33) + 1;
//            list.add(num);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("jojo",20);
        Student tow = new Student("diao",999);
        Student san = new Student("diao",999);
        Student si = new Student("diao",999);
        list.add(one);
        list.add(tow);
        list.add(san);
        list.add(si);
        for (int i = 0; i < list.size(); i++) {
            Student stu =list.get(i);
            System.out.println("姓名:"+stu.getName()+"年龄:"+stu.getAge());
        }


    }
}
