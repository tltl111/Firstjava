package Verzameling;
public class BoekNietGevondenMain {
    public static void main(String[] args) {
        BoekNietGevonden boekNietGevonden = new BoekNietGevonden();
        
        try {
            boekNietGevonden.geefLes();
        } catch (BoekNietGevondenException e) {
            System.out.println("Boek niet gevonden: " + e.getMessage());
        }
    }
}
