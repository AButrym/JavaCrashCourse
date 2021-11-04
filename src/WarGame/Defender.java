package WarGame;

public class Defender extends Warrior{
    private int defence;

    /**
     * Default ctor
     */
    public Defender(){
        super(60, 3);
        this.defence = 2;
    }

    /**
     * Override getDamage from Warrior
     */
    @Override
    public void getDamage(Warrior warrior){
        this.health -= this.health - (warrior.attack - this.defence);
    }
}
