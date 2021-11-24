package com.crashcourse.ponomarenko.game;

public class Battle {
    public static boolean fight(Warrior attacker, Warrior defender) {
        while (attacker.isAlive() && defender.isAlive()) {
            Warrior w1 = attacker;
            Warrior w2 = defender;
            while (w1.isAlive()) {
                w1.attacking(w2);
                Warrior temp = w1;
                w1 = w2;
                w2 = temp;
            }
        }
        return attacker.isAlive();
    }

    public static boolean fightArmy(Army army1, Army army2) {
        while (army1.isAlive() && army2.isAlive()) {
            boolean result = fight(army1.get(0), army2.get(0));
            if (result) army2.remove(0);
            else army1.remove(0);
        }
        return army1.isAlive();
    }
}
