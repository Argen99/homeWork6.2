package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String superDamage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperDamage() {
        return superDamage;
    }

    public void setSuperDamage(String superDamage) {
        this.superDamage = superDamage;
    }
}
