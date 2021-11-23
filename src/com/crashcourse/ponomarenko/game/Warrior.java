package com.crashcourse.ponomarenko.game;

public class Warrior {
    private int health;
    private int attack;

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

    void getDamage(Warrior warrior){
        this.health -= warrior.getAttack();
    }

    private int getAttack() {
        return attack;
    }

    void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
