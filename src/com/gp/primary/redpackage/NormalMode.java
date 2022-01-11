package com.gp.primary.redpackage;

import com.gp.primary.red.OpenMode;

import java.util.ArrayList;

//normalmode(普通模式,正常模式)
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;//平均值
        int mod = totalMoney%totalCount;//余数,模,零头
        //注意totalCount-1代表,最后一个先留着
        for (int i = 0; i < totalCount; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }
}
