package com.gp.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♣","♥","♠","♦"};
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String i:num
             ) {
            for (String color : colors) {
                poker.add(color+i);
            }
        }
//        System.out.println(poker);
        //洗牌
        Collections.shuffle(poker);
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i <poker.size() ; i++) {
            String p = poker.get(i);
            if (i>=51){
                diPai.add(p);
            }else if (i%3==0){
                play01.add(p);
            }else if (i%2==0){
                play02.add(p);
            }else if (i%1==0){
                play03.add(p);
            }
        }
        System.out.println("刘德华"+play01);
        System.out.println("周润发"+play02);
        System.out.println("周星驰"+play03);
        System.out.println(diPai);

    }
}
