public class Warrior {
    protected int health;
    protected int attack;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void attack(Warrior warriorDefender) {
        warriorDefender.health = warriorDefender.health - this.attack;
        if (!warriorDefender.isAlive())
            warriorDefender.health = 0;
    }
}
