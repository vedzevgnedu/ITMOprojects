package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Lileep extends Pokemon{
    public Lileep(String name, int level){
        super(name, level);
        setStats(66, 41, 77, 61, 87, 23);
        setType(Type.ROCK, Type.GRASS);
        addMove(new RockPolish());
        addMove(new SwordsDance());
        addMove(new SludgeBomb());
    }
}