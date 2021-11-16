package Main;

public class Defender extends Warrior {
    protected int _protection;

    public Defender() {
        this(60, 3, 2);
    }

    protected Defender(int health, int attack, int protection) {
        super(health, attack);
        _protection = protection;
    }

    @Override
    public int GetDamaged(int damage) {
        int damageAfterProtection = 0;
        if(damage > _protection) {
            damageAfterProtection = damage - _protection;
        }
        _health -= damageAfterProtection;
        return damageAfterProtection;
    }
}
