package oop.t4_InterfacesAndAbstraction.BirthdayCelebrations;

public class Pet implements Birthable {
    private String name;
    private String birthDate;

    public String getName() {
        return name;
    }

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
