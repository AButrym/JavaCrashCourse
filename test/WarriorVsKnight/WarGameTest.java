package WarriorVsKnight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarGameTest {

    @Test
    void fight() {
        Warrior chuck = new Warrior();
        Warrior bruce = new Warrior();
        Warrior carl = new Knight();
        Warrior dave = new Warrior();

        var result1 = WarGame.fight(chuck, bruce);
        var result2 = WarGame.fight(dave, carl);

        assertTrue(result1, "Chuck should have won");
        assertFalse(result2, "Dave should have lose");
        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }
}