package WarGame;

import java.util.EventListener;

public interface IHealEvent extends EventListener {
    void heal(Warrior warrior);
}
