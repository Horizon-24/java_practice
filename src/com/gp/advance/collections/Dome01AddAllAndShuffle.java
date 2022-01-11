package com.gp.advance.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Dome01AddAllAndShuffle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Collections.addAll往集合中添加一些元素
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        //Collections.shuffle打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);



    }
}
