package WarGame;

/**
 * Common class of WarGame: describes environment for warriors
 */
public class WarGame {
    /**
     * Fight between two warriors by step-to-step until one of them dies
     * @param warrior1
     * @param warrior2
     * @return  True if warrior1 survives, False backwards
     */
    public static boolean fight(Warrior warrior1, Warrior warrior2){
        while(true)
        {
            warrior1.attack(warrior2, warrior1.getAttack());
            if(!warrior2.isAlive()){
                return true;
            }
            warrior2.attack(warrior1, warrior2.getAttack());
            if (!warrior1.isAlive()){
                return false;
            }
        }
    }
}
