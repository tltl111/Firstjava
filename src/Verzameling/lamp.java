package Verzameling;
import java.util.Random;


public class lamp {
    private boolean lampStatus;

    public lamp(boolean lampStatus) {
        this.lampStatus = lampStatus;
    }

    public void schakelLampOm() {
        if (this.lampStatus == true) {
            this.lampStatus = false;
            System.out.println("Lamp van aan naar uit geschakeld");
            printLampStatus();
        } else {
            this.lampStatus = true;
            System.out.println("Lamp van uit naar naar geschakeld");
            printLampStatus();
        }
    }

    public void zetLampAan() {
        if (this.lampStatus == true) {
            System.out.println("Lamp staat al aan");
            printLampStatus();
        } else {
            this.lampStatus = true;
            System.out.println("Lamp aangezet");
            printLampStatus();
        }
    }

    public void zetLampUit() {
        if (this.lampStatus == false) {
            System.out.println("Lamp staat al uit");
            printLampStatus();
        } else {
            this.lampStatus = false;
            System.out.println("Lamp uitgezet");
            printLampStatus();
        }
    }

    public void printLampStatus() {
        if (this.lampStatus == true) {
            System.out.println("Lamp is aan");
        } else {
            System.out.println("Lamp is uit");
        }
    }

    public static boolean randomLampStatus() {
        Random random = new Random();
        boolean status = random.nextBoolean();
        return status;
    }
}
