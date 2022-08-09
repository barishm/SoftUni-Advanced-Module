package oop.t5_Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class AbstractVehicle implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;


    private DecimalFormat df = new DecimalFormat("#.##");

    public AbstractVehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double kilometers){
        if(hasEnoughFuel(kilometers)){
            return "needs refuelling";
        }
        consumeFuel(kilometers);
        return "travelled " + df.format(kilometers) + " km";
    }

    protected boolean hasEnoughFuel(double kilometers){
        double totalFuelCost = kilometers * getFuelConsumption();
        return totalFuelCost > getFuelQuantity();
    }
    protected void consumeFuel(double kilometers){
        fuelQuantity -= kilometers * fuelConsumption;
    }
    @Override
    public void refuel(double liters) {
        setFuelQuantity(liters + getFuelQuantity());
    }
    @Override
    public void printFuelQuantity(){
        System.out.println(": "+String.format("%.2f",fuelQuantity));
    }
    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
