package Main;

public class Lancer extends Warrior {
    public Lancer() {
        super(50, 6);
    }

    @Override
    public void Attack(Warrior w) {
        if (w._backFromMe != null) w.BackFromMeGet().GetDamaged(w.GetDamaged(_attack) / 2);
    }
}
