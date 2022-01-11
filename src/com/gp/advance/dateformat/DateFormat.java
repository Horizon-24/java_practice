package com.gp.advance.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        date();
        //SimpleDateFormat 日期格式日期类型777778855366
        date1();
    }

    private static void date1() {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = simpleDateFormat1.parse("2088年08月08日 17时01分10秒");
    }

    private static void date() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //SimpleDateFormat 日期格式日期类型
        String text = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(text);

    }
}
