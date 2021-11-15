package Main;
import java.util.LinkedList;

public class Army {
    private final LinkedList<Warrior> army = new LinkedList<>();

    public void addWarriors(Warrior warrior) {
        army.add(warrior);
    }

    public Warrior getWarrior() {
        return army.getFirst();
    }

    public void removeWarrior() {
        army.removeFirst();
    }

    public boolean isAlive() {
        return army.size() > 0;
    }
}
