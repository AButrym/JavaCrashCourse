package com.crashcourse.ponomarenko.game;

public class Lancer extends Warrior {
    public Lancer() {
        super(50, 6);
    }

    @Override
    public int attacking(Warrior defender) {
        return defender.getBackUnit() != null ?
                defender.getBackUnit().takingDamage(defender.takingDamage(attack) / 2) : defender.takingDamage(attack);
    }
}
