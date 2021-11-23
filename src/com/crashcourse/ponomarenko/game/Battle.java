package com.crashcourse.ponomarenko.game;

public class Battle {
    public static boolean fight(Warrior attacker, Warrior defender) {
        int attackerMaxHp = attacker.health;
        int defenderMaxHp = defender.health;

        while (attacker.isAlive() && defender.isAlive()) {
            System.out.println("w2: " + defender.getHealth());
            defender.health = defender.getHealth() - (attacker.getAttack() - defender.getDefense());
            if (attacker.getVampirism() > 0) {
                attacker.health += (attacker.getAttack() - defender.getDefense()) * attacker.getVampirism() / 100;
                //vamp can't have more health than before
                if (attacker.getHealth() > attackerMaxHp) {
                    attacker.health = attackerMaxHp;
                }
            }

            System.out.println("w1: " + attacker.getHealth());
            if (defender.isAlive()) {
                attacker.health = attacker.getHealth() - (defender.getAttack() - attacker.getDefense());
                if (defender.getVampirism() > 0) {
                    defender.health += (defender.getAttack() - attacker.getDefense()) * defender.getVampirism() / 100;
                    //vamp can't have more health than before
                    if (defender.getHealth() > defenderMaxHp) {
                        defender.health = defenderMaxHp;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean fightArmy(Army army1, Army army2) {
        while (army1.getArmy().size() > 0 && army2.getArmy().size() > 0) {
            boolean fighting = Battle.fight(army1.getArmy().get(0), army2.getArmy().get(0));

            if (fighting) {
                army2.getArmy().remove(0);
            } else {
                army1.getArmy().remove(0);
            }
        }
        return army1.getArmy().size() > 0;
    }
}
