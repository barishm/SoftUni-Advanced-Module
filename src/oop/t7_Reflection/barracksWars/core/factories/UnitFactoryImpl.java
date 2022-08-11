package oop.t7_Reflection.barracksWars.core.factories;

import oop.t7_Reflection.barracksWars.interfaces.Unit;
import oop.t7_Reflection.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"oop.t7_Reflection.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		// TODO: implement for problem 3
		throw new ExecutionControl.NotImplementedException("message");
	}
}
