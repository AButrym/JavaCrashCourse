package WarGame;

/**
 * Warrior class
 */
public class Warrior {
    protected int health;
    protected int attack;

    /**
     * Default ctor
     */
    public Warrior(){
        this.health = 50;
        this.attack = 5;
    }

    /**
     * Protected ctor to extend by another classes
     * @param   health    amount of health
     * @param   attack    strength of attack
     */
    protected  Warrior(int health, int attack) {
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
     * Warrior gets damage from another warrior
     * @param damage - damage strength
     */
    int getDamage(int damage){
        this.health -= damage;
        return damage;
    }

    /**
     * Attack warrior
     * @param warrior - warrior that has been attacked
     */
    void attack(Warrior warrior){
        warrior.getDamage(this.getAttack());
    }

    /**
     * Set health with health param
     * @param health health of the warrior
     */
    void setHealth(int health) {
        this.health = health;
    }

    /**
     * Heal the warrior
     * @param health - heals points to add
     */
    void addHealth(int health){
        this.health += health;
    }

    /**
     * Getter of health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Getter of attack
     */
    public int getAttack() {
        return attack;
    }
}
