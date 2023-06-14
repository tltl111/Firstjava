package Verzameling;
public class Main {
    public static void main(String[] args) {
        IntroductieClass persoon = new IntroductieClass("Tom", 37, "man");
    persoon.voorstellen();

    persoon.setNaam("Strangename");
    persoon.setLeeftijd(137);
    persoon.setGeslacht("attack-helicopter");
    persoon.voorstellen();

    String naam = persoon.getNaam();
    int leeftijd = persoon.getLeeftijd();
    String geslacht = persoon.getGeslacht();
    System.out.println("Naam: " + naam);
    System.out.println("Leeftijd: " + leeftijd);
    System.out.println("Geslacht: " + geslacht);
    }
}
