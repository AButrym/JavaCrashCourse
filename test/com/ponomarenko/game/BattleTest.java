package com.ponomarenko.game;

import com.crashcourse.ponomarenko.game.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    @Test
    @DisplayName("1. Fight with Warrior and Knight")
    void fight_KnightShouldDefeatWarrior() {
        var carl = new Warrior();
        var chuck = new Knight();

        boolean res = Battle.fight(carl, chuck);

        assertFalse(res);
    }

    @Test
    @DisplayName("2. Fight with first Warrior and second Warrior")
    void fight_FirstWarriorShouldDefeatSecondWarrior() {
        var carl = new Warrior();
        var bob = new Warrior();

        boolean res = Battle.fight(carl, bob);

        assertTrue(res);
    }
}