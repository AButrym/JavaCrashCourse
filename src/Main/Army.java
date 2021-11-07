package Main;
import java.util.LinkedList;

public class Army {
    private final LinkedList<Warrior> army = new LinkedList<>();

    public void addUnits(Warrior unit) {
        army.add(unit);
    }

    public boolean isAlive() {
        return army.size() > 0;
    }

    public Warrior getUnit() {
        return army.getFirst();
    }

    public void removeUnit() {
        army.removeFirst();
    }
}
