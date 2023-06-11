import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainListPractice {
    public static void main(String[] args) {
        
        List<Integer> newList = new ArrayList<>();
        
        newList.add(1);
        newList.add(3);
        newList.add(5);
        newList.add(7);
        newList.add(9);

        System.out.println(newList.size());
        System.out.println(newList.isEmpty());
        System.out.println(newList.get(2));
        newList.remove(0);
        newList.add(1);
        System.out.println(newList.contains(5));
        newList.clear();
        System.out.println(newList.size());

        List<String> stringList = new ArrayList<>();
        List<String> reversedStringList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
    
        System.out.println("can you type five things?");
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        String string3 = input.nextLine();
        String string4 = input.nextLine();
        String string5 = input.nextLine();

        stringList.add(string1);
        stringList.add(string2);
        stringList.add(string3);
        stringList.add(string4);
        stringList.add(string5);

        for (String string : stringList) {
            reversedStringList.add(0, string);
        }
        System.out.println(stringList);
        System.out.println(reversedStringList);

        String longestString = " ";
        for (String string : stringList) {
            if (string.length() > longestString.length()) {
                longestString = string;
            }
        }
        System.out.println(longestString);
        
        for (String string : stringList) {
            if (string.length() < 3) {
                stringList.remove(string);
            }
        }
        System.out.println(stringList);

        System.out.println("Type something to search for in the list");
        String string6 = input.nextLine();

        for (String string : stringList) {
            if (string6.equals(string)) {
                System.out.println(string);
            }
        }

        System.out.println(stringList);

        input.close();
    }

}
