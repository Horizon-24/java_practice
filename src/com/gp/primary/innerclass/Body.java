package com.gp.primary.innerclass;

public class Body {

    public class Heart{//成员内部类
        //内部类方法
        public void beat(){
            System.out.println("内部类方法");
            System.out.println("我是"+name);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name="ed";
    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }
}
