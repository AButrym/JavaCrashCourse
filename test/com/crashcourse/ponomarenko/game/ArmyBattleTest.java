package com.crashcourse.ponomarenko.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyBattleTest {

    @Test
    @DisplayName("1. Army vs another army")
    void fightArmy() {
        Army france = new Army();
        france.addUnitsKnight(6);
        france.addUnitsWarrior(5);

        Army germany = new Army();
        germany.addUnitsKnight(3);
        germany.addUnitsWarrior(5);


        boolean result = Battle.fightArmy(france, germany);


        assertTrue(result, "France should have won");
    }
}