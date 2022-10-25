package attacks;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{
    public SludgeBomb(){
        super(Type.POISON, 90.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        if (Math.random() <= 0.3) Effect.poison(p);
    }

    @Override
    protected String describe(){
        return "использует Sludge Bomb";
    }

}
