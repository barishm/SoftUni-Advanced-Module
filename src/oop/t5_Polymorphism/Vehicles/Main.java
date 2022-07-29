package oop.t5_Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carInfo = scan.nextLine().split(" ");
        String[] truckInfo = scan.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInfo[1]),Double.parseDouble(carInfo[2]));
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]),Double.parseDouble(truckInfo[2]));
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] commands = input.split(" ");
            if(commands[0].equals("Drive")){
                if(commands[1].equals("Car")){
                    car.driveCar(Double.parseDouble(commands[2]));
                }else if(commands[1].equals("Truck")){
                    truck.driveTruck(Double.parseDouble(commands[2]));
                }
            }else if(commands[0].equals("Refuel")){
                if(commands[1].equals("Car")){
                    car.refuelTruck(Double.parseDouble(commands[2]));
                }else if(commands[1].equals("Truck")){
                    truck.refuelTruck(Double.parseDouble(commands[2]));
                }
            }
        }
        System.out.printf("Car: %.2f%n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n",truck.getFuelQuantity());
    }
}
