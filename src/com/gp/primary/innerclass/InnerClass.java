package com.gp.primary.innerclass;

public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("====================");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
        Outer outer =  new Outer();
        outer.methoodOuter();
    }

}
