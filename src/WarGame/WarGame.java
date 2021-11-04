package WarGame;

/**
 * Common class of WarGame: describes environment for warriors
 */
public class WarGame {
    /**
     * Fight between two warriors by step-to-step until one of them dies
     * @param warrior1 Warrior 1
     * @param warrior2 Warrior 2
     * @return  True if warrior1 survives, False backwards
     */
    public static boolean fight(Warrior warrior1, Warrior warrior2){
        while(true)
        {
            warrior2.getDamage(warrior1);
            if(!warrior2.isAlive()){
                return true;
            }
            warrior1.getDamage(warrior2);
            if (!warrior1.isAlive()){
                return false;
            }
        }
    }
}