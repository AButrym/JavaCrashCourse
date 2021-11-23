package com.crashcourse.ponomarenko.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleWithVampireAndDefenderTest {

    @Test
    @DisplayName("Defender should won Vampire")
    void fight() {
        var chuck = new Defender();
        var bruce = new Vampire();

        boolean res1 = Battle.fight(chuck, bruce);

        assertTrue(res1);
        assertEquals(22, chuck.health);
        assertEquals(-1, bruce.health);
    }
}