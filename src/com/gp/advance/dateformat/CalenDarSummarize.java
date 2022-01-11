package com.gp.advance.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenDarSummarize {
    public static void main(String[] args) {
        //空参构造方法
        Date date = new Date();
        System.out.println(date.toLocaleString());
        System.out.println("===============================");
        //创建日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //parse根据指定格式解析字符串
        String srt = "2077年1月1日 1:00:00";
        try {
            System.out.println(simpleDateFormat.parse(srt));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("===============================");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.YEAR,2088);
        int a = Calendar.YEAR;
        System.out.println(calendar.get(a));

    }
}