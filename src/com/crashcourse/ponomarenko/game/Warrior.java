package com.crashcourse.ponomarenko.game;

public class Warrior {
    protected int health;
    protected int attack;
    protected int defence;
    protected int vampirism;

    public Warrior() {
        this(50, 5, 0, 0);
    }

    protected Warrior(int health, int attack, int defence, int vampirism) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.vampirism = vampirism;
    }

    public boolean isAlive() {
        return health > 0;
    }


    protected int getAttack() {
        return attack;
    }

    protected int getHealth() {
        return health;
    }

    protected int getDefense() {
        return defence;
    }

    public int getVampirism() {
        return vampirism;
    }
}
