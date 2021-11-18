package WarGame;

import java.util.HashSet;

public class HealEvent {
    private HashSet<IHealEvent> listeners = new HashSet<>();

    public void addListener(IHealEvent listener) {
        listeners.add(listener);
    }

    public void removeListener(IHealEvent listener) {
        listeners.remove(listener);
    }

    public void onHeal(Warrior sender) {
        listeners.forEach(x -> x.heal(sender));
    }
}
