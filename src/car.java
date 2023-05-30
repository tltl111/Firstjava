public class car extends vehicle {
    
    private String color;
    private int numberOfDoors;

    public car(String color, int numberOfDoors) {
        super("Ford", "Focus", "2020");
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setColor() {
        this.color = color;
    }
    public void setNumberOfDoors() {
        this.numberOfDoors = numberOfDoors;
    }
}
