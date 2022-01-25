package com.company;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FightTest {
    @Test
    void addUnits() throws IOException, InterruptedException {

        Army army1 = new Army();
        Army army2 = new Army();
        army1.addUnits(10, 1);
        army2.addUnits(10, 2);
        assertEquals(10, army1.getArmyList().size());
        assertEquals(10, army2.getArmyList().size());
        for (Warrior warrior : army1.getArmyList()) {
            assertTrue(warrior != null);
        }
        for (Warrior warrior : army2.getArmyList()) {
            assertTrue(warrior != null);
        }
        boolean res = Fight.fight(army1.getArmyList(), army2.getArmyList());
        assertFalse(res);
    }
}
