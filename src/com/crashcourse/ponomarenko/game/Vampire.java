package com.crashcourse.ponomarenko.game;

public class Vampire extends Warrior {
    private final int vampirism;

    public Vampire() {
        super(40, 4);
        vampirism = 50;
    }

    @Override
    public int attacking(Warrior defender) {
        int damage = super.attacking(defender);
        health += (damage * vampirism / 100);
        return damage;
    }
}
