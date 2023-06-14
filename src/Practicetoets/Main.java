package Practicetoets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the make of the vehicle: ");
        String make = input.nextLine();

        System.out.print("Enter the model of the vehicle: ");
        String model = input.nextLine();

        System.out.print("Enter the year of the vehicle: ");
        int year = input.nextInt();

        input.close();

        Vehicle vehicle = new Car(make, model, year);

        vehicle.rent();
        System.out.println("Vehicle rented!");

        System.out.println("Vehicle Details:");
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Available: " + vehicle.getVehicleAvailable());

    }
}
