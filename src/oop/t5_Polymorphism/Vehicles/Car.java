package oop.t5_Polymorphism.Vehicles;

public class Car extends AbstractVehicle{
    private static final double FUEL_CONSUMPTION_INCREASE = 0.9;
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE);
    }

    @Override
    public String drive(double kilometers) {
        return "Car " + super.drive(kilometers);
    }
    @Override
    public void printFuelQuantity(){
        System.out.print("Car");
        super.printFuelQuantity();
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }
}
