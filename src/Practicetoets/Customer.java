package Practicetoets;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rentable> rentedVehicles;

    public Customer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    public void rentVehicle(Rentable vehicle) {
        rentedVehicles.add(vehicle);
        vehicle.rent();
        System.out.println("Vehicle rented: " + vehicle.toString());
    }

    public void returnVehicle(Rentable vehicle) {
        if (rentedVehicles.remove(vehicle)) {
            vehicle.returnVehicle();
            System.out.println("Vehicle returned: " + vehicle.toString());
        } else {
            System.out.println("This vehicle is not rented by " + name);
        }
    }

    public void displayRentedVechiles() {
        System.out.println("Rented vehicles for " + name + ":");
        for (Rentable vehicle : rentedVehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
