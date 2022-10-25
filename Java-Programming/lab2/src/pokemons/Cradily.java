package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Cradily extends Pokemon{
    public Cradily(String name, int level){
        super(name, level);
        setStats(86, 81, 97, 81, 107, 43);
        setType(Type.ROCK, Type.GRASS);
        addMove(new RockPolish());
        addMove(new SwordsDance());
        addMove(new SludgeBomb());
        addMove(new Bulldoze());
    }
}