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
        return damage > _defense? super.GetDamage(damage - _defense) : 0;
    }
}
