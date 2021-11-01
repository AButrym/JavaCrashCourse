public class Game {
    public static boolean fight(Warrior w1, Warrior w2) {
        boolean attacking = true;
        while (attacking) {
            if (w1.isAlive())
                w1.attack(w2);
            else attacking = false;
            if (w2.isAlive())
                w2.attack(w1);
            else attacking = false;
        }

        if (w1.isAlive()) {
            System.out.println("First Warrior wins!!!");
            return true;
        } else {
            System.out.println("Second Warrior wins!!!");
            return false;
        }
    }
}
