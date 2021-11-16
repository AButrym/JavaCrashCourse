package Main;

public class Battle {
    public static boolean UnitsBattle(Warrior w1, Warrior w2) {
        Warrior attacker = w1;
        Warrior defender = w2;

        while (attacker.isAlive()) {
            attacker.Attack(defender);

            Warrior temp = attacker;
            attacker = defender;
            defender = temp;
        }
        return w1.isAlive();
    }

    public static boolean ArmyBattle(Army army1, Army army2) {
    while (army1.isAlive() && army2.isAlive()) {
        if(UnitsBattle(army1.getWarrior(), army2.getWarrior()))
            army2.removeWarrior();
        else
            army1.removeWarrior();
    }
    return army1.isAlive();
    }
}
