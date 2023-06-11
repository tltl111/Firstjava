import java.util.HashSet;

public class MainSetPractice {

    public static void main(String[] args) {

        HashSet<String> shoppingCart = new HashSet<String>();
        addItem(shoppingCart, "Apple");
        addItem(shoppingCart, "Bannana");
        addItem(shoppingCart, "Candy");
        System.out.println(shoppingCart.size());
        removeItem(shoppingCart, "Apple");
        System.out.println(shoppingCart.size());
        System.out.println(getSize(shoppingCart));
        checkInstance(shoppingCart, "Candy");
        checkInstance(shoppingCart, "Money");
        System.out.println(shoppingCart.size());
        addItem(shoppingCart, "Money");
        checkInstance(shoppingCart, "Money");
        System.out.println(shoppingCart.size());
        addItem(shoppingCart, "Money");
        System.out.println(shoppingCart.size());
    }

    public static void addItem(HashSet<String> shoppingCart, String item) {
        shoppingCart.add(item);
    }

    public static void removeItem(HashSet<String> shoppingCart, String item) {
        shoppingCart.remove(item);
    }

    public static int getSize(HashSet<String> shoppingCart) {
        return shoppingCart.size();
    }

    public static void checkInstance(HashSet<String> shoppingCart, String item) {
        System.out.println(shoppingCart.contains(item));
    }
}
