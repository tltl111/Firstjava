package Verzameling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Oritoets {
    public static void main(String[] args) {
        
        int number = antwoord();

        int resultSomOneven = somOneven(number);
        int resultSomEven = somEven(number);

        verschil(resultSomOneven, resultSomEven);

        eersteIntOverflow();
    }


    public static int antwoord() {
        Scanner input = new Scanner(System.in);

        int number = 0;

        try {
            System.out.print("Geef een geheel positief getal: ");
            number = input.nextInt();

            if (number < 0) {
               System.out.println("Je mag alleen een positief getal invoeren.");
               return antwoord();
            }
            try {
                int som = 0;
                for (int i = 1; i <= number; i += 2) {
                    som = Math.addExact(som, i);
                }
            } catch (ArithmeticException e) {
                System.out.println("Overflow door te hoog getal. Probeer een lager getal.");
                return antwoord();
            }
        } catch (InputMismatchException e) {
            System.out.println("Je kunt alleen een geheel positief getal invoeren.");
            return antwoord();
        } finally {
            input.close();
        }
        return number;
    }

    public static int somOneven(int getal) {
        int som = 0;
        for (int i = 1; i <= getal; i += 2) {
            som += i;
        }
        System.out.println("Som van oneven getallen tot en met " + getal + " is " + som);
        return som;
    }

    public static int somEven(int getal) {
        int som = 0;
        for (int i = 2; i <= getal; i += 2) {
            som += i;
        }
        System.out.println("Som van even getallen tot en met " + getal + " is " + som);
        return som;
    }

    public static void verschil(int oneven, int even) {
        int verschil = Math.abs(oneven - even);
        System.out.println("Verschil tussen twee sommen is " + verschil);
    }

    public static void eersteIntOverflow() {
    int getal = 1;
    int som = 0;
    long getalL = 1;
    long somL = 0;
    try {
        while (true) {
            som = Math.addExact(som, getal);
            getal += 2;
        }
    } catch (ArithmeticException e) {
        System.out.println();
        System.out.println("Eerste overflow bij getal: " + getal);
        System.out.println("Hoogste getal dat je kunt gebruiken: " + (getal - 1));
    }
    try {
        while (true) {
            somL = Math.addExact(getalL, somL);
            getalL += 2;
        }
    } catch (ArithmeticException e) {
        System.out.println();
        System.out.println("Eerste overflow bij long getal: " + getalL);
        System.out.println("Hoogste long getal dat je kunt gebruiken: " + (getalL - 1));
    }
}
}
