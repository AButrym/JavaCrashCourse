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
            warrior1.attack(warrior2);
            if(!warrior2.isAlive()){
                return true;
            }
            warrior2.attack(warrior1);
            if (!warrior1.isAlive()){
                return false;
            }
        }
    }
    /**
     * Do fight between two armies
     * @param army1 - army of warriors
     * @param army2 - army of warriors
     * @return - army that survived
     */
    public static boolean fightArmy(Army army1, Army army2) {
        while(army1.getArmy().size() > 0 && army2.getArmy().size() > 0) {
            boolean fighting = fight(army1.getArmy().get(0), army2.getArmy().get(0));
            if (fighting) {
                army2.getArmy().remove(0);
            } else {
                army1.getArmy().remove(0);
            }
        }
        return army1.getArmy().size() > 0;
    }
}
