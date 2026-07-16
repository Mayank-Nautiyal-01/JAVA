// package Java_Classes_7._01_Introduction._03_AbstractClass;

abstract class Animal {

    // Static Method
    static void category() {
        System.out.println("Category : Animals");
    }

    // Final Method
    final void breathe() {
        System.out.println("Every animal breathes.");
    }

    // Abstract Method
    abstract void makeSound();
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Bark Bark");
    }

    /*
     * // ERROR
     * // Cannot override final method
     * 
     * @Override
     * void breathe() {
     * 
     * }
     */
}

public class StaticAndFinalMethods_06 {

    public static void main(String[] args) {

        System.out.println("========== Static and Final Methods ==========\n");

        // Calling Static Method
        Animal.category();

        Dog dog = new Dog();

        // Calling Final Method
        dog.breathe();

        // Calling Abstract Method Implementation
        dog.makeSound();

    }
}

/*
 * =========================================================
 * STATIC & FINAL METHODS IN ABSTRACT CLASS
 * =========================================================
 * 
 * What is a Static Method?
 * ---------------------------------------------------------
 * 
 * A Static Method belongs to the class itself, not to objects.
 * 
 * It can be called without creating an object.
 * 
 * Example
 * 
 * Animal.category();
 * 
 * ---------------------------------------------------------
 * 
 * What is a Final Method?
 * ---------------------------------------------------------
 * 
 * A Final Method cannot be overridden by child classes.
 * 
 * It provides fixed behaviour that every child class must use.
 * 
 * Example
 * 
 * final void breathe() {
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Can an Abstract Class have Static Methods?
 * ---------------------------------------------------------
 * 
 * YES.
 * 
 * An Abstract Class can contain static methods exactly like a normal class.
 * 
 * Example
 * 
 * static void category() {
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Can an Abstract Class have Final Methods?
 * ---------------------------------------------------------
 * 
 * YES.
 * 
 * Example
 * 
 * final void breathe() {
 * 
 * }
 * 
 * Every child class inherits it but cannot override it.
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * abstract class Animal {
 * 
 * static void category() { }
 * 
 * final void breathe() { }
 * 
 * abstract void makeSound();
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * static void category()
 * 
 * WHAT?
 * 
 * A Static Method.
 * 
 * WHY?
 * 
 * The method belongs to the class, not to any object.
 * 
 * HOW TO CALL?
 * 
 * Animal.category();
 * 
 * ---------------------------------------------------------
 * 
 * final void breathe()
 * 
 * WHAT?
 * 
 * A Final Method.
 * 
 * WHY?
 * 
 * Every animal breathes the same way in our example.
 * 
 * No child class should change this behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * abstract void makeSound()
 * 
 * Different animals make different sounds.
 * 
 * Therefore, every child class must implement it.
 * 
 * ---------------------------------------------------------
 * 
 * Animal.category();
 * 
 * Calls the Static Method directly using the class name.
 * 
 * No object is required.
 * 
 * ---------------------------------------------------------
 * 
 * dog.breathe();
 * 
 * Calls the inherited Final Method.
 * 
 * Dog cannot override this method.
 * 
 * ---------------------------------------------------------
 * 
 * dog.makeSound();
 * 
 * Calls Dog's implementation of the Abstract Method.
 * 
 * ---------------------------------------------------------
 * 
 * Can a Final Method be Overridden?
 * ---------------------------------------------------------
 * 
 * No.
 * 
 * Wrong
 * 
 * @Override
 * void breathe() {
 * 
 * }
 * 
 * Compile-Time Error
 * 
 * Reason
 * 
 * A Final Method is locked.
 * 
 * ---------------------------------------------------------
 * 
 * Can a Static Method be Overridden?
 * ---------------------------------------------------------
 * 
 * No.
 * 
 * Static methods belong to the class, not to objects.
 * 
 * A child class may declare another static method with the same
 * signature, but this is called Method Hiding, not Method Overriding.
 * 
 * We will study Method Hiding later.
 * 
 * ---------------------------------------------------------
 * 
 * Can a Method be both Abstract and Final?
 * ---------------------------------------------------------
 * 
 * NO.
 * 
 * Wrong
 * 
 * abstract final void display();
 * 
 * Compile-Time Error
 * 
 * Reason
 * 
 * abstract
 * 
 * ↓
 * 
 * Must be overridden.
 * 
 * final
 * 
 * ↓
 * 
 * Cannot be overridden.
 * 
 * Both are opposite concepts.
 * 
 * ---------------------------------------------------------
 * 
 * Can a Method be both Abstract and Static?
 * ---------------------------------------------------------
 * 
 * NO.
 * 
 * Wrong
 * 
 * abstract static void display();
 * 
 * Compile-Time Error
 * 
 * Reason
 * 
 * Static methods belong to the class and cannot participate in
 * runtime overriding, while abstract methods require overriding by
 * child classes.
 * 
 * ---------------------------------------------------------
 * 
 * Summary Table
 * ---------------------------------------------------------
 * 
 * Feature Allowed?
 * 
 * Static Method ✔ Yes
 * 
 * Final Method ✔ Yes
 * 
 * Abstract Method ✔ Yes
 * 
 * Abstract + Final ✘ No
 * 
 * Abstract + Static ✘ No
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Static methods provide utility functionality.
 * 
 * ✔ Final methods protect important behaviour.
 * 
 * ✔ Abstract methods force child classes to implement specific behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking every method in an Abstract Class must be abstract.
 * 
 * Reality
 * 
 * It can contain normal, static and final methods.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Trying to override a Final Method.
 * 
 * This produces a Compile-Time Error.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Combining abstract with final or static.
 * 
 * These combinations are illegal.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Trap
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can an Abstract Class contain only Static Methods?
 * 
 * Answer
 * 
 * Yes.
 * 
 * It can even contain no Abstract Methods at all and still be declared
 * abstract if the designer wants to prevent direct object creation.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. Can an Abstract Class have Static Methods?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Can an Abstract Class have Final Methods?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Can a Final Method be overridden?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. Can a method be Abstract and Final together?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Can a method be Abstract and Static together?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Static methods belong to the class.
 * 
 * ✔ Final methods cannot be overridden.
 * 
 * ✔ Abstract methods must be overridden.
 * 
 * ✔ Abstract + Final = Illegal.
 * 
 * ✔ Abstract + Static = Illegal.
 * 
 * =========================================================
 */