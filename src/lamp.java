public class lamp {
    private boolean lampStatus;

    public lamp() {
        this.lampStatus = lampStatus;
    }

    public void schakelLampOm() {
        if (this.lampStatus == true) {
            lampStatus = false;
            System.out.println("Lamp van aan naar uit geschakeld");
            printLampStatus();
        } else {
            lampStatus = true;
            System.out.println("Lamp van uit naar naar geschakeld");
            printLampStatus();
        }
    }

    public void zetLampAan() {
        if (this.lampStatus == true) {
            System.out.println("Lamp staat al aan");
        } else {
            lampStatus = true;
            System.out.println("Lamp aangezet");
            printLampStatus();
        }
    }

    public void zetLampUit() {
        lampStatus = false;
        System.out.println("Lamp uitgezet");
        printLampStatus();
    }

    public void printLampStatus() {
        if (this.lampStatus == true) {
            System.out.println("Lamp is aan");
        } else {
            System.out.println("Lamp is uit");
        }
    }
}
