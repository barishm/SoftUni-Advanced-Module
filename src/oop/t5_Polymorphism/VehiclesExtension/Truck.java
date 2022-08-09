package oop.t5_Polymorphism.VehiclesExtension;

public class Truck extends AbstractVehicle {
    private static final double FUEL_CONSUMPTION_INCREASE = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE,tankCapacity);
    }

    @Override
    public String drive(double kilometers) {
        return "Truck " + super.drive(kilometers);
    }
    @Override
    public void printFuelQuantity(){
        System.out.print("Truck");
        super.printFuelQuantity();
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
