package com;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArmyBattleTest {

    @Test
    void fightArmy() {
        Army rome = new Army();
        rome.addUnitsKnight(2);
        rome.addUnitsWarrior(3);

        Army greece = new Army();
        greece.addUnitsKnight(1);
        greece.addUnitsWarrior(3);

        var result = Battle.fightArmy(rome, greece);


        assertTrue(result, "Rome should have won");
        if(result){
            for(int i=1; i<=rome.getArmy().size(); i++)
                System.out.println("Warrior "+i+" has "+rome.getArmy().get(i-1).getHealth()+" health point");
        }
        else{
            for(int i=1; i<=greece.getArmy().size(); i++)
                System.out.println("Warrior "+i+" has "+greece.getArmy().get(i-1).getHealth()+" health point");
        }

    }
}