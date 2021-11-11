package Main;

public class Lancer extends Warrior {
    public Lancer() {
        super(50, 6);
    }

    @Override
    public void AttackEnemy(Warrior enemy) {
        int halfDamage = enemy.GetDamage(_attack) / 2;
        if (enemy._unitBehind != null) enemy.GetUnitBehind().GetDamage(halfDamage);
    }
}
