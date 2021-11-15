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
    public void Attack(Warrior warrior) {
        int damage = warrior.GetDamaged(_attack);
        _health += damage * _vampirism * 0.01;
    }
}
