package com.gp.primary.weaponclass.myinterface;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        return list;
    }
}
