import java.util.List;

public class Battle {
    public Battle() {
    }

    public static boolean fight(List<Warrior> army1, List<Warrior> army2) {
        while (army1.size() !=0 && army2.size() != 0) {
            if (Game.fight(army1.get(0), army2.get(0))) {
                army2.remove(0);
            } else
                army1.remove(0);
        }
        if (army1.size() > 0) {
            System.out.println("Первая армия выиграла");
            System.out.println("Колличество живых воинов\n" + army1.size() + " : " + army2.size());
            return true;
        } else {
            System.out.println("Вторая армия выиграла");
            System.out.println("Колличество живых воинов\n" + army1.size() + " : " + army2.size());
            return false;
        }
    }
}
