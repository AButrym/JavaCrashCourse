package Main;

public class Vampire extends Warrior {
    protected int _vampirism;

    public Vampire() {
        this(40, 4, 50);
    }

    protected Vampire(int health, int attack, int vampirism) {
        super(health, attack);
        _vampirism = vampirism;
    }

    @Override
    public void AttackEnemy(Warrior enemy) {
        int damage = enemy.GetDamage(_attack);
        _health += damage * _vampirism / 100;
    }
}
