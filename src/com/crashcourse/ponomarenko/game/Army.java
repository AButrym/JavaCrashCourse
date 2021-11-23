package com.crashcourse.ponomarenko.game;

import java.util.ArrayList;

public class Army {

    private final ArrayList<Warrior> army = new ArrayList<>();

    public ArrayList<Warrior> getArmy() {
        return army;
    }

    public void addUnitsWarrior(int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.army.add(new Warrior());
        }
    }

    public void addUnitsKnight(int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.army.add(new Knight());
        }
    }
}
