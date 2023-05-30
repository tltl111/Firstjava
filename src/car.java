public class car extends vehicle {
    
    private String color;
    private int numberOfDoors;
    private int maximumSpeed = 100;
    private double fuelEfficiency;

    public car(String color, int numberOfDoors) {
        super("Ford", "Focus", 2020);
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.maximumSpeed = this.maximumSpeed += (20 *numberOfDoors);
        this.fuelEfficiency = this.maximumSpeed / numberOfDoors;
    }

    public String getColor() {
        return color;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public int getMaximumSpeed() {
        return maximumSpeed;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

}
