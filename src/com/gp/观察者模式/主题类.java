package com.gp.观察者模式;

import com.gp.observerpattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class 主题类 {
    private List<观察者类> 观察者 = new ArrayList<观察者类>();
    private int 状态;

    public int get状态() {
        return 状态;
    }

    public void set状态(int 状态) {
        this.状态 = 状态;
        通知所有的观察者();
    }
    public void 赋予(观察者类 观察人){
        观察者.add(观察人);
    }

    private void 通知所有的观察者() {

        for (观察者类 i:观察者){
              i.更新();
        }
    }
}
