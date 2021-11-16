package Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Tests {

    @Test
    void warriorsBattle() {
        var carl = new Knight();
        var dave = new Warrior();
        var chuck = new Warrior();
        var bruce = new Warrior();
        var res1 = Battle.UnitsBattle(chuck, bruce);
        var res2 = Battle.UnitsBattle(dave, carl);
        assertTrue(res1, "Chuck should have won");
        assertFalse(res2, "Dave should have lost");
        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }

    @Test
    void vampireBattle(){
        var defender = new Defender();
        var vampire = new Vampire();
        var result1 = Battle.UnitsBattle(defender, vampire);
        assertTrue(result1, "Defender should have won");
        assertEquals(22, defender._health, "Defender should have health: 22");
        assertEquals(-1, vampire._health, "Vampire should have health: -1");
    }

    @Test
    void defendersBattle() {
        var warrior = new Warrior();
        var defender = new Defender();
        var result1 = Battle.UnitsBattle(warrior, defender);
        assertFalse(result1, "Defender should have won");
        assertEquals(-1, warrior._health, "Warrior should have health: -1");
        assertEquals(9, defender._health, "Defender should have health: 9");
    }

    @Test
    void armyBattle() {
        Army army1 = new Army();
        Army army2 = new Army();

        army1.addWarriors(new Warrior());
        army1.addWarriors(new Knight());
        army1.addWarriors(new Knight());
        army2.addWarriors(new Warrior());
        army2.addWarriors(new Warrior());
        army2.addWarriors(new Knight());
        var res1 = Battle.ArmyBattle(army1, army2);
        var res2 = Battle.ArmyBattle(army2, army1);
        assertTrue(res1, "First army should have won");
        assertFalse(res2, "First army should have won");
        assertEquals(22, army1.getWarrior()._health);
    }

    @Test
    void lancerFight() {
        Army army1 = new Army();
        Army army2 = new Army();
        army1.addWarriors(new Lancer());
        army2.addWarriors(new Warrior());
        army2.addWarriors(new Knight());
        army1.addWarriors(new Warrior());
        army1.addWarriors(new Warrior());
        var res1 = Battle.ArmyBattle(army1, army2);
        assertTrue(res1, "Second army should have won");
    }
}
