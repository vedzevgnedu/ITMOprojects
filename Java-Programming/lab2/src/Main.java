import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Chimchar p1 = new Chimchar("Обезьянка",1);
        Cradily p2 = new Cradily("Зелёный цветок",1);
        HoopaConfined p3 = new HoopaConfined("Кто-то с кольцом",1);
        Infernape p4 = new Infernape("Мощный",1);
        Lileep p5 = new Lileep("Лил-Пип", 1);
        Monferno p6 = new Monferno("Средний",1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}