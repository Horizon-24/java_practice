package com.gp.advance.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_wildcard {
    public static void main(String[] args) {
        ArrayList<Integer> list01 =  new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);
    }
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
