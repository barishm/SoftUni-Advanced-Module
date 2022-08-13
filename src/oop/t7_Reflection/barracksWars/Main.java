package oop.t7_Reflection.barracksWars;

import oop.t7_Reflection.barracksWars.core.CommandInterpreterImpl;
import oop.t7_Reflection.barracksWars.core.Engine;
import oop.t7_Reflection.barracksWars.core.factories.UnitFactoryImpl;
import oop.t7_Reflection.barracksWars.data.UnitRepository;
import oop.t7_Reflection.barracksWars.interfaces.Repository;
import oop.t7_Reflection.barracksWars.interfaces.UnitFactory;

public class Main {
    public static void main(String[] args) {

        final Repository repository = new UnitRepository();

        final UnitFactory unitFactory = new UnitFactoryImpl();

        final CommandInterpreterImpl commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        final Engine engine = new Engine(commandInterpreter);

        engine.run();
    }
}
