package com.gp.itheima;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Ddoudizhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♣","♥","♠","♦"};
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String s : num) {
            for (String i : colors) {
                poker.add(s+i);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            System.out.print(i+"%3="+i%3+" ");
            System.out.print(i+"%2="+i%2+" ");
            System.out.print(i+"%1="+i%1+" ");
            System.out.println();
            String a = poker.get(i);
            if (i>=51){
                diPai.add(a);
            }else if (i%3==0){
                play01.add(a);
            }else if (i%2==0){
                play02.add(a);
            }else if (i%1==0){
                play03.add(a);
            }
        }

        System.out.println("萝莉"+play01+play01.size());
        System.out.println("大仙"+play02+play02.size());
        System.out.println("美女"+play03+play03.size());
        System.out.println(diPai);
    }
}
