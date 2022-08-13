package oop.t7_Reflection.barracksWars.core.commands;

import oop.t7_Reflection.barracksWars.annotations.Inject;
import oop.t7_Reflection.barracksWars.interfaces.Repository;

public class Retire extends Command {

    @Inject
    private Repository repository;

    public Retire(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try {
            this.repository.removeUnit(this.getData()[1]);
        } catch (Exception e) {
            return e.getMessage();
        }
        return this.getData()[1] + " retired!";
    }
}
