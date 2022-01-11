package com.gp.advance.varargs;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(mentuod01(1,2,3,4));
        mentuod(-128+127,-32768+32767,-2147483648+2147483647,-9223372036854775808L+9223372036854775807L,
                0.1f,0.000000000000000000001,"浮点数不能用来表示精确的值,如货币","abc",123456,"宠物","主人");
    }

    private static int mentuod01(int...a) {
        int sum = 0;
        for (int i : a) {
            sum +=i;
        }
        return sum;
    }

    public static void mentuod(Integer a,Integer b,Integer c, Long d,Float e,Double f,String g,Object...v){
        Object x;
        for (Object o : v) {
            System.out.println(o);
        }
    }
}
