package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void fight2() {
        Warriors chunk = new Warriors();
        Warriors bruce = new Warriors();
        Game.fight(chunk, bruce);
    }

    @Test
    void fight() {
        Warriors chuck = new Warriors();
        Warriors bruce = new Warriors();
        Warriors carl = new Knights();
        Warriors dave = new Warriors();

        assertTrue(Game.fight(chuck, bruce));
        assertFalse(Game.fight(dave, carl));
        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }
}