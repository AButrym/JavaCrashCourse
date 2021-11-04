package Game;

public class Game {
    public static boolean fight(Warriors warrior1, Warriors warrior2){
        while(true)
        {
            warrior1.attack(warrior2, warrior1.getAttack());
            if(!warrior2.isAlive()){
                return true;
            }
            warrior2.attack(warrior1, warrior2.getAttack());
            if (!warrior1.isAlive()){
                return false;
            }
        }
    }
}
