package com.gp.advance.dateformat;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        dome01();
        dome02();
    }

    private static void dome02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前"+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,4);
        System.out.println("复制后"+Arrays.toString(dest));
    }

    private static void dome01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long l = System.currentTimeMillis();
        System.out.println(l - s);
    }
}
