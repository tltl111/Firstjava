public class Persoon {

    private int leeftijd;
    private int lengte;

    public Persoon() {
        this.leeftijd = 10;
        this.lengte = 120;
        System.out.println("\nNew persoon made");
    }
    public void spreek() {
        System.out.println("Ik ben een persoon.");
        System.out.println("Ik ben een persoon." + leeftijd);
        System.out.println("Ik ben een persoon." + lengte);
    }
}
