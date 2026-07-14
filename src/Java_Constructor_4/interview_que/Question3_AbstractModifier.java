// package Java_Constructor_4.interview_que;

public abstract class Question3_AbstractModifier {

    // A concrete method in an abstract class is fine
    public void show() {
        System.out.println("Concrete method inside abstract class.");
    }

    // COMPILE-TIME ERROR EXAMPLE:
    // If you uncomment the code below, it will fail to compile with:
    // "modifier abstract not allowed here"
    /*
     * public abstract Question3_AbstractModifier();
     */

    public static void main(String[] args) {
        System.out.println("--- Question 3: Why can a constructor not be abstract? ---");
        System.out.println(
                "Abstract classes can have concrete constructors, but the constructor itself cannot be abstract!");
    }
}

/*
 * 
 * 
 * 1. OBJECT INSTANTIATION REQUIREMENT:
 * The main purpose of a constructor is to allocate and initialize an instance
 * of a class. It runs
 * actual code during object initialization.
 * An 'abstract' method has no implementation (no method body) and depends on
 * subclasses to provide
 * the body. If a constructor were abstract, it would have no code to run,
 * meaning the object's
 * fields would remain completely uninitialized and instantiation would fail.
 * 
 * 2. INHERITANCE BARRIER:
 * Constructors are not inherited by subclasses. In Java, when a class has an
 * abstract method,
 * the subclass overrides it to supply the implementation. Since constructors
 * cannot be inherited
 * or overridden, a subclass would never be able to implement the abstract
 * constructor of its
 * parent class.
 * 
 * 3. ABSTRACT CLASS VS ABSTRACT CONSTRUCTOR:
 * An abstract class CAN have a normal (concrete) constructor. This constructor
 * is called via
 * 'super()' by the child class constructor to initialize the parent's fields.
 * However, the constructor
 * itself must have a body (must be concrete) and cannot be marked 'abstract'.
 */
