package com.gp.primary.weaponclass;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        Weapon weapon = new Weapon("无尽之刃");
        hero.setWeapon(weapon);
        hero.attack();

    }
}
