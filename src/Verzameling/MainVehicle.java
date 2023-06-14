package Verzameling;
public class MainVehicle {
    public static void main(String[] args) {
        vehicle first = new vehicle("Opel", "Kadett", 1900);
        vehicle second = new car("Blue", 2);
        vehicle third = new car("Blue", 4);
        car fourth = new car("Yellow", 4);
        car fifth = new car("Blue", 2);
        ElectricCar sixth = new ElectricCar(100);
        
        System.out.println(first.getClass());
        System.out.println(second.getClass());
        System.out.println(third.getClass());
        System.out.println(fourth.getClass());
        System.out.println(fourth.getMaximumSpeed());
        System.out.println(fifth.getMaximumSpeed());
        System.out.println(fourth.getFuelEfficiency());
        System.out.println(fifth.getFuelEfficiency());
        System.out.println();
        System.out.println(sixth.getBatteryCapacity());
        System.out.println(sixth.getMaximumSpeed());
        System.out.println(sixth.getYear());

        


    }
}
