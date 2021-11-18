package WarGame;

public class Healer extends Warrior implements IHealEvent {
    private int healRate;

    /**
     * Default ctor
     */
    public Healer() {
        super(60, 0);
        healRate = 2;
    }

    /**
     * Set previous unit
     * @param unit Unit to set
     */
    @Override
    public void setPrevUnit(Warrior unit){
        prevUnit = unit;
        prevUnit.heal.addListener(this);
    }

    /**
     * Heal unit
     * @param warrior - the warrior
     */
    public void heal(Warrior warrior) {
        warrior.health += healRate;
        if (warrior.health > warrior.maxHealth) warrior.health = warrior.maxHealth;
    }
}
