package oop.t5_Polymorphism.WildFarm;

public abstract class Feline extends Mammal{
    public Feline(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    public abstract void eat(Food food);
}
