package oop.t7_Reflection.barracksWars;

import oop.t7_Reflection.barracksWars.interfaces.Repository;
import oop.t7_Reflection.barracksWars.interfaces.Runnable;
import oop.t7_Reflection.barracksWars.interfaces.UnitFactory;
import oop.t7_Reflection.barracksWars.core.Engine;
import oop.t7_Reflection.barracksWars.core.factories.UnitFactoryImpl;
import oop.t7_Reflection.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
