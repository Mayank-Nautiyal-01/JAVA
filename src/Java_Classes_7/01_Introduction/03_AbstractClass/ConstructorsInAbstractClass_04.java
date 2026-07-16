
abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    abstract void makeSound();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor Called");
    }

    @Override
    void makeSound() {
        System.out.println("Dog says: Bark Bark");
    }
}

public class ConstructorsInAbstractClass_04 {

    public static void main(String[] args) {

        System.out.println("========== Constructors in Abstract Class ==========\n");

        Dog dog = new Dog();

        dog.makeSound();

    }
}

/*
 * =========================================================
 * CONSTRUCTORS IN ABSTRACT CLASSES
 * =========================================================
 * 
 * What is a Constructor?
 * ---------------------------------------------------------
 * 
 * A constructor is a special member of a class that is executed
 * automatically whenever an object is created.
 * 
 * Its main purpose is to initialize the object's state.
 * 
 * ---------------------------------------------------------
 * 
 * Can an Abstract Class have a Constructor?
 * ---------------------------------------------------------
 * 
 * YES.
 * 
 * An Abstract Class can have constructors just like a normal class.
 * 
 * Example
 * 
 * abstract class Animal {
 * 
 * Animal() {
 * 
 * }
 * 
 * }
 * 
 * This is completely valid.
 * 
 * ---------------------------------------------------------
 * 
 * Can we create an object of an Abstract Class?
 * ---------------------------------------------------------
 * 
 * No.
 * 
 * Animal a = new Animal();
 * 
 * Compile-Time Error
 * 
 * Reason
 * 
 * Abstract Classes cannot be instantiated directly.
 * 
 * ---------------------------------------------------------
 * 
 * Then why does an Abstract Class need a Constructor?
 * ---------------------------------------------------------
 * 
 * This is the most important question.
 * 
 * Although we cannot create an Animal object directly,
 * 
 * every Dog object contains an Animal part because Dog inherits Animal.
 * 
 * Whenever a Dog object is created,
 * 
 * Java first initializes the Animal portion,
 * 
 * then initializes the Dog portion.
 * 
 * The Animal constructor performs the initialization of the inherited
 * part of the object.
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * abstract class Animal {
 * 
 * Animal() {
 * System.out.println("Animal Constructor Called");
 * }
 * 
 * }
 * 
 * class Dog extends Animal {
 * 
 * Dog() {
 * System.out.println("Dog Constructor Called");
 * }
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * Animal()
 * 
 * Constructor of the Abstract Class.
 * 
 * It cannot create an Animal object directly,
 * 
 * but it initializes the Animal portion of every child object.
 * 
 * ---------------------------------------------------------
 * 
 * Dog()
 * 
 * Constructor of Dog.
 * 
 * After the Animal constructor finishes,
 * 
 * the Dog constructor executes.
 * 
 * ---------------------------------------------------------
 * 
 * Dog dog = new Dog();
 * 
 * Object creation begins.
 * 
 * Even though Dog is created,
 * 
 * the Animal constructor always executes first.
 * 
 * ---------------------------------------------------------
 * 
 * Program Output
 * ---------------------------------------------------------
 * 
 * Animal Constructor Called
 * 
 * Dog Constructor Called
 * 
 * Dog says: Bark Bark
 * 
 * ---------------------------------------------------------
 * 
 * Constructor Execution Flow
 * ---------------------------------------------------------
 * 
 * Dog dog = new Dog();
 * 
 * Step 1
 * 
 * Memory is allocated for the Dog object.
 * 
 * ↓
 * 
 * Step 2
 * 
 * Animal constructor executes.
 * 
 * ↓
 * 
 * Step 3
 * 
 * Dog constructor executes.
 * 
 * ↓
 * 
 * Step 4
 * 
 * Object is fully initialized.
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
 * +--------------------------------------+
 * | Dog Object |
 * |--------------------------------------|
 * | Animal Part |
 * |--------------------------------------|
 * | Dog Part |
 * +--------------------------------------+
 * 
 * Before the Dog constructor runs,
 * 
 * the Animal part of the object must be initialized.
 * 
 * That is why the Animal constructor executes first.
 * 
 * ---------------------------------------------------------
 * 
 * Why does Java do this?
 * ---------------------------------------------------------
 * 
 * Suppose Animal contains:
 * 
 * String name;
 * 
 * int age;
 * 
 * These inherited variables must be initialized before Dog starts
 * initializing its own data.
 * 
 * Otherwise,
 * 
 * the child object would be incomplete.
 * 
 * ---------------------------------------------------------
 * 
 * Important Rules
 * ---------------------------------------------------------
 * 
 * ✔ Abstract Classes can have constructors.
 * 
 * ✔ Constructors cannot be abstract.
 * 
 * ✔ Constructors execute during child object creation.
 * 
 * ✔ Parent constructor always executes before child constructor.
 * 
 * ✔ Constructors are not inherited.
 * 
 * ---------------------------------------------------------
 * 
 * Can we call the Abstract Class constructor directly?
 * ---------------------------------------------------------
 * 
 * No.
 * 
 * Wrong
 * 
 * new Animal();
 * 
 * Correct
 * 
 * new Dog();
 * 
 * The Dog constructor automatically calls the Animal constructor.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Initializes inherited data.
 * 
 * ✔ Ensures parent class is ready before child initialization.
 * 
 * ✔ Supports constructor chaining.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking constructors are useless in Abstract Classes.
 * 
 * Reality:
 * They initialize the inherited part of child objects.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking constructors are inherited.
 * 
 * Reality:
 * Constructors are never inherited.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking the Dog constructor runs first.
 * 
 * Reality:
 * Parent constructor always executes before the child constructor.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. Can an Abstract Class have a constructor?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Can we create an object of an Abstract Class?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Why is the constructor needed?
 * 
 * To initialize the inherited part of child objects.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. Which constructor executes first?
 * 
 * Parent constructor.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Are constructors inherited?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q6. Can a constructor be abstract?
 * 
 * No.
 * 
 * Constructors initialize objects, while abstract methods describe
 * behavior. Their purposes are completely different.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Abstract Classes can have constructors.
 * 
 * ✔ Constructors initialize inherited data.
 * 
 * ✔ Parent constructor executes first.
 * 
 * ✔ Child constructor executes second.
 * 
 * ✔ Constructors are never inherited.
 * 
 * ✔ Constructors cannot be abstract.
 * 
 * =========================================================
 */