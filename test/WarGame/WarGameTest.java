package WarGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarGameTest {
    @Test
    void fight2() {
        Warrior chunk = new Warrior();
        Warrior bruce = new Warrior();
        WarGame.fight(chunk, bruce);
    }

    @Test
    void fight() {
        Warrior chuck = new Warrior();
        Warrior bruce = new Warrior();
        Warrior carl = new Knight();
        Warrior dave = new Warrior();

        assertTrue(WarGame.fight(chuck, bruce));
        assertFalse(WarGame.fight(dave, carl));
        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }
}