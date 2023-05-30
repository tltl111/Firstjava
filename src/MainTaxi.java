public class MainTaxi {
    public static void main(String[] args) {

    Taxirit rit1 = new Taxirit(15.5); // 15,5 kilometer
    Taxirit rit2 = new Taxirit(3.0, 1, 6); // 3km, 2p., max 6p.

    rit1.voegPersoonToe();
    rit1.voegPersoonToe(35);
    rit2.voegPersoonToe();
    rit2.voegPersoonToe(35);

    }
}
