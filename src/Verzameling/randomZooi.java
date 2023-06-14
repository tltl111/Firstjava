package Verzameling;
import java.util.Scanner;


public class randomZooi {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("How large do you want the board to be?");
    
    String notYetAnIntx = input.next();
    String notYetAnInty = input.next();

    int x = Integer.parseInt(notYetAnIntx);
    int y = Integer.parseInt(notYetAnInty);

    schaakbord s1 = new schaakbord(x, y);
    // schaakbord s1 = new schaakbord(8, 8);
    s1.print();

    input.close();

    }
}


    // for (int i = 1; i <= 7; i++) {
    // System.out.println(i + " " + (i + 1) + " " + (i + 2));
    // System.out.print(i + " ");
    // System.out.print(i + 1 + " ");
    // System.out.println(i + 2);
    // }