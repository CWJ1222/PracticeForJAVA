abstract class Animal {
    // Abstract method
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Ex82 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the makeSound method on each instance
        dog.makeSound(); // Output: Woof! Woof!
        cat.makeSound(); // Output: Meow! Meow!
    }
}
