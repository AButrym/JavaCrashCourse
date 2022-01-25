package com.company;

public class Main {

    public static void main(String[] args) {
        WarGame wg = new WarGame();
        Warrior Chuck = new Warrior();
        Warrior Fred = new Warrior();
        Knight Bob = new Knight();
        Knight Ben = new Knight();
        wg.fight(Ben, Bob);

    }
}

