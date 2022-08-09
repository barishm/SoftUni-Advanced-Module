package oop.t5_Polymorphism.WildFarm;

public class Tiger extends Feline {

    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Tiger", animalWeight, livingRegion);

    }

    private String livingRegion;

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            setFoodEaten(getFoodEaten()+food.getQuantity());
        }else{
            System.out.println("Tigers are not eating that type of food!");
        }

    }
}
