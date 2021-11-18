package WarGame;

public class Vampire extends Warrior {
    private final float vampirism;
    /**
     * Constructor
     */
    public Vampire(){
        super(40, 4);
        this.vampirism = 50.0F;
    }
    /**
     * Override attack from Warrior
     */
    @Override
    public int attack(Warrior warrior){
        int health = warrior.getDamage(this.getAttack());
        if (this.health + (int)(health * vampirism / 100) <= this.maxHealth)
            this.addHealth((int)(health * vampirism / 100));
        return health;
    }
}
