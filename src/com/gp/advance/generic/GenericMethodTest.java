package com.gp.advance.generic;

public class GenericMethodTest {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method(10);
        gm.method("abc");
        gm.method("1.01");
        gm.method(true);
        System.out.println(gm.getClass());
        gm.method("静态方法,不建议创建对象使用");
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);

    }
}
