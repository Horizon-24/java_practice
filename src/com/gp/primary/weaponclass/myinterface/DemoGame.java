package com.gp.primary.weaponclass.myinterface;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("寒冰");
        hero.setSkill(new SkillImpl());
        hero.attack();
    }

}
