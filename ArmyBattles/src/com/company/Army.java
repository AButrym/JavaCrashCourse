package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Army {
    private List<Warrior> warriorArmyList = new ArrayList<Warrior>();

    public Army(){

    }

    public List<Warrior> getArmyList(){
        return warriorArmyList;
    }

    public List<Warrior> addUnits(int size, int warriorType){
        int i;
        for(i = 0; i < size; i++){
            warriorArmyList.add(selectWarriorType(warriorType));
        }
        return warriorArmyList;
    }

    public Warrior selectWarriorType(int warriorType) {
        switch (warriorType) {
            case 1: return new Warrior();
            case 2: return new Knight();
        }
        return null;
    }
}
