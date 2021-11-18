package WarGame;

/**
 * Warrior class
 */
public class Warrior implements IAttack {
    protected int health;
    protected int attack;
    protected final int maxHealth;
    private Warrior nextUnit;
    protected Warrior prevUnit;
    protected HealEvent heal = new HealEvent();
    /**
     * Default ctor
     */
    public Warrior(){
        this.health = 50;
        this.attack = 5;
        this.maxHealth = health;
    }

    /**
     * Protected ctor to extend by another classes
     * @param   health    amount of health
     * @param   attack    strength of attack
     */
    protected  Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
        this.maxHealth = health;
    }

    /**
     * Check if Warrior is alive
     * @return true or false
     */
    public boolean isAlive() {
        if (nextUnit != null && !nextUnit.isAlive()){
            nextUnit = nextUnit.nextUnit;
            nextUnit.prevUnit = this;
        }
        return health > 0;
    }

    /**
     * Warrior gets damage from another warrior
     * @param damage - damage strength
     */
    public int getDamage(int damage){
        this.health -= damage;
        return damage;
    }

    /**
     * Attack warrior
     * @param warrior - warrior that has been attacked
     */
    public int attack(Warrior warrior){
        heal.onHeal(this);
        return warrior.getDamage(this.getAttack());
    }

    /**
     *
     * @param unit
     */
    public void setNextUnit(Warrior unit){
        this.nextUnit = unit;
    }

    /**
     * Return the next unit after this
     * @return - next unit
     */
    public Warrior getNextUnit(){
        return this.nextUnit;
    }

    /**
     * Set the previous unit
     * @param unit
     */
    public void setPrevUnit(Warrior unit){
        this.prevUnit = unit;
    }


    /**
     * Return the previous unit after this
     * @return - prev unit
     */
    public Warrior getPrevUnit(){
        return this.prevUnit;
    }

    /**
     * Heal the warrior
     * @param health - heals points to add
     */
    void addHealth(int health){
        this.health += health;
    }

    /**
     * Getter of attack
     */
    public int getAttack() {
        return attack;
    }

    public int getHealth() {return health;}
}
