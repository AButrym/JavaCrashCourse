package Main;
import java.util.LinkedList;

public class Army {
    private final LinkedList<Warrior> army = new LinkedList<>();

    public void addWarriors(Warrior w) {
        army.add(w);
        if (army.size() > 1) {
            army.get(army.size() - 2).BackFromMeSet(w);
        }
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
