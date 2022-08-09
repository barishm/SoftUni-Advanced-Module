package oop.t5_Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;
    private DecimalFormat df = new DecimalFormat("#.##");

    public String getLivingRegion() {
        return livingRegion;
    }

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                df.format(getAnimalWeight()),
                livingRegion,
                getFoodEaten());
    }
    protected DecimalFormat getDf(){
        return df;
    }
}
