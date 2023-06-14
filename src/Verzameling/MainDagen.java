package Verzameling;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainDagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which day of the week is it? (0-6): ");

        try {
            int day = input.nextInt();

            String dayOfWeek;

            switch (day) {
                case 0:
                    dayOfWeek = "Monday";
                    break;
                case 1:
                    dayOfWeek = "Tuesday";
                    break;
                case 2:
                    dayOfWeek = "Wednesday";
                    break;
                case 3:
                    dayOfWeek = "Thursday";
                    break;
                case 4:
                    dayOfWeek = "Friday";
                    break;
                case 5:
                    dayOfWeek = "Saturday";
                    break;
                case 6:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "No valid day";
                    break;
            }

            System.out.println("Day of the week: " + dayOfWeek);
        } catch (InputMismatchException e) {
            System.out.println("No valid day");
            main(null);
        }

        input.close();

    }
}
