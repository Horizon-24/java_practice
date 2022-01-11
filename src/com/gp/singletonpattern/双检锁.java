package com.gp.singletonpattern;

public class 双检锁 {
    private volatile static 双检锁 双检锁1;
    private 双检锁(){}
    public static 双检锁 获取双检锁(){
        if (双检锁1==null) {
            synchronized (双检锁.class){
                if (双检锁1==null){
                    双检锁1 = new 双检锁();
                }
            }
        }
        return 双检锁1;
    }
}
