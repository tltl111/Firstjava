package Verzameling;
public class MainVerpakking {
    public static void main(String[] args) {
        
        Verpakking verpakking1 = new Verpakking(2, 2, 2, true);
        Verpakking verpakking2 = new Verpakking(2, 2, 2, true);
        Verpakking verpakking3 = new Verpakking(2, 2, 2, false);
        
        System.out.println(verpakking1.equals(verpakking2));
        System.out.println(verpakking1.equals(verpakking3));
    }
}
