package com.company;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BattleGameTest {
    @org.junit.jupiter.api.Test
    void fight() throws IOException, InterruptedException {
        BattleGame battle = new BattleGame();
        Warrior w1 = new Warrior();
        Warrior w2 = new Knight();
        boolean result = battle.fight(w1, w2);
        assertFalse(result);
    }
}