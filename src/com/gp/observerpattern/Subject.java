package com.gp.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //观察者（observer 的复数）
    private List<Observer> observers =new ArrayList<Observer>();

    //state 状态，状况
    private int state;

    public void setState(int state) {
        this.state = state;
        //notify All Observers 通知所有的观察者
        notifyAllObservers();
    }

    public int getState(){
        return state;
    }
    //attach赋予
    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {

        //    观察者   观察    :观察人士
        for(Observer observer:observers){
            observer.update();
        }
    }

}
