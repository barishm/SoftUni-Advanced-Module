package oop.t5_Polymorphism.Vehicles;

public class Car {
    private double fuelQuantity;
    private double literPerKm;

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public Car(double fuelQuantity, double literPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.literPerKm = literPerKm;
    }
    public void driveCar(double distance){
        if(distance * (literPerKm + 0.9) <= fuelQuantity){
            this.fuelQuantity -= distance * (literPerKm + 0.9);
            System.out.printf("Car travelled %f km%n",distance);
        }else{
            System.out.println("Car needs refueling");
        }
    }
    public void refuelTruck(double refuel){
        this.fuelQuantity += refuel;
    }
}
