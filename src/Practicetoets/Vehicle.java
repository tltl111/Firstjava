package Practicetoets;

public abstract class Vehicle implements Rentable {

    private String make;
    private String model;
    private int year;
    private double rentalCost;
    private boolean vehicleAvailable;

    public static final double RENTAL_COST_PER_DAY = 50.0;


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalCost = 1000.0;
        this.vehicleAvailable = true;
    }

    public void rent() {
        this.vehicleAvailable = false;
    }

    public void returnVehicle() {
        this.vehicleAvailable = true;
    }

    public double getRentalCost() {
        return rentalCost;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public boolean getVehicleAvailable() {
        return vehicleAvailable;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setVehicleAvailable(boolean available) {
        this.vehicleAvailable = available;
    }
    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public String toString() {
        return "Make: " + make +
        ", Model: " + model +
        ", Year: " + year +
        ", Available: " + vehicleAvailable;
    }
}
