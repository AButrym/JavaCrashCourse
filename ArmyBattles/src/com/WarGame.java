package com;

class WarGame {
    public static boolean fight(Warrior w1, Warrior w2) {
        while (w1.isAlive() && w2.isAlive()) {
            w2.health = w2.getHealth() - (w1.getAttack() - w2.getDefense());
            w1.health+=(w1.getAttack() - w2.getDefense())* w1.getVampirism();
            if (w2.isAlive()) {
                w1.health = w1.getHealth() - (w2.getAttack() - w1.getDefense());
                w2.health += (w2.getAttack() - w1.getDefense()) * w2.getVampirism();
            }
            else
                return true;
        }
        return false;
    }
}

class Warrior {
    protected int health;
    protected int attack;
    protected int defense=0;
    protected double vampirism=0;
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

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
    public double getVampirism() {
        return vampirism;
    }

}

class Knight extends Warrior {
    public Knight() {
        super(50, 7);
    }
}