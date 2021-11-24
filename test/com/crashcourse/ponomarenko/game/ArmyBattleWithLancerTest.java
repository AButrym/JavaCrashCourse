package com.crashcourse.ponomarenko.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyBattleWithLancerTest {

    @Test
    @DisplayName("Germany should won")
    void fightArmy() {
        Army france = new Army();
        france.addUnits(new Lancer(), 1);

        Army germany = new Army();
        germany.addUnits(new Warrior(), 1);
        germany.addUnits(new Knight(), 1);

        boolean res = Battle.fightArmy(france, germany);

        assertFalse(res);
    }
}