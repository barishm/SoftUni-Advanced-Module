package oop.t7_Reflection.barracksWars.core.factories;

import oop.t7_Reflection.barracksWars.interfaces.Unit;
import oop.t7_Reflection.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME = "oop.t7_Reflection.barracksWars.models.units.";

    @Override
    @SuppressWarnings("unchecked")
    public Unit createUnit(String unitType) throws InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            ClassNotFoundException {

        Class<Unit> unitClass = (Class<Unit>) Class.forName(UNITS_PACKAGE_NAME + unitType);

        return createUnit(unitClass);
    }

    private Unit createUnit(Class<Unit> unitClass) throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        return constructor.newInstance();
    }
}

