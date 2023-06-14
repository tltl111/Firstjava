package Verzameling;
public class booleanChecker {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = true;

        System.out.println("\nInput " + a + " " + b + " " + c + " " + d + " results to:");

        if (b || c) {
            boolean value = true;
            System.out.println("b || c : " + value);
        } else {
            boolean value = false;
            System.out.println("b || c : " + value);
        }

        if (a && b || c) {
            boolean value = true;
            System.out.println("a && b || c : " + value);
        } else {
            boolean value = false;
            System.out.println("a && b || c : " + value);
        }

        if (a && b || c && d) {
            boolean value = true;
            System.out.println("a && b || c && d : " + value);
        } else {
            boolean value = false;
            System.out.println("a && b || c && d : " + value);
        }

        boolean value = b || c;
        boolean value2 = a && b || c;
        boolean value3 = a && b || c && d;
        System.out.println("\nb || c : " + value);
        System.out.println("a && b || c : " + value2);
        System.out.println("a && b || c && d : " + value3);
    }
}
