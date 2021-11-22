package WarriorVsKnight;

public class Warrior {
    protected int health;
    protected int attack;

    public Warrior(){

        this(50, 5);
    }
    protected Warrior(int health, int attack){
        this.health=health;
        this.attack=attack;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int hp){
        this.health = hp;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isAlive() {
        return health>0;
    }
}
