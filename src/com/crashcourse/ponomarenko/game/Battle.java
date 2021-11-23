package com.crashcourse.ponomarenko.game;

public class Battle {
    public static boolean fight(Warrior w1, Warrior w2) {
        while (true) {
            w1.getDamage(w2);
            if (!w2.isAlive()) {
                return true;
            }
            w2.getDamage(w1);
            if (!w1.isAlive()) {
                return false;
            }
        }
    }

    public static boolean fightArmy(Army army1, Army army2) {
        while (army1.getArmy().size() > 0 && army2.getArmy().size() > 0) {
            boolean fighting = Battle.fight(army1.getArmy().get(0), army2.getArmy().get(0));

            if (fighting) {
                army2.getArmy().remove(0);
            } else {
                army1.getArmy().remove(0);
            }
        }
        return army1.getArmy().size() > 0;
    }
}
