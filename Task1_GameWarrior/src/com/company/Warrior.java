package com.company;

public class Warrior {
    protected int health;
    protected int attack;

    public Warrior(){
        this(50,5);
    }
    protected Warrior(int health, int attack){
        this.attack = attack;
        this.health = health;
    }
    public boolean isAlive(){
        return health>0;
    }
    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
}
