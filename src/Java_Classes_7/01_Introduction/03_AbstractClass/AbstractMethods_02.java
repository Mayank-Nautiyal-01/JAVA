
abstract class Animal {

    // Abstract Method
    abstract void makeSound();

    // Concrete Method
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Bark Bark");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}

public class AbstractMethods_02 {

    public static void main(String[] args) {

        System.out.println("========== Abstract Methods ==========\n");

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.makeSound();

        System.out.println();

        cat.eat();
        cat.makeSound();

    }
}

/*
 * =========================================================
 * ABSTRACT METHODS
 * =========================================================
 * 
 * What is an Abstract Method?
 * ---------------------------------------------------------
 * 
 * An Abstract Method is a method declared without a body.
 * Only the method declaration is provided.
 * 
 * The implementation is left for child classes.
 * 
 * Syntax
 * 
 * abstract void makeSound();
 * 
 * Notice
 * 
 * There are
 * 
 * ✔ No braces {}
 * 
 * ✔ No implementation
 * 
 * ✔ Ends with a semicolon ;
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * An Abstract Method specifies WHAT a class should do,
 * not HOW it should do it.
 * 
 * The child class provides the implementation.
 * 
 * ---------------------------------------------------------
 * 
 * Why do we need Abstract Methods?
 * ---------------------------------------------------------
 * 
 * Suppose every animal makes a sound.
 * 
 * Animal
 * 
 * ↓
 * 
 * Dog
 * 
 * ↓
 * 
 * Cat
 * 
 * ↓
 * 
 * Lion
 * 
 * Every animal makes a sound.
 * 
 * But...
 * 
 * Dog
 * 
 * ↓
 * 
 * Bark
 * 
 * Cat
 * 
 * ↓
 * 
 * Meow
 * 
 * Lion
 * 
 * ↓
 * 
 * Roar
 * 
 * Can we write one common implementation?
 * 
 * No.
 * 
 * Every animal behaves differently.
 * 
 * So instead of writing incorrect code,
 * 
 * Java lets us declare
 * 
 * makeSound()
 * 
 * without implementation.
 * 
 * Each child class provides its own version.
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * abstract class Animal {
 * 
 * abstract void makeSound();
 * 
 * void eat() {
 * 
 * System.out.println("Animal is eating...");
 * 
 * }
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * abstract void makeSound();
 * 
 * Declares an abstract method.
 * 
 * No implementation is provided.
 * 
 * Every concrete child class must implement it.
 * 
 * ---------------------------------------------------------
 * 
 * void eat()
 * 
 * This is a normal concrete method.
 * 
 * It is inherited by all child classes.
 * 
 * ---------------------------------------------------------
 * 
 * class Dog extends Animal
 * 
 * Dog inherits Animal.
 * 
 * Since Dog is a Concrete Class,
 * 
 * it MUST implement
 * 
 * makeSound().
 * 
 * ---------------------------------------------------------
 * 
 * @Override
 * 
 * Indicates that the child class is overriding
 * the parent class method.
 * 
 * If we accidentally change the method name,
 * 
 * Java reports a Compile-Time Error.
 * 
 * ---------------------------------------------------------
 * 
 * void makeSound()
 * 
 * Dog provides its own implementation.
 * 
 * Output
 * 
 * Dog says: Bark Bark
 * 
 * ---------------------------------------------------------
 * 
 * class Cat extends Animal
 * 
 * Cat also overrides
 * 
 * makeSound()
 * 
 * with its own implementation.
 * 
 * Output
 * 
 * Cat says: Meow Meow
 * 
 * ---------------------------------------------------------
 * 
 * What happens if Dog doesn't implement
 * makeSound()?
 * 
 * Example
 * 
 * class Dog extends Animal {
 * 
 * }
 * 
 * Compile-Time Error
 * 
 * Reason
 * 
 * Dog becomes responsible for implementing
 * every inherited abstract method.
 * 
 * Otherwise,
 * 
 * Dog itself must also be declared abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Heap
 * 
 * dog ------------------> Dog Object
 * 
 * cat ------------------> Cat Object
 * 
 * Both objects inherit
 * 
 * eat()
 * 
 * Both objects have their own implementation
 * of
 * 
 * makeSound()
 * 
 * ---------------------------------------------------------
 * 
 * Rules of Abstract Methods
 * ---------------------------------------------------------
 * 
 * ✔ Must be declared inside an abstract class
 * or interface.
 * 
 * ✔ Cannot have a method body.
 * 
 * ✔ Child class must implement it.
 * 
 * ✔ Ends with a semicolon.
 * 
 * ✔ Can be overridden only.
 * 
 * ---------------------------------------------------------
 * 
 * Can an Abstract Class contain both
 * Abstract and Concrete Methods?
 * 
 * YES.
 * 
 * Example
 * 
 * abstract class Animal {
 * 
 * abstract void makeSound();
 * 
 * void eat() {
 * 
 * System.out.println("Eating");
 * 
 * }
 * 
 * }
 * 
 * This is perfectly valid.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Forces child classes to implement
 * important behaviour.
 * 
 * ✔ Promotes Runtime Polymorphism.
 * 
 * ✔ Improves code flexibility.
 * 
 * ✔ Reduces duplicate code.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Giving an abstract method a body.
 * 
 * Wrong
 * 
 * abstract void display() {
 * 
 * }
 * 
 * Correct
 * 
 * abstract void display();
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Forgetting to override abstract methods.
 * 
 * If a child class does not implement every
 * abstract method,
 * 
 * the child class itself must be declared
 * abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1.
 * 
 * What is an Abstract Method?
 * 
 * A method declared without implementation.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Can an Abstract Method have a body?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * Who provides the implementation?
 * 
 * The Concrete Child Class.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * Can we create an object of a class
 * containing abstract methods?
 * 
 * No.
 * 
 * Only concrete child classes can be instantiated.
 * 
 * ---------------------------------------------------------
 * 
 * Q5.
 * 
 * Can an Abstract Class have both concrete
 * and abstract methods?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q6.
 * 
 * What happens if a child class doesn't
 * override an abstract method?
 * 
 * The child class must also be declared
 * abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ No Method Body
 * 
 * ✔ Ends with ;
 * 
 * ✔ Declared using abstract
 * 
 * ✔ Must be overridden
 * 
 * ✔ Child class provides implementation
 * 
 * ✔ Enables Runtime Polymorphism
 * 
 * Next File
 * 
 * ConcreteMethods_03.java
 * 
 * We'll learn why Abstract Classes are allowed
 * to contain normal methods and when we should
 * use them.
 * 
 * =========================================================
 */