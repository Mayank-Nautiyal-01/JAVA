
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(name + " is studying Java.");
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class ConcreteClass_02 {

    public static void main(String[] args) {

        Student s1 = new Student("Mayank", 21);
        Student s2 = new Student("Rahul", 22);

        s1.displayInfo();
        s1.study();

        System.out.println();

        s2.displayInfo();
        s2.study();
    }
}

/*
 * =========================================================
 * CONCRETE CLASS IN JAVA
 * =========================================================
 * 
 * What is a Concrete Class?
 * ---------------------------------------------------------
 * 
 * A Concrete Class is a normal Java class whose objects can be created
 * directly.
 * It provides complete implementation for all its methods.
 * 
 * Simple Definition
 * 
 * A Concrete Class is a fully implemented class that can be instantiated using
 * the 'new' keyword.
 * 
 * ---------------------------------------------------------
 * 
 * Why is it called "Concrete"?
 * ---------------------------------------------------------
 * 
 * The word "Concrete" means complete or fully implemented.
 * 
 * Example:
 * 
 * class Student {
 * 
 * }
 * 
 * This class is complete.
 * Java knows how every method behaves, so objects can be created.
 * 
 * ---------------------------------------------------------
 * 
 * Example
 * 
 * Student s = new Student("Mayank", 21);
 * 
 * Student
 * ↓
 * Concrete Class
 * 
 * s
 * ↓
 * Object Reference
 * 
 * new Student(...)
 * ↓
 * Actual Object
 * 
 * ---------------------------------------------------------
 * 
 * Program Explanation
 * ---------------------------------------------------------
 * 
 * class Student
 * 
 * Defines a Concrete Class.
 * 
 * ---------------------------------------------------------
 * 
 * String name;
 * int age;
 * 
 * Instance variables. Every object gets its own copy.
 * 
 * ---------------------------------------------------------
 * 
 * Student(String name, int age)
 * 
 * Constructor used to initialize object data.
 * 
 * ---------------------------------------------------------
 * 
 * this.name = name;
 * this.age = age;
 * 
 * 'this' refers to the current object's variables.
 * 
 * ---------------------------------------------------------
 * 
 * void study()
 * 
 * Instance method representing the student's behaviour.
 * 
 * ---------------------------------------------------------
 * 
 * displayInfo()
 * 
 * Prints object information.
 * 
 * ---------------------------------------------------------
 * 
 * Student s1 = new Student("Mayank", 21);
 * 
 * Creates an object in Heap Memory and stores its reference in Stack Memory.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Memory Heap Memory
 * 
 * s1 -----------------------> Student Object
 * name = "Mayank"
 * age = 21
 * 
 * s2 -----------------------> Student Object
 * name = "Rahul"
 * age = 22
 * 
 * Each object has its own data, but both are created from the same class.
 * 
 * ---------------------------------------------------------
 * 
 * Characteristics of a Concrete Class
 * ---------------------------------------------------------
 * 
 * ✔ Can create objects.
 * 
 * ✔ Can have constructors.
 * 
 * ✔ Can contain variables.
 * 
 * ✔ Can contain implemented methods.
 * 
 * ✔ Can extend another class.
 * 
 * ✔ Can implement interfaces.
 * 
 * ---------------------------------------------------------
 * 
 * Concrete Class vs Abstract Class
 * ---------------------------------------------------------
 * 
 * Concrete Class
 * 
 * • Object can be created.
 * • All methods are implemented.
 * • Can be used directly.
 * 
 * Abstract Class
 * 
 * • Object cannot be created directly.
 * • May contain abstract methods.
 * • Used as a base class.
 * 
 * We will study Abstract Classes in the next file.
 * 
 * ---------------------------------------------------------
 * 
 * Real-Life Example
 * ---------------------------------------------------------
 * 
 * Blueprint
 * 
 * ↓
 * 
 * Car
 * 
 * ↓
 * 
 * Actual Car
 * 
 * The blueprint is similar to a class.
 * 
 * The manufactured car is like an object.
 * 
 * A Concrete Class is a completed blueprint that is ready to produce real
 * objects.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Easy to use.
 * 
 * ✔ Reusable.
 * 
 * ✔ Supports Object-Oriented Programming.
 * 
 * ✔ Stores data and behaviour together.
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * ---------------------------------------------------------
 * 
 * ✘ Thinking every class is abstract.
 * 
 * Reality:
 * Most classes written in Java are Concrete Classes.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking "Concrete" is a Java keyword.
 * 
 * Reality:
 * Concrete is only a concept. There is no 'concrete' keyword in Java.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1. What is a Concrete Class?
 * 
 * A fully implemented class whose objects can be created.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. Can we create an object of a Concrete Class?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Can a Concrete Class have constructors?
 * 
 * Yes.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. Can a Concrete Class contain methods?
 * 
 * Yes. It can contain any number of implemented methods.
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Is every normal Java class a Concrete Class?
 * 
 * Yes, unless it is declared as abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Concrete Class = Fully Implemented Class
 * 
 * ✔ Objects can be created using 'new'
 * 
 * ✔ Contains variables, constructors and methods
 * 
 * ✔ Most Java classes are Concrete Classes
 * 
 * ✔ Opposite of Abstract Class
 * 
 * =========================================================
 */