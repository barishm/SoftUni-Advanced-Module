package t6_DefiningClasses.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car = new Car();

        car.brand = "Chevrolet";
        car.model = "Impala";
        car.horsePower = 390;

        System.out.printf("The car is %s %s - %d HP.%n",car.brand,car.model,car.horsePower );
    }
}
