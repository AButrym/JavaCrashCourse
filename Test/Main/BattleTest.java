package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    @Test
    void unitsFight() {
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();

        var result1 = Battle.UnitsFight(chuck, bruce);
        var result2 = Battle.UnitsFight(dave, carl);

        assertTrue(result1, "Chuck should have won");
        assertFalse(result2, "Dave should have lost");

        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }

    @Test
    void armyFight() {
        Army army1 = new Army();
        Army army2 = new Army();

        army1.addUnits(new Warrior());
        army1.addUnits(new Knight());
        army1.addUnits(new Knight());

        army2.addUnits(new Warrior());
        army2.addUnits(new Warrior());
        army2.addUnits(new Knight());

        var result1 = Battle.ArmyFight(army1, army2);
        var result2 = Battle.ArmyFight(army2, army1);

        assertTrue(result1, "First army should have won");
        assertFalse(result2, "First army should have won");

        assertEquals(22, army1.getUnit()._health);
    }

    @Test
    void defenderFight() {
        var warrior = new Warrior();
        var defender = new Defender();

        var result1 = Battle.UnitsFight(warrior, defender);

        assertFalse(result1, "Defender should have won");

        assertEquals(-1, warrior._health, "Warrior should have health: -1");
        assertEquals(9, defender._health, "Defender should have health: 9");
    }

    @Test
    void vampireFight(){
        var defender = new Defender();
        var vampire = new Vampire();

        var result1 = Battle.UnitsFight(defender, vampire);

        assertTrue(result1, "Defender should have won");

        assertEquals(22, defender._health, "Defender should have health: 22");
        assertEquals(-1, vampire._health, "Vampire should have health: -1");
    }
}
