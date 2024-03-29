package oop.t7_Reflection.barracksWars.core.commands;

import oop.t7_Reflection.barracksWars.annotations.Inject;
import oop.t7_Reflection.barracksWars.interfaces.Repository;
import oop.t7_Reflection.barracksWars.interfaces.Unit;
import oop.t7_Reflection.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Add extends Command {

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    public Add(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ClassNotFoundException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            InvocationTargetException,
            ExecutionControl.NotImplementedException {

        final String unitType = getData()[1];

        final Unit unitToAdd = this.unitFactory.createUnit(unitType);

        this.repository.addUnit(unitToAdd);

        return unitType + " added!";
    }
}
