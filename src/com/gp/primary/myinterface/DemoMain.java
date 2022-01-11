package com.gp.primary.myinterface;

public class DemoMain {
    public static void main(String[] args) {
        MyInterface obj = new MyInterfaceImpl();
        obj.method();
        MyInterface objA = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        objA.method();
        MyInterface objB = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        objB.method();
    }
}
