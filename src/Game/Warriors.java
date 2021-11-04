package Game;

public class Warriors {
    protected int health;
    protected int attack;

    /**
     * Default ctor
     */
    public Warriors(){
        this.health = 50;
        this.attack = 5;
    }

    /**
     * Protected ctor to extend by another classes
     * @param   health    amount of health
     * @param   attack    strength of attack
     */
    protected  Warriors(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    /**
     * Check if Warrior is alive
     * @return true or false
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Attack
     * @param warrior to be attacked
     * @param attack strength of attack (warrior.health - attack)
     */
    public void attack(Warriors warrior, int attack){
        warrior.setHealth(warrior.health - attack);
    }

    /**
     * Set health with health param
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
}
