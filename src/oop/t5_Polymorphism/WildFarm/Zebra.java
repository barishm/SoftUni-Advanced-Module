package oop.t5_Polymorphism.WildFarm;

public class Zebra extends Mammal{
    @Override
    public void makeSound() {
        System.out.println("Zs");

    }

    @Override
    public void eat(Food food) {
        if(food instanceof Vegetable){
            setFoodEaten(getFoodEaten()+food.getQuantity());
        }else{
            System.out.println("Zebras are not eating that type of food!");
        }

    }

    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Zebra", animalWeight, livingRegion);
    }
}
