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
     * Add unit to army
     * @param warrior unit
     */
    public void addUnits(Warrior warrior){
        if (army.size() > 1)
        {
            int preLast = army.size() - 2;
            army.get(preLast).setNextUnit(warrior);
            army.get(army.size() - 1).setPrevUnit(army.get(preLast));
        }
    }

    /**
     * Get unit by index
     * @param index index of unit
     * @return the unit
     */
    public Warrior get(int index){
        try {
            return army.get(index);
        }
        catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    /**
     * Check if Alive
     * @return
     */
    public boolean isAlive(){
        for (int v = 0; v < army.size(); v++){
            if (!army.get(v).isAlive())
                army.remove(v);
        }
        return army.size() > 0;
    }

    /**
     * Delete unit by index
     * @param index index of unit
     * @return success of not
     */
    public boolean tryDeleteUnits(int index)
    {
        try {
            army.remove(index);
            return true;
        }
        catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    /**
     * Delete "count" amount of units
     * @param start index of start
     * @param count amount of units
     * @return
     */
    public boolean tryDeleteUnits(int start, int count)
    {
        try {
            for (int i = 0; i < count; i++) army.remove(start);
            return true;
        }
        catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }
}
