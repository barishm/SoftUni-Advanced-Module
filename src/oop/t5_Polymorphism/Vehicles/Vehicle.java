package oop.t5_Polymorphism.Vehicles;

public interface Vehicle {
    String drive(double kilometers);
    void refuel(double liters);

    void printFuelQuantity();
}
