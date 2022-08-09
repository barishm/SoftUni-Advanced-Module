package oop.t5_Polymorphism.VehiclesExtension;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] carTokens = scan.nextLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]),
                Double.parseDouble(carTokens[2]),
                Double.parseDouble(carTokens[3]));

        String[] truckTokens = scan.nextLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]),
                Double.parseDouble(truckTokens[2]),
                Double.parseDouble(truckTokens[3]));

        String[] busTokens = scan.nextLine().split(" ");
        Vehicle bus = new Bus(Double.parseDouble(busTokens[1]),
                Double.parseDouble(busTokens[2]),
                Double.parseDouble(busTokens[3]));

        int n = Integer.parseInt(scan.nextLine().trim());
        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put("Car",car);
        vehicleMap.put("Truck",truck);
        vehicleMap.put("Bus",bus);

        for (int i = 0; i < n; i++) {
            String[] commandTokens = scan.nextLine().split(" ");
            Vehicle currentVehicle = vehicleMap.get(commandTokens[1]);
            if("Drive".equals(commandTokens[0])){
                System.out.println(currentVehicle.drive(Double.parseDouble(commandTokens[2])));
            }else if("Refuel".equals(commandTokens[0])){
                currentVehicle.refuel(Double.parseDouble(commandTokens[2]));
            }else if("DriveEmpty".equals(commandTokens[0])){
                Bus currentBus = ((Bus)bus);
                currentBus.setEmpty(true);
                System.out.println(currentBus.drive(Double.parseDouble(commandTokens[2])));
                currentBus.setEmpty(false);
            }
        }
        car.printFuelQuantity();
        truck.printFuelQuantity();
        bus.printFuelQuantity();


    }
}
