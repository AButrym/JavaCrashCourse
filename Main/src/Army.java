import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Warrior> armyList = new ArrayList<>();

    public Army() {
    }

    public List<Warrior> getArmyList() {
        return armyList;
    }

    public List<Warrior> addUnits(int count, int classOfWarriors) {
        int i;
        for (i = 0; i < count; i++) {
            armyList.add(chooseClassOfWarrior(classOfWarriors));
        }
        System.out.println("Успешно добавлено " + i + " " + chooseClassOfWarrior(classOfWarriors).getClass().getTypeName()+"s");
        System.out.println("Общее количетсво воинов в армии: " + armyList.size());
        return armyList;
    }

    public Warrior chooseClassOfWarrior(int classOfWarriors) {
        switch (classOfWarriors) {
            case 1:
                return new Warrior();
            case 2:
                return new Knight();
        }
        return null;
    }
}
