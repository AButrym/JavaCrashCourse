package com.crashcourse.ponomarenko.game;

public class Defender extends Warrior {
    private final int defence;
    public Defender() {
        super(60, 3);
        defence = 2;
    }

    @Override
    public int takingDamage(int damage) {
        return damage > defence ? super.takingDamage(damage - defence) : 0;
    }
}
