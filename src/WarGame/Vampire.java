package WarGame;

public class Vampire extends Warrior {
    private final float vampirism;
    private static final int MAX_HEALTH = 40;
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
    void attack(Warrior warrior){
        int health = warrior.getDamage(this.getAttack());
        if (this.health + (int)(health * vampirism / 100) <= MAX_HEALTH)
            this.addHealth((int)(health * vampirism / 100));
    }
}
