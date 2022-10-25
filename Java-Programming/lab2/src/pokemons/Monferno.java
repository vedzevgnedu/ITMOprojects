package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Monferno extends Pokemon{
    public Monferno(String name, int level){
        super(name, level);
        setStats(64, 78, 52, 78, 52, 81);
        setType(Type.FIRE, Type.FIGHTING);
        addMove(new Scratch());
        addMove(new FlameWheel());
        addMove(new SlackOff());
    }
}