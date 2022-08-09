package oop.t5_Polymorphism.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Animal> animalList = new ArrayList<>();
        List<Food> foodList = new ArrayList<>();
        while(!"End".equals(input)) {
            String[] tokens = input.split(" ");
            String animalType = tokens[0];
            if ("Cat".equals(animalType)) {
                Animal cat = new Cat(tokens[1], Double.parseDouble(tokens[2]), tokens[3], tokens[4]);
                animalList.add(cat);
            }else if("Tiger".equals(animalType)){
                Animal tiger = new Tiger(tokens[1],Double.parseDouble(tokens[2]), tokens[3]);
                animalList.add(tiger);
            }else if("Mouse".equals(animalType)){
                Animal mouse = new Mouse(tokens[1],Double.parseDouble(tokens[2]), tokens[3]);
                animalList.add(mouse);
            }else if("Zebra".equals(animalType)){
                Animal zebra = new Zebra(tokens[1],Double.parseDouble(tokens[2]), tokens[3]);
                animalList.add(zebra);
            }
            input = scan.nextLine();
            String[] foodTokens = input.split(" ");
            if("Vegetable".equals(foodTokens[0])){
                Food vegetable = new Vegetable(Integer.parseInt(foodTokens[1]));
                foodList.add(vegetable);
            }else if("Meat".equals(foodTokens[0])){
                Food meat = new Meat(Integer.parseInt(foodTokens[1]));
                foodList.add(meat);
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            Food food = foodList.get(i);
            animal.makeSound();
            animal.eat(food);
        }
        for (Animal animal : animalList) {
            System.out.println(animal);
        }


    }
}
