package WarriorVsKnight;

public class WarGame {
    public static boolean fight(Warrior w1, Warrior w2){
        while(w1.isAlive() && w2.isAlive()){
            w2.setHealth(w2.getHealth() - w1.getAttack());
            if(w2.isAlive())
                w1.setHealth(w1.getHealth() - w2.getAttack());
        }
        return w1.isAlive();
    }
}
