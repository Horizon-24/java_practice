package com.gp.advance.objec;

public class ToString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);

        Student s = new Student("辣妹",18);
        System.out.println(s.toString());//com.gp.advance.Objec.Student@xxxxxxx
        System.out.println(s);           //com.gp.advance.Objec.Student@xxxxxxx 两个是一样的重写tostring方法之后就是显示属性了
    }
}
