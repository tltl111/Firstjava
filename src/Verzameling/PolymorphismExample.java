package Verzameling;
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
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Dog Fluffy = new Dog();

        animal1.makeSound();
        animal2.makeSound();
        Fluffy.makeSound();
    }
}
