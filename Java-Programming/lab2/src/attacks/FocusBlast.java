package attacks;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove{
    public FocusBlast(){
        super(Type.FIGHTING, 120.0, 70.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
        if(Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe(){
        return "использует Focus Blast ";
    }
}
