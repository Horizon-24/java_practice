package com.gp.观察者模式;

public class 二进制观察者 extends 观察者类{
    public 二进制观察者(主题类 主题){
        this.主题 = 主题;
        this.主题.赋予(this);
    }

    @Override
    public void 更新() {
        System.out.println("二进制串"+Integer.toBinaryString(主题.get状态()));
    }
}
