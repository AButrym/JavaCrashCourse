package wargame;

public class Defender extends Warrior {
    private int defence;
    public Defender() {
        super(60, 3);
        defence = 2;
    }
    @Override
    public int takeDamage(Warrior attacker) {
        int damage = attacker.getAttack();
        if (damage > defence) return super.takeDamage(damage - defence);
        return 0;
    }

}
