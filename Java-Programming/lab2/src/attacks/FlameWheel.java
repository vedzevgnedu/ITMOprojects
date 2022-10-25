package attacks;

import ru.ifmo.se.pokemon.*;

public class FlameWheel extends PhysicalMove{
    public FlameWheel(){
        super(Type.FIRE, 60.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.1) Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "использует FlameWheel ";
    }


}