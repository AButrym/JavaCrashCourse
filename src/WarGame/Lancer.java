package WarGame;

public class Lancer extends Warrior {
    /**
     * Constructor
     */
    Lancer(){
        super(50, 6);
    }

    /**
     *
     * @return
     */
    @Override
    public int attack(Warrior defender){
        return defender.getNextUnit() != null ? defender.getNextUnit().getDamage(defender.getDamage(attack) / 2) : defender.getDamage(attack);
    }
}
