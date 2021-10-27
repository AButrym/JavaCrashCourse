package com.ponomarenko.game;

import com.crashcourse.ponomarenko.game.Knight;
import com.crashcourse.ponomarenko.game.Util;
import com.crashcourse.ponomarenko.game.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void fight() {
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();

        var res1 = Util.fight(chuck, bruce);
        var res2 = Util.fight(dave, carl);

        assertTrue(res1, "Chuck should've won");
        assertFalse(res2, "Carl should've won");

        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());
    }
}