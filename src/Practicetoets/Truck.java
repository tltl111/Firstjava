package Practicetoets;

public class Truck extends Vehicle {
    
    public Truck(String model, String make, int year) {
        super(make, model, year);
        setRentalCost(getRentalCost() + 200);
    }

}
