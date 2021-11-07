package Main;

public class Battle {
    public static boolean unitsFight(Warrior unit1, Warrior unit2) {
        Warrior attacker = unit1;
        Warrior defender = unit2;

        while (attacker.isAlive()) {
            attacker.AttackEnemy(defender);

            Warrior temp = attacker;
            attacker = defender;
            defender = temp;
        }
        return unit1.isAlive();
    }

    public static boolean ArmyFight(Army army1, Army army2) {
    while (army1.isAlive() && army2.isAlive()) {
        if(unitsFight(army1.getUnit(), army2.getUnit()))
            army2.removeUnit();
        else
            army1.removeUnit();
    }
    return army1.isAlive();
    }
}
