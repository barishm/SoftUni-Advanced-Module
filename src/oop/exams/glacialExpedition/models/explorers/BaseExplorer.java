package oop.exams.glacialExpedition.models.explorers;

import oop.exams.glacialExpedition.models.suitcases.Suitcase;

public abstract class BaseExplorer implements Explorer{
    private String name;
    private double energy;
    private Suitcase suitcase;

    public BaseExplorer(String name, double energy) {
        this.name = name;
        this.energy = energy;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getEnergy() {
        return 0;
    }

    @Override
    public Suitcase getSuitcase() {
        return null;
    }

    @Override
    public boolean canSearch() {
        return false;
    }

    @Override
    public void search() {

    }
}
