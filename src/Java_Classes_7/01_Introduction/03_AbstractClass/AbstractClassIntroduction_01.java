
abstract class Animal {

    // Concrete Method
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Concrete Class
class Dog extends Animal {

}

public class AbstractClassIntroduction_01 {

    public static void main(String[] args) {

        System.out.println("========== Abstract Class Introduction ==========\n");

        // Animal a = new Animal(); // Compile-Time Error

        Dog dog = new Dog();

        dog.eat();

        System.out.println("\nDog object created successfully.");

    }
}

/*
 * =========================================================
 * ABSTRACT CLASS INTRODUCTION
 * =========================================================
 * 
 * What is an Abstract Class?
 * ---------------------------------------------------------
 * 
 * An Abstract Class is a class declared using the 'abstract' keyword.
 * It acts as a blueprint for other classes and cannot be instantiated
 * directly.
 * 
 * Syntax
 * 
 * abstract class Animal {
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * An Abstract Class is an incomplete class whose object cannot be
 * created directly. It is designed to be inherited by other classes.
 * 
 * ---------------------------------------------------------
 * 
 * Why was Abstract Class introduced?
 * ---------------------------------------------------------
 * 
 * Imagine every animal can eat and sleep.
 * 
 * But how they make a sound is different.
 * 
 * Dog -> Bark
 * Cat -> Meow
 * Lion -> Roar
 * 
 * If we create a normal Animal class, we don't know the common
 * implementation for every possible behavior.
 * 
 * Java introduced Abstract Classes so we can place common features
 * in one class and let child classes provide specific behavior.
 * 
 * ---------------------------------------------------------
 * 
 * Real-Life Example
 * ---------------------------------------------------------
 * 
 * Think of a "Vehicle" blueprint.
 * 
 * Every vehicle has:
 * 
 * ✔ Engine
 * ✔ Wheels
 * ✔ Fuel
 * 
 * But each vehicle moves differently.
 * 
 * Car -> Drive
 * Bike -> Ride
 * Airplane -> Fly
 * 
 * The Vehicle class represents common properties, while each child
 * class adds its own behavior.
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * abstract class Animal {
 * 
 * void eat() {
 * System.out.println("Animal is eating...");
 * }
 * 
 * }
 * 
 * class Dog extends Animal {
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * abstract class Animal
 * 
 * Declares Animal as an Abstract Class.
 * 
 * Because it is abstract, Java does not allow creating objects
 * directly.
 * 
 * ---------------------------------------------------------
 * 
 * void eat()
 * 
 * This is a normal (concrete) method.
 * 
 * Abstract Classes can contain normal methods.
 * 
 * We will learn abstract methods in the next file.
 * 
 * ---------------------------------------------------------
 * 
 * class Dog extends Animal
 * 
 * Dog inherits all accessible members of Animal.
 * 
 * Dog automatically gets the eat() method.
 * 
 * ---------------------------------------------------------
 * 
 * Animal a = new Animal();
 * 
 * Compile-Time Error.
 * 
 * Reason:
 * 
 * Abstract Classes cannot be instantiated.
 * 
 * ---------------------------------------------------------
 * 
 * Dog dog = new Dog();
 * 
 * Valid.
 * 
 * Dog is a Concrete Class, so Java allows object creation.
 * 
 * ---------------------------------------------------------
 * 
 * dog.eat();
 * 
 * Dog inherits the eat() method from Animal.
 * 
 * Output
 * 
 * Animal is eating...
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Memory Heap Memory
 * 
 * dog -----------------------> Dog Object
 * |
 * |
 * +----> Inherits eat() from Animal
 * 
 * No Animal object exists because Abstract Classes cannot be
 * instantiated.
 * 
 * ---------------------------------------------------------
 * 
 * Important Rules
 * ---------------------------------------------------------
 * 
 * ✔ Use the 'abstract' keyword.
 * 
 * ✔ Cannot create objects directly.
 * 
 * ✔ Can have constructors.
 * 
 * ✔ Can have variables.
 * 
 * ✔ Can have concrete methods.
 * 
 * ✔ Can have abstract methods (next file).
 * 
 * ✔ Can be extended by child classes.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Promotes code reuse.
 * 
 * ✔ Avoids duplicate code.
 * 
 * ✔ Provides a common parent for related classes.
 * 
 * ✔ Improves code organization.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking an Abstract Class cannot have methods.
 * 
 * Reality:
 * It can contain both concrete and abstract methods.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking an Abstract Class is completely empty.
 * 
 * Reality:
 * It may contain variables, constructors, and implemented methods.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking Abstract and Concrete are Java keywords together.
 * 
 * Reality:
 * Only 'abstract' is a Java keyword.
 * "Concrete Class" is just a programming concept.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. What is an Abstract Class?
 * 
 * A class declared with the 'abstract' keyword that cannot be
 * instantiated directly.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Can we create an object of an Abstract Class?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Why do we use Abstract Classes?
 * 
 * To provide common functionality while preventing direct object
 * creation of an incomplete base class.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. Can an Abstract Class contain normal methods?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Can an Abstract Class be inherited?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Declared using 'abstract'
 * 
 * ✔ Cannot create objects
 * 
 * ✔ Used as a parent class
 * 
 * ✔ Can contain variables
 * 
 * ✔ Can contain constructors
 * 
 * ✔ Can contain concrete methods
 * 
 * ✔ Child classes inherit from it
 * 
 * Next File
 * 
 * AbstractMethods_02.java
 * 
 * In the next file we'll learn the real power of Abstract Classes:
 * Abstract Methods.
 * 
 * =========================================================
 * One important correction to a common misconception
 * 
 * Many tutorials say:
 * 
 * "An Abstract Class is an incomplete class."
 * 
 * That statement is helpful for beginners, but it's not technically precise.
 * 
 * A better way to think about it is:
 * 
 * An Abstract Class is a class that is not intended to be instantiated
 * directly. It can provide shared implementation and/or define behavior that
 * subclasses are expected to provide.
 */