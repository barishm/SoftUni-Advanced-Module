package oop.t7_Reflection.barracksWars.core.commands;

import oop.t7_Reflection.barracksWars.interfaces.Executable;

public abstract class Command implements Executable {

    private final String[] data;

    protected Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return this.data;
    }

}

