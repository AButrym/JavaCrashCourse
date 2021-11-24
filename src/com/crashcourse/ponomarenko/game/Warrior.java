package com.crashcourse.ponomarenko.game;

public class Warrior {
    protected int health;
    protected int attack;
    protected Warrior backUnit = null;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int attacking(Warrior defender) {
        return defender.takingDamage(attack);
    }

    public int takingDamage(int damage) {
        if (damage < 0)
            return 0;
        else
            health -= damage;
            return damage;
    }

    public void setBackUnit(Warrior unit) {
        this.backUnit = unit;
    }

    public Warrior getBackUnit() {
        return backUnit;
    }
}
