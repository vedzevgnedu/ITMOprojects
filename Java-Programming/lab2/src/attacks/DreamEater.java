package attacks;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove{
    public DreamEater(){
        super(Type.PSYCHIC, 100.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        if(p.getCondition() == Status.SLEEP){
            p.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) Math.round((p.getHP() - p.getStat(Stat.HP)) * 0.5));
    }

    @Override
    protected String describe(){
        return "использует Dream Eater ";
    }
}
