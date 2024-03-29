package oop.t5_Polymorphism.Vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] carTokens = scan.nextLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]),Double.parseDouble(carTokens[2]));
        String[] truckTokens = scan.nextLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]),Double.parseDouble(truckTokens[2]));
        int n = Integer.parseInt(scan.nextLine().trim());
        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put("Car",car);
        vehicleMap.put("Truck",truck);

        for (int i = 0; i < n; i++) {
            String[] commandTokens = scan.nextLine().split(" ");
            Vehicle currentVehicle = vehicleMap.get(commandTokens[1]);
            if("Drive".equals(commandTokens[0])){
                System.out.println(currentVehicle.drive(Double.parseDouble(commandTokens[2])));
            }else if("Refuel".equals(commandTokens[0])){
                currentVehicle.refuel(Double.parseDouble(commandTokens[2]));
            }
        }
        car.printFuelQuantity();
        truck.printFuelQuantity();


    }
}
