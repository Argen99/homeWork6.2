package com.company;

public class Boss extends GameEntity{

   private Weapon bossWeapon;

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
        return this.getHealth() + " " + this.getDamage() + " " + this.getSuperDamage() + " \n"
                + this.getBossWeapon().getWeapon() + " " + this.getBossWeapon().getWeaponType();
    }
}
