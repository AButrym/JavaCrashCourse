package com;

import java.util.ArrayList;

public class Army {

    private ArrayList<Warrior> army;

    public Army() {
        this.army = new ArrayList<>();
    }
    public ArrayList<Warrior> getArmy() {
        return army;
    }
    public void setArmy(ArrayList<Warrior> army) {
        this.army = army;
    }

    public void addUnitsWarrior(int count){
        for(int i=0;i<count;i++){
            this.army.add(new Warrior());
        }
    }
    public void addUnitsKnight(int count){
        for(int i=0;i<count;i++){
            this.army.add(new Knight());
        }
    }
}
