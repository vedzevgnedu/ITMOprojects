package attacks;

import ru.ifmo.se.pokemon.*;

public class MachPunch extends PhysicalMove {
    public MachPunch() {
        super(Type.FIGHTING, 40.0, 100.0, 1, 1);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe(){
        return "использует Mach Punch ";
    }
}
