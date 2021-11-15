package Main;

public class Warrior {
    protected int _attack;
    protected int _health;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        _health = health;
        _attack = attack;
    }

    public int GetDamaged(int damage) {
        _health -= damage;
        return damage;
    }

    public boolean isAlive() {
        return _health > 0;
    }

    public void Attack(Warrior enemy) {
        enemy.GetDamaged(_attack);
    }
}
