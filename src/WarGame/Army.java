package WarGame;

import java.util.ArrayList;

public class Army {
    private ArrayList<Warrior> army;

    /**
     * Constructor
     */
    public Army()
    {
        this.army = new ArrayList<>();
    }

    /**
     * Ctor with param
     * @param army ArrayList
     */
    public Army(ArrayList<Warrior> army) {
        this.army = army;
    }

    /**
     * Get Army
     * @return return army object
     */
    public ArrayList<Warrior> getArmy() {
        return this.army;
    }

    /**
     * Add to the end of army the warrior
     * @param warrior - object
     */
    public void addToArmy(Warrior warrior) {
        this.army.add(warrior);
    }

    /**
     * Remove from the army by index
     * @param index - int
     */
    public void removeFromArmy(int index) {
        this.army.remove(index);
    }

    /**
     * Remove from the army by Object
     * @param warrior - object
     */
    public void removeFromArmy(Warrior warrior) {
        this.army.remove(warrior);
    }

    /**
     * Set army by parameter
     * @param army - arraylist
     */
    void setArmy(ArrayList<Warrior> army) {
        this.army = army;
    }
}
