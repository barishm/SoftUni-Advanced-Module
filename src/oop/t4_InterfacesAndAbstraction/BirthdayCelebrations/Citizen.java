package oop.t4_InterfacesAndAbstraction.BirthdayCelebrations;

public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

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

}
