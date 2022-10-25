package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Infernape extends Pokemon{
    public Infernape(String name, int level){
        super(name, level);
        setStats(76, 104, 71, 104, 71, 108);
        setType(Type.FIRE, Type.FIGHTING);
        addMove(new ZenHeadbutt());
        addMove(new ThunderWave());
        addMove(new MachPunch());
    }
}
