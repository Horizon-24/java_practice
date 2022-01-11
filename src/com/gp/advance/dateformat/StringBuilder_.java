package com.gp.advance.dateformat;

public class StringBuilder_ {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println("stringBuilder1:"+stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println("stringBuilder2:"+stringBuilder2);
        System.out.println(stringBuilder1==stringBuilder2);
    }
}
