package oop.t7_Reflection.barracksWars.interfaces;

public interface CommandInterpreter {

	@SuppressWarnings("unchecked")
	Executable interpretCommand(String[] data);

	Executable interpretCommand(String[] data, String commandName);
}
