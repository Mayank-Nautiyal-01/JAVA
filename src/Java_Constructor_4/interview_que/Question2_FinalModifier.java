// package Java_Constructor_4.interview_que;

public class Question2_FinalModifier {

    // A normal, valid constructor
    public Question2_FinalModifier() {
        System.out.println("Constructor of Parent class executed.");
    }

    // COMPILE-TIME ERROR EXAMPLE:
    // If you uncomment the code below, it will fail to compile with:
    // "modifier final not allowed here"
    /*
     * public final Question2_FinalModifier(int dummy) {
     * System.out.println("Final constructor is not allowed!");
     * }
     */

    public static void main(String[] args) {
        System.out.println("--- Question 2: Why can a constructor not be final? ---");
        new Question2_FinalModifier();
    }
}

// Subclass demonstrating that child classes DO NOT inherit parent constructors
class ChildClass extends Question2_FinalModifier {
    public ChildClass() {
        super(); // Invokes the parent constructor, but does NOT override it.
        System.out.println("Constructor of Child class executed.");
    }
}

/*
 * 
 * 1. THE PURPOSE OF 'final':
 * In Java, when a METHOD is marked as 'final', it means that subclasses are
 * prevented from
 * OVERRIDING it.
 * 
 * 2. NO OVERRIDING FOR CONSTRUCTORS:
 * Overriding is a concept that only applies to members (methods) that are
 * inherited by a subclass.
 * Constructors in Java are NOT inherited. Subclasses write their own
 * constructors and can invoke
 * the parent constructor using the 'super()' keyword, but they do not override
 * them.
 * 
 * 3. REDUNDANCY PREVENTED:
 * Since you cannot inherit a constructor, you cannot override it. Because
 * overriding is already
 * impossible, marking a constructor as 'final' is logically redundant. The Java
 * compiler explicitly
 * disallows this modifier on constructors to prevent developers from making
 * conceptual design mistakes.
 */
