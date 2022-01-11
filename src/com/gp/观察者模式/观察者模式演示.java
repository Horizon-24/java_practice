package com.gp.观察者模式;

public class 观察者模式演示 {
    public static void main(String[] args) {
        主题类 主题类对象 = new 主题类();

        new 六进制观察者(主题类对象);
        new 八进制观察者(主题类对象);
        new 二进制观察者(主题类对象);
        System.out.println("第一个状态变化:15");
        主题类对象.set状态(15);
        System.out.println("第二个状态变化:10");
        主题类对象.set状态(10);
    }
}
