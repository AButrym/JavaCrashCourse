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
}