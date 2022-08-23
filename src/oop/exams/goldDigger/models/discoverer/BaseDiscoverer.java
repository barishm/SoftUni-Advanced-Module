package oop.exams.goldDigger.models.discoverer;

import oop.exams.goldDigger.common.ConstantMessages;
import oop.exams.goldDigger.models.museum.BaseMuseum;
import oop.exams.goldDigger.models.museum.Museum;

import static oop.exams.goldDigger.common.ExceptionMessages.DISCOVERER_ENERGY_LESS_THAN_ZERO;
import static oop.exams.goldDigger.common.ExceptionMessages.DISCOVERER_NAME_NULL_OR_EMPTY;


public abstract class BaseDiscoverer implements Discoverer{
    private String name;
    private double energy;
    private Museum museum;

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(DISCOVERER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setEnergy(double energy) {
        if(energy<0){
            throw new IllegalArgumentException(DISCOVERER_ENERGY_LESS_THAN_ZERO);
        }
        this.energy = energy;
    }

    public BaseDiscoverer(String name, double energy) {
        setName(name);
        setEnergy(energy);
        this.museum = new BaseMuseum();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public boolean canDig() {
        return energy > 0;
    }

    @Override
    public Museum getMuseum() {
        return museum;
    }

    @Override
    public void dig() {
        energy -= 15;
        if(energy < 0){
            setEnergy(0);
        }
    }
    @Override
    public String toString(){
        return String.format(ConstantMessages.FINAL_DISCOVERER_NAME,name) + System.lineSeparator()+
                String.format(ConstantMessages.FINAL_DISCOVERER_ENERGY,energy)+System.lineSeparator()+
                String.format(ConstantMessages.FINAL_DISCOVERER_MUSEUM_EXHIBITS,(museum.getExhibits().size() == 0 ? "None" :
                        String.join(ConstantMessages.FINAL_DISCOVERER_MUSEUM_EXHIBITS_DELIMITER,museum.getExhibits())));
    }
}
