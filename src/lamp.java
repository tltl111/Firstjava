import java.util.Random;


public class lamp {

    boolean isAan = true;

    public lamp() {
        Random random = new Random();
        this.isAan = random.nextBoolean();
    }
}
