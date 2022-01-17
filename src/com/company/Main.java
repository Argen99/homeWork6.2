package com.company;

public class Main {

    public static void main(String[] args) {

        Boss thanos = new Boss();
        thanos.setHealth(700);
        thanos.setDamage(50);
        thanos.setSuperDamage("Удар с вертушки");

        Weapon weapon = new Weapon();
        weapon.setWeapon("Холодное оружие");
        weapon.setWeaponType("Нож");

        thanos.setBossWeapon(weapon);

        Skeleton skeleton = new Skeleton();
        skeleton.numberOfarrows = 5;

        Skeleton skeleton1 = new Skeleton();
        skeleton1.numberOfarrows = 1;

        System.out.println(thanos.printInfo());
        System.out.println(skeleton.printInfo());
        System.out.println(skeleton1.printInfo());

    }
}
