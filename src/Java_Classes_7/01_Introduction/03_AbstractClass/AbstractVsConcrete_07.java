
// ------------------- Abstract Class 
abstract class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }

    abstract void makeSound();
}

// ------------------- Concrete Class -------------------
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Bark Bark");
    }
}

public class AbstractVsConcrete_07 {

    public static void main(String[] args) {

        System.out.println("========== Abstract Class vs Concrete Class ==========\n");

        // Animal animal = new Animal(); // Compile-Time Error

        Dog dog = new Dog();

        dog.eat();
        dog.makeSound();

    }
}

/*
 * =========================================================
 * ABSTRACT CLASS vs CONCRETE CLASS
 * =========================================================
 * 
 * What is an Abstract Class?
 * ---------------------------------------------------------
 * 
 * An Abstract Class is declared using the 'abstract' keyword.
 * 
 * It cannot be instantiated directly and is mainly used as a parent
 * class.
 * 
 * Example
 * 
 * abstract class Animal {
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * What is a Concrete Class?
 * ---------------------------------------------------------
 * 
 * A Concrete Class is a normal class.
 * 
 * Its objects can be created directly using the 'new' keyword.
 * 
 * Example
 * 
 * class Dog {
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * abstract class Animal {
 * 
 * void eat() {
 * System.out.println("Animal is eating.");
 * }
 * 
 * abstract void makeSound();
 * 
 * }
 * 
 * class Dog extends Animal {
 * 
 * @Override
 * void makeSound() {
 * System.out.println("Dog says: Bark Bark");
 * }
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
 * Acts as the parent class.
 * 
 * It provides
 * 
 * ✔ Common behaviour (eat())
 * 
 * ✔ Required behaviour (makeSound())
 * 
 * No object of Animal can be created.
 * 
 * ---------------------------------------------------------
 * 
 * class Dog
 * 
 * A Concrete Class.
 * 
 * It provides the implementation of makeSound() and therefore objects
 * can be created.
 * 
 * ---------------------------------------------------------
 * 
 * Dog dog = new Dog();
 * 
 * Creates a Dog object.
 * 
 * This is allowed because Dog is a Concrete Class.
 * 
 * ---------------------------------------------------------
 * 
 * Animal animal = new Animal();
 * 
 * Compile-Time Error.
 * 
 * Reason
 * 
 * Animal is abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Comparison Table
 * ---------------------------------------------------------
 * 
 * Feature Abstract Concrete
 * 
 * Object Creation ✘ No ✔ Yes
 * 
 * Constructor ✔ Yes ✔ Yes
 * 
 * Variables ✔ Yes ✔ Yes
 * 
 * Concrete Methods ✔ Yes ✔ Yes
 * 
 * Abstract Methods ✔ Yes ✘ No*
 * 
 * Keyword abstract None
 * 
 * Purpose Base Class Actual Object
 * 
 * (*A Concrete Class cannot contain abstract methods because it must
 * provide complete implementation.)
 * 
 * ---------------------------------------------------------
 * 
 * When should we use an Abstract Class?
 * ---------------------------------------------------------
 * 
 * Use an Abstract Class when:
 * 
 * ✔ Child classes share common data.
 * 
 * ✔ Child classes share common methods.
 * 
 * ✔ Some behaviour must be implemented differently.
 * 
 * Example
 * 
 * Animal
 * 
 * ↓
 * 
 * Dog
 * 
 * Cat
 * 
 * Lion
 * 
 * ---------------------------------------------------------
 * 
 * When should we use a Concrete Class?
 * ---------------------------------------------------------
 * 
 * Use a Concrete Class when:
 * 
 * ✔ Complete implementation is available.
 * 
 * ✔ Objects need to be created.
 * 
 * ✔ No incomplete behaviour exists.
 * 
 * Example
 * 
 * Dog
 * 
 * Car
 * 
 * Student
 * 
 * Employee
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Memory Heap Memory
 * 
 * dog -----------------------> Dog Object
 * 
 * The Dog object contains the inherited Animal part and the Dog part.
 * 
 * No Animal object exists because Animal is abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages of Abstract Class
 * ---------------------------------------------------------
 * 
 * ✔ Encourages code reuse.
 * 
 * ✔ Provides common functionality.
 * 
 * ✔ Forces child classes to implement important behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages of Concrete Class
 * ---------------------------------------------------------
 * 
 * ✔ Easy to instantiate.
 * 
 * ✔ Fully implemented.
 * 
 * ✔ Ready for direct use.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking every parent class should be abstract.
 * 
 * Reality
 * 
 * Only make a class abstract if it represents an incomplete concept or
 * should not be instantiated directly.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking every class should be concrete.
 * 
 * Reality
 * 
 * Sometimes a common parent class should define shared behaviour without
 * allowing direct object creation.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Trap
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can an Abstract Class contain only Concrete Methods?
 * 
 * Answer
 * 
 * Yes.
 * 
 * Even if it has no Abstract Methods, it can still be declared abstract
 * to prevent direct object creation.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can a Concrete Class contain Abstract Methods?
 * 
 * Answer
 * 
 * No.
 * 
 * If a class contains an Abstract Method, the class itself must also be
 * declared abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. What is the main difference between an Abstract Class and a
 * Concrete Class?
 * 
 * Answer
 * 
 * An Abstract Class cannot be instantiated directly, while a Concrete
 * Class can.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Can an Abstract Class have constructors?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Can a Concrete Class extend an Abstract Class?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. Can an Abstract Class contain Concrete Methods?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Which class creates objects?
 * 
 * Concrete Class.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Abstract Class = Parent Blueprint
 * 
 * ✔ Concrete Class = Actual Working Class
 * 
 * ✔ Abstract Class cannot create objects
 * 
 * ✔ Concrete Class can create objects
 * 
 * ✔ Concrete Class must implement inherited Abstract Methods
 * 
 * =========================================================
 */