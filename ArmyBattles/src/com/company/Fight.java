package com.company;

import java.io.IOException;
import java.util.List;

public class Fight {
    public Fight() {
    }

    public static boolean fight(List<Warrior> firstArmy, List<Warrior> secondArmy)throws InterruptedException, IOException {
        while (firstArmy.size() > 0 && secondArmy.size() > 0) {
            if (BattleGame.fight(firstArmy.get(0), secondArmy.get(0))) {
                secondArmy.remove(0);
            } else {
                firstArmy.remove(0);
            }
        }
        if (firstArmy.size() > 0) {
            System.out.println("Победу одержала первая армия");
            System.out.println("Живых воинов: " + firstArmy.size());
        } else
            System.out.println("Победу одержала вторая армия");
        System.out.println("Живых воинов: " + secondArmy.size());
        return false;
    }
}
