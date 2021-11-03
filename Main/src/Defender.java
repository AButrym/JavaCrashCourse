public class Defender extends Warrior{
    protected int defence;

    public Defender() {
        super(60, 3);
        this.defence = 2;
    }

    public Defender(int health, int attack, int defence) {
        super(health, attack);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
