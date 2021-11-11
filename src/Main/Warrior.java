package Main;

public class Warrior {
    protected int _health;
    protected int _attack;
    protected Warrior _unitBehind = null;

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
        if(_unitBehind != null && !_unitBehind.isAlive()) _unitBehind = _unitBehind._unitBehind;
        return _health > 0;
    }

    public Warrior GetUnitBehind() {
        return _unitBehind;
    }

    public void SetUnitBehind(Warrior unit) {
        _unitBehind = unit;
    }
}
