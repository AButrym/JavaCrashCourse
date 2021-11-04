package WarGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class WarGameTest {
    @Test
    @DisplayName("Fight between chunk-bruce")
    void fight2() {
        Warrior chunk = new Warrior();
        Warrior bruce = new Warrior();
        WarGame.fight(chunk, bruce);
    }

    @Test
    @DisplayName("Fight between chuck-bruce, dave-carl")
    void fight() {
        Warrior chuck = new Warrior();
        Warrior bruce = new Warrior();
        Warrior carl = new Knight();
        Warrior dave = new Warrior();
        Assertions.assertTrue(WarGame.fight(chuck, bruce));
        Assertions.assertFalse(WarGame.fight(dave, carl));
        Assertions.assertTrue(chuck.isAlive());
        Assertions.assertFalse(bruce.isAlive());
        Assertions.assertTrue(carl.isAlive());
        Assertions.assertFalse(dave.isAlive());
    }

    @Test
    @DisplayName("Army 1 versus Army 2")
    void fightArmy() {
        Army army1 = new Army(new ArrayList<>(Arrays.asList(new Warrior(), new Warrior(), new Warrior())));
        Army army2 = new Army(new ArrayList<>(Arrays.asList(new Warrior(), new Knight(), new Warrior())));
        boolean result = Battle.fightArmy(army1, army2);
        Assertions.assertTrue(result, "Army1 should have won");
    }
}
