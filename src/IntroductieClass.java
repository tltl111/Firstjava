public class IntroductieClass {
    private String naam;
    private int leeftijd;
    private String geslacht;
    
    public IntroductieClass(String naam, int leeftijd, String geslacht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.geslacht = geslacht;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getGeslacht() {
        return geslacht;
    }
    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public void voorstellen() {
        System.out.println("Naam: " + naam);
        System.out.println("Leeftijd: " + leeftijd);
        System.out.println("Geslacht: " + geslacht);
    }
}
