
//  Abstract Class 

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    abstract void makeSound();
}

// ---------------------- Interface ----------------------

interface Pet {

    void play();
}

// ---------------------- Concrete Class ----------------------

class Dog extends Animal implements Pet {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Bark Bark");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }
}

public class AbstractVsInterface_08 {

    public static void main(String[] args) {

        System.out.println("========== Abstract Class vs Interface ==========\n");

        Dog dog = new Dog("Bruno");

        dog.eat();
        dog.makeSound();
        dog.play();

    }
}

/*
 * =========================================================
 * ABSTRACT CLASS vs INTERFACE
 * =========================================================
 * 
 * What is an Abstract Class?
 * ---------------------------------------------------------
 * 
 * An Abstract Class is a partially implemented class.
 * 
 * It can contain
 * 
 * ✔ Variables
 * 
 * ✔ Constructors
 * 
 * ✔ Concrete Methods
 * 
 * ✔ Abstract Methods
 * 
 * It is mainly used when related classes share common state and
 * behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * What is an Interface?
 * ---------------------------------------------------------
 * 
 * An Interface defines a contract.
 * 
 * It specifies WHAT a class must do but not HOW it should do it.
 * 
 * A class implements an interface and provides the implementation.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * ---------------------------------------------------------
 * 
 * Abstract Class
 * 
 * → Used for sharing common code.
 * 
 * Interface
 * 
 * → Used for defining common capability (contract).
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * abstract class Animal {
 * 
 * String name;
 * 
 * Animal(String name) {
 * 
 * this.name = name;
 * 
 * }
 * 
 * void eat() {
 * 
 * System.out.println(name + " is eating.");
 * 
 * }
 * 
 * abstract void makeSound();
 * 
 * }
 * 
 * interface Pet {
 * 
 * void play();
 * 
 * }
 * 
 * class Dog extends Animal implements Pet {
 * 
 * ...
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
 * Stores common data (name).
 * 
 * Provides common behaviour (eat()).
 * 
 * Forces child classes to implement makeSound().
 * 
 * ---------------------------------------------------------
 * 
 * interface Pet
 * 
 * Defines one capability:
 * 
 * play()
 * 
 * Every Pet must provide its own implementation.
 * 
 * ---------------------------------------------------------
 * 
 * class Dog extends Animal implements Pet
 * 
 * Dog
 * 
 * ↓
 * 
 * inherits Animal
 * 
 * ↓
 * 
 * implements Pet
 * 
 * Therefore Dog gets
 * 
 * ✔ name
 * 
 * ✔ eat()
 * 
 * and must implement
 * 
 * ✔ makeSound()
 * 
 * ✔ play()
 * 
 * ---------------------------------------------------------
 * 
 * Difference Between extends and implements
 * ---------------------------------------------------------
 * 
 * extends
 * 
 * ↓
 * 
 * Used with classes.
 * 
 * Example
 * 
 * class Dog extends Animal
 * 
 * ---------------------------------------------------------
 * 
 * implements
 * 
 * ↓
 * 
 * Used with interfaces.
 * 
 * Example
 * 
 * class Dog implements Pet
 * 
 * ---------------------------------------------------------
 * 
 * Comparison Table
 * ---------------------------------------------------------
 * 
 * Feature Abstract Class Interface
 * 
 * Object Creation ✘ No ✘ No
 * 
 * Constructor ✔ Yes ✘ No
 * 
 * Variables ✔ Yes Constants only*
 * 
 * Instance Variables ✔ Yes ✘ No
 * 
 * Concrete Methods ✔ Yes ✔ Yes**
 * 
 * Abstract Methods ✔ Yes ✔ Yes
 * 
 * Inheritance Single Multiple
 * 
 * Keyword extends implements
 * 
 * Purpose Shared Code Contract
 * 
 * ---------------------------------------------------------
 * 
 * Variables declared in an interface are implicitly
 * public static final (constants).
 ** 
 * Since Java 8, interfaces can also contain default and static
 * methods. We will study interfaces in detail later.
 * 
 * ---------------------------------------------------------
 * 
 * Why not use only Abstract Classes?
 * ---------------------------------------------------------
 * 
 * Java supports only Single Class Inheritance.
 * 
 * Example
 * 
 * class Dog extends Animal
 * 
 * Dog already extends Animal.
 * 
 * Now suppose Dog also needs
 * 
 * Pet
 * 
 * Robot
 * 
 * GPS
 * 
 * This is impossible using classes.
 * 
 * Interfaces solve this problem because a class can implement
 * multiple interfaces.
 * 
 * ---------------------------------------------------------
 * 
 * Example
 * 
 * class Dog extends Animal
 * implements Pet, Friendly, Trainable
 * 
 * This is allowed.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Memory
 * 
 * dog
 * |
 * |
 * ▼
 * 
 * Heap Memory
 * 
 * +----------------------------------+
 * | Dog Object |
 * |----------------------------------|
 * | Animal Part |
 * | name = "Bruno" |
 * |----------------------------------|
 * | Dog Part |
 * +----------------------------------+
 * 
 * Pet is an interface.
 * 
 * It does not create an object.
 * 
 * It only defines behaviour that Dog must implement.
 * 
 * ---------------------------------------------------------
 * 
 * When should we use an Abstract Class?
 * ---------------------------------------------------------
 * 
 * Use an Abstract Class when
 * 
 * ✔ Classes share variables.
 * 
 * ✔ Classes share constructors.
 * 
 * ✔ Classes share common implementation.
 * 
 * ---------------------------------------------------------
 * 
 * When should we use an Interface?
 * ---------------------------------------------------------
 * 
 * Use an Interface when
 * 
 * ✔ Unrelated classes need the same capability.
 * 
 * ✔ Multiple inheritance of behaviour is required.
 * 
 * ✔ You want to define a contract.
 * 
 * ---------------------------------------------------------
 * 
 * Real-World Example
 * ---------------------------------------------------------
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
 * They all inherit common behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * Pet
 * 
 * ↓
 * 
 * Dog
 * 
 * Cat
 * 
 * Rabbit
 * 
 * Being a Pet is a capability.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * Abstract Class
 * 
 * ✔ Code reuse
 * 
 * ✔ Shared state
 * 
 * ✔ Common implementation
 * 
 * ---------------------------------------------------------
 * 
 * Interface
 * 
 * ✔ Multiple inheritance
 * 
 * ✔ Loose coupling
 * 
 * ✔ Better flexibility
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking Interfaces replace Abstract Classes.
 * 
 * Reality
 * 
 * Both solve different problems.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Using an Abstract Class when only a contract is needed.
 * 
 * Sometimes an Interface is a better choice.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Trap
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can a class extend two Abstract Classes?
 * 
 * Answer
 * 
 * No.
 * 
 * Java allows only one parent class.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can a class implement multiple Interfaces?
 * 
 * Answer
 * 
 * Yes.
 * 
 * Example
 * 
 * class Dog implements Pet, Friendly, Trainable
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can a class extend an Abstract Class and implement an Interface?
 * 
 * Answer
 * 
 * Yes.
 * 
 * This is very common in Java.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. What is the main difference between an Abstract Class and an Interface?
 * 
 * Abstract Class shares implementation.
 * 
 * Interface defines a contract.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Which supports multiple inheritance?
 * 
 * Interface.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Can an Abstract Class have constructors?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. Can an Interface have constructors?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Which one should you use?
 * 
 * Use an Abstract Class for shared state and implementation.
 * 
 * Use an Interface for defining capabilities.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Abstract Class = Shared Implementation
 * 
 * ✔ Interface = Contract
 * 
 * ✔ Abstract Class → extends
 * 
 * ✔ Interface → implements
 * 
 * ✔ One class can extend one class.
 * 
 * ✔ One class can implement multiple interfaces.
 * 
 * =========================================================
 */