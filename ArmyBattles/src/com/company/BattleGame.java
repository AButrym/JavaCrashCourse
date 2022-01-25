package com.company;

import java.io.IOException;

public class BattleGame {
    public static boolean fight(Warrior w1, Warrior w2) throws InterruptedException, IOException {
        while (w1.IsAlive() && w2.IsAlive()) {
            w1.attack(w2);
            w2.attack(w1);
        }
        if (w1.IsAlive())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
