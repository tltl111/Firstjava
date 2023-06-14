package Verzameling;
public class MainLamp {
    public static void main(String[] args) {

        lamp lamp1 = new lamp(lamp.randomLampStatus());

        lamp1.zetLampAan();
        lamp1.zetLampUit();
        lamp1.zetLampAan();
        lamp1.zetLampAan();
        lamp1.zetLampUit();
        lamp1.zetLampUit();
        lamp1.schakelLampOm();
        lamp1.schakelLampOm();

        lamp1.printLampStatus();
    }
}
