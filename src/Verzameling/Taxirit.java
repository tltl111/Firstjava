package Verzameling;
public class Taxirit {
    
    private double prijsPerKm = 1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;

    public Taxirit(double afstand) {
        this(afstand, 1, 4);
        // this.aantalPers = 1;
        // this.maxAantal = 4;
        // this.afstand = afstand;
    }

    public Taxirit(double afstand, int aantalPers, int maxAantal) {
        this.afstand = afstand;
        if (aantalPers > maxAantal) {
            this.aantalPers = maxAantal;
        } else {
            this.aantalPers = aantalPers;
        }
        this.maxAantal = maxAantal;
    }

    public void voegPersoonToe() {
        if (this.aantalPers >= this.maxAantal) {
            System.out.println("Waarschuwing, taxi is vol!\n");
        } else {
            this.aantalPers++;
        }
    }
    public void voegPersoonToe(int aantalPersonen) {
        if (aantalPersonen >= this.maxAantal) {
            this.aantalPers = this.maxAantal;
            System.out.println("Waarschuwing, taxi is vol!\n" + this.maxAantal + " personen max");
        } else {
            this.aantalPers += aantalPers;
        }
    }

    public double berekenPrijsPerPersoon() {
        double prijsTotaal = prijsPerKm * afstand;
        double prijsPerPesoon = prijsTotaal / aantalPers;
        if (aantalPers == maxAantal) {
            double prijsPerPersoonMetKorting = prijsPerPesoon * 0.9;
            System.out.println(prijsPerPersoonMetKorting + " met korting");
            return prijsPerPersoonMetKorting;
        } else {
            System.out.println(prijsPerPesoon + " zonder korting");
            return prijsPerPesoon;
        }
    }

    public double berekenPrijsPerPersoon2() {
        double totaal = this.afstand * this.prijsPerKm;
        if (this.aantalPers == this.maxAantal) {
            return (totaal * 0.9) / this.aantalPers;
        }
        return totaal / this.aantalPers;
    }
    public double berekenPrijsPerPersoon2(double korting) {
        double totaal = this.afstand * this.prijsPerKm;
        korting /= 100;
        return (totaal / this.aantalPers) * (1 - korting);
    }

}
