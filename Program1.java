package assignment;

// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass of Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark"); // As per the instruction
    }
}

// Main class with main() method
public class Program1 {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Some generic animal sound

        Cat myCat = new Cat();
        myCat.makeSound();    // Output: Bark
    }

}
