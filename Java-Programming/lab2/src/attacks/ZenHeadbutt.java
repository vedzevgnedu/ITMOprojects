package attacks;

import ru.ifmo.se.pokemon.*;

public class ZenHeadbutt extends PhysicalMove{
    public ZenHeadbutt(){
        super(Type.PSYCHIC, 80.0, 90.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
        if(Math.random() <= 0.2) Effect.flinch(p);
    }

    @Override
    protected String describe(){
        return "использует Zen Headbutt ";
    }

}
