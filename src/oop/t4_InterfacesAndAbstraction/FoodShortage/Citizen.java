package oop.t4_InterfacesAndAbstraction.FoodShortage;

public class Citizen implements Person, Identifiable, Birthable,Buyer {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name) {
        this.name = name;
        this.food = 0;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public String getId() {
        return this.id;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }
}
