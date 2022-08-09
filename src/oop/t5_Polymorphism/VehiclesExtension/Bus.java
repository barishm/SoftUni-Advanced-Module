package oop.t5_Polymorphism.VehiclesExtension;

public class Bus extends AbstractVehicle{
    private boolean empty;


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }
    @Override
    public String drive(double kilometers){
        if (!empty) {
            setFuelConsumption(getFuelConsumption() + 1.4);
        }
        return "Bus "+ super.drive(kilometers);
    }
    @Override
    public void printFuelQuantity(){
        System.out.print("Bus");
        super.printFuelQuantity();
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
