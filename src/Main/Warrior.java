package Main;

public class Warrior {
    protected int _attack;
    protected int _health;
    protected Warrior _backFromMe = null;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        _health = health;
        _attack = attack;
    }

    public void BackFromMeSet(Warrior w) {
        _backFromMe = w;
    }

    public Warrior BackFromMeGet() {
        return _backFromMe;
    }

    public int GetDamaged(int damage) {
        _health -= damage;
        return damage;
    }

    public boolean isAlive() {
        return _health > 0;
    }

    public void Attack(Warrior w) {
        w.GetDamaged(_attack);
    }
}
