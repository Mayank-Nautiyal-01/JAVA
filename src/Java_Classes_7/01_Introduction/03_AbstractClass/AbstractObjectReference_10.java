//optional file 

abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    abstract void makeSound();

    void eat() {
        System.out.println("Animal is eating.");
    }
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

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}

public class AbstractObjectReference_10 {

    public static void main(String[] args) {

        System.out.println("========== Abstract Class Reference ==========\n");

        // Animal animal = new Animal(); // Compile-Time Error

        Animal dog = new Dog();

        System.out.println();

        dog.eat();
        dog.makeSound();

        System.out.println();

        Animal cat = new Cat();

        cat.eat();
        cat.makeSound();

    }
}

/*
 * =========================================================
 * ABSTRACT CLASS OBJECT REFERENCE
 * =========================================================
 * 
 * One of the Biggest Confusions
 * ---------------------------------------------------------
 * 
 * Many beginners think
 * 
 * "If an Abstract Class cannot have objects,
 * 
 * then why does this work?"
 * 
 * Animal animal = new Dog();
 * 
 * This is one of the most important concepts in Java.
 * 
 * ---------------------------------------------------------
 * 
 * What is happening?
 * ---------------------------------------------------------
 * 
 * Look carefully.
 * 
 * Animal animal = new Dog();
 * 
 * There are TWO different things here.
 * 
 * Animal
 * 
 * ↓
 * 
 * Reference Type
 * 
 * Dog()
 * 
 * ↓
 * 
 * Actual Object
 * 
 * ---------------------------------------------------------
 * 
 * Reference vs Object
 * ---------------------------------------------------------
 * 
 * Animal animal = new Dog();
 * 
 * Animal
 * 
 * ↓
 * 
 * Reference Variable
 * 
 * animal
 * 
 * ↓
 * 
 * Variable Name
 * 
 * new Dog()
 * 
 * ↓
 * 
 * Dog Object
 * 
 * The reference type and the object type are NOT required to be the same.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * ---------------------------------------------------------
 * 
 * An Abstract Class cannot create its own object,
 * 
 * but it CAN be used as a reference type for child objects.
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * ---------------------------------------------------------
 * 
 * Animal dog = new Dog();
 * 
 * Animal cat = new Cat();
 * 
 * Both are valid.
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * Animal dog
 * 
 * Reference variable of type Animal.
 * 
 * No object is created here.
 * 
 * ---------------------------------------------------------
 * 
 * new Dog()
 * 
 * Creates a Dog object.
 * 
 * This is allowed because Dog is a Concrete Class.
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
 * dog.makeSound();
 * 
 * Calls Dog's implementation.
 * 
 * Output
 * 
 * Dog says: Bark Bark
 * 
 * ---------------------------------------------------------
 * 
 * Animal cat = new Cat();
 * 
 * Again,
 * 
 * Reference Type
 * 
 * ↓
 * 
 * Animal
 * 
 * Actual Object
 * 
 * ↓
 * 
 * Cat
 * 
 * ---------------------------------------------------------
 * 
 * cat.makeSound();
 * 
 * Calls Cat's implementation.
 * 
 * Output
 * 
 * Cat says: Meow Meow
 * 
 * ---------------------------------------------------------
 * 
 * Why does Java allow this?
 * ---------------------------------------------------------
 * 
 * Every Dog
 * 
 * IS-A
 * 
 * Animal
 * 
 * Every Cat
 * 
 * IS-A
 * 
 * Animal
 * 
 * Therefore,
 * 
 * an Animal reference can point to any child object.
 * 
 * This is called
 * 
 * UPCASTING
 * 
 * We will study it in detail during Polymorphism.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Memory
 * 
 * dog ------------------------+
 * 
 * |
 * 
 * ▼
 * 
 * Dog Object
 * 
 * ------------
 * 
 * Animal Part
 * 
 * ------------
 * 
 * Dog Part
 * 
 * ---------------------------------------------------------
 * 
 * Notice
 * 
 * The reference type is Animal,
 * 
 * but the object in memory is Dog.
 * 
 * ---------------------------------------------------------
 * 
 * What is NOT allowed?
 * ---------------------------------------------------------
 * 
 * Animal animal = new Animal();
 * 
 * Compile-Time Error
 * 
 * Reason
 * 
 * Animal is abstract.
 * 
 * Java cannot create an object of an abstract class.
 * 
 * ---------------------------------------------------------
 * 
 * Another Example
 * ---------------------------------------------------------
 * 
 * Animal a;
 * 
 * This is perfectly valid.
 * 
 * Why?
 * 
 * Because no object is being created.
 * 
 * Only a reference variable is declared.
 * 
 * ---------------------------------------------------------
 * 
 * Can one reference point to different objects?
 * ---------------------------------------------------------
 * 
 * Yes.
 * 
 * Example
 * 
 * Animal animal;
 * 
 * animal = new Dog();
 * 
 * animal = new Cat();
 * 
 * animal = new Dog();
 * 
 * The reference changes,
 * 
 * the object changes,
 * 
 * the reference type remains Animal.
 * 
 * ---------------------------------------------------------
 * 
 * Why is this useful?
 * ---------------------------------------------------------
 * 
 * Suppose a Zoo contains
 * 
 * Dog
 * 
 * Cat
 * 
 * Lion
 * 
 * Tiger
 * 
 * Instead of writing
 * 
 * Dog dog;
 * 
 * Cat cat;
 * 
 * Lion lion;
 * 
 * Tiger tiger;
 * 
 * we can simply write
 * 
 * Animal animal;
 * 
 * and store any animal object.
 * 
 * This makes programs flexible.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Trap
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Is
 * 
 * Animal animal = new Dog();
 * 
 * creating an Animal object?
 * 
 * Answer
 * 
 * No.
 * 
 * It creates a Dog object.
 * 
 * Animal is only the reference type.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can an Abstract Class have reference variables?
 * 
 * Answer
 * 
 * Yes.
 * 
 * It cannot have objects,
 * 
 * but it can definitely be used as a reference type.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Can a reference exist without an object?
 * 
 * Answer
 * 
 * Yes.
 * 
 * Example
 * 
 * Animal animal;
 * 
 * This only declares a reference.
 * 
 * ---------------------------------------------------------
 * 
 * Reference vs Object
 * ---------------------------------------------------------
 * 
 * Reference
 * 
 * Animal animal;
 * 
 * Object
 * 
 * new Dog();
 * 
 * Complete Statement
 * 
 * Animal animal = new Dog();
 * 
 * Reference
 * 
 * ↓
 * 
 * Animal
 * 
 * Object
 * 
 * ↓
 * 
 * Dog
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1.
 * 
 * Can we create an object of an Abstract Class?
 * 
 * No.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Can we create a reference of an Abstract Class?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * What does
 * 
 * Animal a = new Dog();
 * 
 * mean?
 * 
 * Answer
 * 
 * Animal is the reference type.
 * 
 * Dog is the object type.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * What concept is demonstrated here?
 * 
 * Upcasting.
 * 
 * ---------------------------------------------------------
 * 
 * Q5.
 * 
 * Which method executes?
 * 
 * The object's method.
 * 
 * That is why
 * 
 * new Dog()
 * 
 * calls Dog's makeSound()
 * 
 * and
 * 
 * new Cat()
 * 
 * calls Cat's makeSound().
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Abstract Class cannot create objects.
 * 
 * ✔ Abstract Class CAN create references.
 * 
 * ✔ Parent reference can point to child objects.
 * 
 * ✔ Animal a = new Dog() is valid.
 * 
 * ✔ Animal a = new Animal() is invalid.
 * 
 * ✔ This concept is called Upcasting.
 * 
 * ✔ Upcasting is the foundation of Runtime Polymorphism.
 * 
 * =========================================================
 */
