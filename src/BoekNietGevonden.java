import java.util.Random;

public class BoekNietGevonden {
    
    public void geefLes() throws BoekNietGevondenException {

        boolean boekGevonden = zoekBoek();

        if (!boekGevonden) {
            throw new BoekNietGevondenException();
        } else {
            leesboek();
            leguit();
        }
    }

    boolean zoekBoek() {
        Random random = new Random();
        boolean boekGevonden = random.nextBoolean();
        return boekGevonden;
    }

    void leesboek() {
        System.out.println("Er staan alleen plaatjes in het boek");
    }

    void leguit() {
        System.out.println("Blijkbaar praat een koe en zegt de koe 'moe'");
    }
    
}
