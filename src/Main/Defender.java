package Main;

public class Defender extends Warrior {
    protected int _defense;

    public Defender() {
        this(60, 3, 2);
    }

    protected Defender(int health, int attack, int defense) {
        super(health, attack);
        _defense = defense;
    }

    @Override
    public int GetDamage(int damage) {
        int finalDamage = damage > _defense? damage - _defense: 0;
        _health -= finalDamage;
        return finalDamage;
    }
}
