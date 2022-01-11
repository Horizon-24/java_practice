package com.gp.primary.redpackage;

import com.gp.primary.red.OpenMode;

public class Bootstrap {
    public static void main(String[] args) {
        Myred red = new Myred("我的红包");
        red.setOwnerName("龚平");//owner所有人，物主
//        OpenMode normal = new NormalMode();//normal正常的，标准的；
//        com.gp.deug.red.setOpenWay(normal);
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
