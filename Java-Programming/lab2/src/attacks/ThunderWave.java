package attacks;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove{
    public ThunderWave(){
        super(Type.ELECTRIC, 0.0, 0.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.25) Effect.freeze(p);
        p.setMod(Stat.SPEED, -2);
    }

    @Override
    protected String describe(){
        return "использует Thunder Wave ";
    }
}
