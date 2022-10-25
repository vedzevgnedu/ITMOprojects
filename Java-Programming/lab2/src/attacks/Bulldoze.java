package attacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
    public Bulldoze(){
        super(Type.GROUND, 60.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует Bulldoze ";
    }


}
