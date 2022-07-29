package oop.t5_Polymorphism.Vehicles;

public class Truck {
    private double fuelQuantity;
    private double literPerKm;

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public Truck(double fuelQuantity, double literPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.literPerKm = literPerKm;
    }
    public void driveTruck(double distance){
        if(distance * (literPerKm + 1.6) <= fuelQuantity){
            this.fuelQuantity -= distance * (literPerKm + 1.6);
            System.out.printf("Truck travelled %f km%n",distance);
        }else{
            System.out.println("Truck needs refueling");
        }
    }
    public void refuelTruck(double refuel){
        this.fuelQuantity += refuel * 0.95;
    }
}
