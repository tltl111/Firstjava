package Verzameling;
public class Verwissel {
    public static void main(String[] args) {
        int a, b, temp;
        a = 10;
        b = 20;

        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    
}
