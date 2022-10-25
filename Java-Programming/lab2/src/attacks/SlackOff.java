package attacks;

import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {
    public SlackOff(){
        super(Type.NORMAL, 0.0, 0.0);
    }

    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) Math.round((p.getHP() + p.getStat(Stat.HP) * 0.5)));
    }

    @Override
    protected String describe(){
        return "использует Slack Off";
    }

}
