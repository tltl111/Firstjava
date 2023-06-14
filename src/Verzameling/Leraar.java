package Verzameling;
public class Leraar extends Persoon {
    
    private int salaris;

    public Leraar() {
        super();
    }

    public void spreek() {
        System.out.println("Ik ben een leraar.");
        System.out.println("Ik ben een leraar." + salaris);
    }

}
