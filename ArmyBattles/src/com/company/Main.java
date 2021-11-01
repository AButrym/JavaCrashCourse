package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args)throws InterruptedException, IOException {
        Warrior warrior = new Warrior();
        Knight knight = new Knight();
        BattleGame.fight(warrior, knight);
    }
}
