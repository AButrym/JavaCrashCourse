package com.company;

public class Warrior {
    protected int health;
    protected int attack;

    public Warrior(){
        this(50, 5);
    }
    protected Warrior (int health, int attack){
        this.health = health;
        this.attack = attack;
    }
    public boolean IsAlive (){
        return health>0;
    }
    public int getHealth(){
        return health;
    }
    public int getAttack(){
        return attack;
    }
    public void setHealth(int health)
    {
        this.health=health;
    }
    public void attack(Warrior warrior){
        warrior.setHealth(warrior.getHealth() - this.attack);
        if(!warrior.IsAlive())
            warrior.setHealth(0);
    }

}
