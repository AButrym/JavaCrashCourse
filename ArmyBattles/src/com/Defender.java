package com;

public class Defender extends Warrior{
    protected int defense;
    public Defender() {
        super(60, 3);
        this.defense=2;
    }
    public int getDefense(){
        return defense;
    }
}
