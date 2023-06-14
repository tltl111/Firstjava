package Verzameling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainListHashmapsSetPractice {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(44);
        intList.add(17);
        intList.add(17);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(6);
        intList.add(2);
        intList.add(1);
        intList.add(10);

        Set<Integer> duplicates = findDuplicates(intList);
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static Set<Integer> findDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (Integer element : list) {
            if (!set.add(element)) {
                duplicates.add(element);
            }
        }

        return duplicates;
    }
    
}
