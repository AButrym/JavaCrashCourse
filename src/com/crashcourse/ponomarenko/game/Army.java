package com.crashcourse.ponomarenko.game;

import java.util.ArrayList;

public class Army {
    private final ArrayList<Warrior> army = new ArrayList<>();

    public ArrayList<Warrior> getArmy() {
        return army;
    }


    public boolean isAlive() {
        for (int i = 0; i < army.size(); i++) {
            if (!army.get(i).isAlive()) army.remove(i);
        }
        return army.size() > 0;
    }

    public void addUnits(Warrior warrior, int quantity) {
        for (int i = 0; i < quantity; i++) {
            army.add(warrior);
        }
        if (army.size() > 1) army.get(1).setBackUnit(warrior);
    }

    public Warrior get(int i) {
        return army.get(i);
    }

    public void remove(int i) {
        army.remove(i);
    }
}
