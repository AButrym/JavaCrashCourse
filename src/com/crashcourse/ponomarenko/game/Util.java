package com.crashcourse.ponomarenko.game;

public class Util {
    public static boolean fight(Warrior w1, Warrior w2) {
        while (true) {
            if (w1.isAlive()) {
                w2.health -= w1.attack;
            } else if (w2.isAlive()) {
                w1.health -= w2.attack;
            } else {
                return w1.isAlive();
            }
        }
    }
}
