package com.gp.primary.innerclass;

//Outer(外部的)
public class Outer {
    //methood(方法)
    int num = 10;//外部成员变量

    public void methoodOuter() {

        class innerClass {
            int num = 20;//内部成员变量

            public void innerMethood() {
                System.out.println("局部内部方法");
                System.out.println(num);//局部变量,就近原则
                System.out.println(this.num);//内部类的成员变量
                System.out.println(Outer.this.num);///外部类的成语变量
            }
        }
        innerClass innerClass = new innerClass();
        innerClass.innerMethood();
    }
}
