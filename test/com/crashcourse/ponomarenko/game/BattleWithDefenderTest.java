package com.crashcourse.ponomarenko.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleWithDefenderTest {

    @Test
    @DisplayName("Battle with Defender & Warrior")
    void fight_defenderShouldWon() {
        var carl = new Defender();
        var john = new Warrior();

        boolean res = Battle.fight(carl, john);

        assertTrue(res);
    }

    @Test
    @DisplayName("Battle with Defender & Knight")
    void fight_knightShouldWon() {
        var carl = new Defender();
        var henry = new Knight();

        boolean res = Battle.fight(carl, henry);

        assertFalse(res);
    }
}