abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is meowing");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is barking");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Dog object assigned to an Animal reference
        Animal animal2 = new Cat(); // Cat object assigned to an Animal reference
        Dog Fluffy = new Dog();

        animal1.makeSound(); // Calls Dog's makeSound method
        animal2.makeSound(); // Calls Cat's makeSound method
        Fluffy.makeSound();
    }
}
