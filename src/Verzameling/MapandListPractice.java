package Verzameling;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;



public class MapandListPractice {
    public static void main(String[] args) {
    
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Apple", 5);
        hashMap.put("Banana", 10);
        hashMap.put("Orange", 5);

        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("Orange"));
        System.out.println(hashMap.containsKey("Banana"));

        hashMap.put("Car", 5);
        System.out.println(hashMap.containsKey("Car"));
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        hashMap.remove("Car");
        System.out.println(hashMap.containsKey("Car"));
        System.out.println(hashMap);
        System.out.println(hashMap.size());

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        Map<String, Integer> hashMap2 = new HashMap<>(hashMap);

        System.out.println(hashMap.isEmpty());
        hashMap.clear();
        System.out.println(hashMap.isEmpty());

        Map<String, Integer> newHashMap = new HashMap<>();
        newHashMap.put("Bike", 5);
        newHashMap.put("Car", 10);
        newHashMap.put("Truck", 5);

        System.out.println(hashMap2);
        hashMap2.putAll(newHashMap);
        System.out.println(hashMap2);


        System.out.println("\n\n");

        List<Object> newList = new ArrayList<>();

        newList.add("Hello");
        newList.add(42);
        newList.add(true);
        newList.add(3.14);
        newList.add(hashMap2.values());
        newList.addAll(hashMap2.values());

        System.out.println(newList.size());
        System.out.println(newList);
        System.out.println(newList.get(1));
        Object indexOneNewList = newList.get(1);
        System.out.println(indexOneNewList);
        System.out.println(newList.contains("Hello"));
        System.out.println(newList.contains(42));

        newList.remove(8);
        System.out.println(newList);
        
        List<Integer> newListInt = new ArrayList<>();
        newListInt.add(42);
        newListInt.add(3);
        newListInt.add(17);
        newListInt.add(3429);
        newListInt.add(1);
        System.out.println(newListInt);
        newListInt.sort(null);
        System.out.println(newListInt);

        System.out.println("\n\n");

        Object firstElement = newList.get(0);
        Object lastElement = newList.get(newList.size() - 1);
        System.out.println(firstElement);
        System.out.println(lastElement);

        System.out.println("\n\n");
        System.out.println(newList);
        int size = newList.size();
        for (int i = 0; i < size /2; i++) {
            Object temp = newList.get(i);
            newList.set(i, newList.get(size - i - 1));
            newList.set(size - i - 1, temp);
        }
        System.out.println(newList);

        System.out.println("\n\n");
        List<Object> newList2 = newList.subList(2, 7);
        System.out.println(newList);
        System.out.println(newList2);

        System.out.println("\n\n");
        System.out.println(newList.get(0).equals(newList.get(0)));
        System.out.println(newList.get(0).equals(newList.get(1)));

        System.out.println(newList);
        Random rand = new Random();
        int n = newList.size();
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Object temp = newList.get(i);
            newList.set(i, newList.get(j));
            newList.set(j, temp);
        }
        System.out.println(newList);
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Object temp = newList.get(i);
            newList.set(i, newList.get(j));
            newList.set(j, temp);
        }
        System.out.println(newList);
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Object temp = newList.get(i);
            newList.set(i, newList.get(j));
            newList.set(j, temp);
        }
        System.out.println(newList);
        Collections.shuffle(newList);
        System.out.println(newList);
        Collections.shuffle(newList);
        System.out.println(newList);
        Collections.shuffle(newList);
        System.out.println(newList);
    }
}