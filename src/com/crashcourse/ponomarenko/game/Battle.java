package com.crashcourse.ponomarenko.game;

public class Battle {
    public static boolean fight(Warrior w1, Warrior w2) {
        while (true) {
            w1.getDamage(w2);
            if (!w1.isAlive()) {
                return true;
            }
            w2.getDamage(w1);
            if (!w2.isAlive()) {
                return false;
            }
        }
    }
}
