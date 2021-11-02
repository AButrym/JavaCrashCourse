import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void fight() {
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();

        var result1 = Game.fight(chuck, bruce);
        var result2 = Game.fight(dave, carl);

        assertTrue(result1, "Chuck should have won");
        assertFalse(result2, "Dave should have lost");

        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }

    @Test
    void addUnits() {
        var army1 = new Army();
        var army2 = new Army();
        army1.addUnits(10, 1);
        army2.addUnits(10, 2);
        assertEquals(10, army1.getArmyList().size());
        assertEquals(10, army2.getArmyList().size());
        for (Warrior warrior : army1.getArmyList()) {
            assertNotNull(warrior);
        }
        for (Warrior warrior : army2.getArmyList()) {
            assertNotNull(warrior);
        }
        boolean res = Battle.fight(army1.getArmyList(), army2.getArmyList());
        assertFalse(res);
        res = Battle.fight(army2.getArmyList(),army1.getArmyList());
        assertTrue(res);
    }
}
