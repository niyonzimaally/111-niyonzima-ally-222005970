// Interface Flying
interface Flying {
    void fly();
}

// Base class Animal
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal implements Flying {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public void fly() {
        System.out.println("The dog can't fly");
    }

    void fetch() {
        System.out.println("The dog fetches a ball");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class inhertanceparentAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.fly();
        dog.fetch();

        System.out.println();

        cat.makeSound();
    }
}
