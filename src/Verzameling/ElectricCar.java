package Verzameling;
public class ElectricCar extends car {

    private int batteryCapacity;

    public ElectricCar(int batteryCapacity) {
        super("Green", 4);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
}
