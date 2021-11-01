package com.company;

public class WarGame {
    public static boolean fight(Warrior w1, Warrior w2){
        System.out.println(w1.health + "|" + w2.health);
        while (w1.isAlive()!= false & w2.isAlive()!=false) {
            w2.health -= w1.attack;
            System.out.println(w1.health + "|" + w2.health);
            if(w2.health<=0)
                break;
            w1.health -= w2.attack;

            System.out.println(w1.health + "|" + w2.health);
        }
        if (w2.health <= 0)
        {
            w2.isAlive();
            return true;
        }
        else if(w1.health <= 0)
        {
            w1.isAlive();
            return true;
        }

        return false;
    }
}
