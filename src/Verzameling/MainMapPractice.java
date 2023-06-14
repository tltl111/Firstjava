package Verzameling;
import java.util.HashMap;
import java.util.Map;

public class MainMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        addNumber(phoneBook, "Tom", 123456789);
        addNumber(phoneBook, "Naomi", 123456789);
        System.out.println(phoneBook.size());
        System.out.println(getNumber(phoneBook, "Tom"));
        removeEntry(phoneBook, "Tom");
        System.out.println(phoneBook.size());
    }

    public static void addNumber(Map<String, Integer> map, String name, int phoneNumber) {
        map.put(name, phoneNumber);
    }

    public static int getNumber(Map<String, Integer> map, String name) {
        return map.get(name);
    }

    public static void removeEntry(Map<String, Integer> map, String name) {
        map.remove(name);
    }
}