package Main;

public class Warrior {
    protected int _health;
    protected int _attack;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        _health = health;
        _attack = attack;
    }

    public int GetDamage(int damage) {
        _health -= damage;
        return damage;
    }

    public void AttackEnemy(Warrior enemy) {
        enemy.GetDamage(_attack);
    }

    public boolean isAlive() {
        return _health > 0;
    }
}
