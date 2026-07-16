
abstract class Animal {

    // Abstract Method
    abstract void makeSound();

    // Concrete Methods
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Bark Bark");
    }
}

public class ConcreteMethods_03 {

    public static void main(String[] args) {

        System.out.println("========== Concrete Methods in Abstract Class ==========\n");

        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.makeSound();

    }
}

/*
 * =========================================================
 * CONCRETE METHODS IN ABSTRACT CLASSES
 * =========================================================
 * 
 * What is a Concrete Method?
 * ---------------------------------------------------------
 * 
 * A Concrete Method is a method that has a complete implementation
 * (method body).
 * 
 * Example
 * 
 * void eat() {
 * System.out.println("Animal is eating.");
 * }
 * 
 * Unlike an Abstract Method, Java already knows how this method works.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * A Concrete Method is a fully implemented method that can be inherited
 * and used directly by child classes.
 * 
 * ---------------------------------------------------------
 * 
 * Why are Concrete Methods allowed in an Abstract Class?
 * ---------------------------------------------------------
 * 
 * Many beginners think:
 * 
 * "If an Abstract Class is incomplete, why does it contain complete methods?"
 * 
 * The answer is simple.
 * 
 * An Abstract Class is created to store:
 * 
 * ✔ Common behaviour (Concrete Methods)
 * 
 * ✔ Child-specific behaviour (Abstract Methods)
 * 
 * This avoids writing the same code repeatedly.
 * 
 * ---------------------------------------------------------
 * 
 * Real-Life Example
 * ---------------------------------------------------------
 * 
 * Consider every animal.
 * 
 * All animals
 * 
 * ✔ Eat
 * ✔ Sleep
 * 
 * But every animal has a different sound.
 * 
 * Dog -> Bark
 * Cat -> Meow
 * Lion -> Roar
 * 
 * So,
 * 
 * eat() and sleep() are Concrete Methods because they are common.
 * 
 * makeSound() is Abstract because every animal sounds different.
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
 * System.out.println("Animal is eating.");
 * }
 * 
 * void sleep() {
 * System.out.println("Animal is sleeping.");
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
 * WHAT?
 * Defines a behaviour without implementation.
 * 
 * WHY?
 * Every animal has its own sound.
 * 
 * WHO implements it?
 * Concrete child classes.
 * 
 * ---------------------------------------------------------
 * 
 * void eat()
 * 
 * WHAT?
 * A Concrete Method.
 * 
 * WHY?
 * Every animal eats in almost the same logical way, so one implementation
 * can be shared.
 * 
 * ---------------------------------------------------------
 * 
 * void sleep()
 * 
 * Another Concrete Method shared by all child classes.
 * 
 * ---------------------------------------------------------
 * 
 * class Dog extends Animal
 * 
 * Dog inherits
 * 
 * ✔ eat()
 * 
 * ✔ sleep()
 * 
 * and implements
 * 
 * ✔ makeSound()
 * 
 * ---------------------------------------------------------
 * 
 * dog.eat();
 * 
 * Calls the inherited Concrete Method.
 * 
 * Output
 * 
 * Animal is eating.
 * 
 * ---------------------------------------------------------
 * 
 * dog.sleep();
 * 
 * Calls another inherited Concrete Method.
 * 
 * Output
 * 
 * Animal is sleeping.
 * 
 * ---------------------------------------------------------
 * 
 * dog.makeSound();
 * 
 * Calls Dog's own implementation.
 * 
 * Output
 * 
 * Dog says: Bark Bark
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Animal (Abstract Class)
 * -----------------------
 * eat()
 * sleep()
 * makeSound() (Abstract)
 * ▲
 * │
 * extends
 * │
 * Dog (Concrete Class)
 * -----------------------
 * makeSound()
 * 
 * Stack Memory Heap Memory
 * 
 * dog ---------------------> Dog Object
 * 
 * The Dog object inherits eat() and sleep() while providing its own
 * implementation of makeSound().
 * 
 * ---------------------------------------------------------
 * 
 * Why not make every method Abstract?
 * ---------------------------------------------------------
 * 
 * Imagine 100 animal classes.
 * 
 * If eat() were abstract,
 * 
 * every class would need to write:
 * 
 * void eat() {
 * System.out.println("Animal is eating.");
 * }
 * 
 * again and again.
 * 
 * This creates duplicate code.
 * 
 * Instead,
 * 
 * Java allows Concrete Methods inside Abstract Classes so all child
 * classes can reuse common logic.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Reduces duplicate code.
 * 
 * ✔ Encourages code reuse.
 * 
 * ✔ Makes maintenance easier.
 * 
 * ✔ Combines shared and specialized behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking an Abstract Class can contain only Abstract Methods.
 * 
 * Reality:
 * It can contain both Abstract and Concrete Methods.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Overriding Concrete Methods unnecessarily.
 * 
 * If the inherited implementation already satisfies the requirement,
 * there is no need to override it.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. Can an Abstract Class contain Concrete Methods?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Why do we use Concrete Methods in an Abstract Class?
 * 
 * To provide common functionality that all child classes can reuse.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Can a child class override a Concrete Method?
 * 
 * Yes. It behaves like any normal inherited method.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. What is the difference between an Abstract Method and a Concrete Method?
 * 
 * Abstract Method:
 * • No body.
 * • Must be implemented by child classes.
 * 
 * Concrete Method:
 * • Has a body.
 * • Can be used directly by child classes.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Is it mandatory to override Concrete Methods?
 * 
 * No. Override them only when different behaviour is needed.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Concrete Method = Method with implementation.
 * 
 * ✔ Abstract Class can contain both Abstract and Concrete Methods.
 * 
 * ✔ Concrete Methods provide common functionality.
 * 
 * ✔ Child classes inherit them automatically.
 * 
 * ✔ Child classes may override them if required.
 * 
 * ---------------------------------------------------------
 * 
 * Preview of Next File
 * 
 * ConstructorsInAbstractClass_04.java
 * 
 * You'll learn something surprising:
 * 
 * ✔ Can an Abstract Class have a constructor?
 * ✔ If we cannot create its object, why does it need a constructor?
 * ✔ When is an Abstract Class constructor executed?
 * 
 * This is one of the most frequently asked Java interview questions.
 * 
 * =========================================================
 */