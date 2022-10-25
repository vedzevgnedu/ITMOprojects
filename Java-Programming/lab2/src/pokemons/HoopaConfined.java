package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class HoopaConfined extends Pokemon{
    public HoopaConfined(String name, int level){
        super(name, level);
        setStats(80, 110, 60, 150, 130,70);
        setType(Type.PSYCHIC, Type.GHOST);
        addMove(new ZenHeadbutt());
        addMove(new ThunderWave());
        addMove(new ZenHeadbutt());
        addMove(new FocusBlast());
        addMove(new DreamEater());
    }
}
