package com.crashcourse.ponomarenko.game;

public class Warrior {
    protected int health;
    protected int attack;
    protected int defence;

    public Warrior() {
        this(50, 5, 0);
    }

    protected Warrior(int health, int attack, int defence) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }

    public boolean isAlive() {
        return health > 0;
    }

    protected void getDamage(Warrior warrior){
        this.health = warrior.getHealth() - (warrior.getAttack() + warrior.getDefence());
    }

    protected int getAttack() {
        return attack;
    }

    protected int getHealth() {
        return health;
    }

    protected int getDefence() {
        return defence;
    }
}
