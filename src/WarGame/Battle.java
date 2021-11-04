package WarGame;

public class Battle {
    public static boolean fightArmy(Army army1, Army army2) {
        while(army1.getArmy().size() > 0 && army2.getArmy().size() > 0) {
            boolean fighting = WarGame.fight(army1.getArmy().get(0), army2.getArmy().get(0));
            if (fighting) {
                army2.getArmy().remove(0);
            } else {
                army1.getArmy().remove(0);
            }
        }
        return army1.getArmy().size() > 0;
    }
}
