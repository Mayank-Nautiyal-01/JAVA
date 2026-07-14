// package Java_Constructor_4.interview_que;

public class Question4_StaticModifier {

    int instanceCounter;

    // Normal instance constructor
    public Question4_StaticModifier() {
        this.instanceCounter = 1;
        System.out.println("Instance constructor called. Counter initialized to: " + this.instanceCounter);
    }

    // COMPILE-TIME ERROR EXAMPLE:
    // If you uncomment the code below, it will fail to compile with:
    // "modifier static not allowed here"
    /*
     * public static Question4_StaticModifier(int val) {
     * // Static context has no 'this' reference to refer to instance variables!
     * this.instanceCounter = val;
     * }
     */

    public static void main(String[] args) {
        System.out.println("--- Question 4: Why can a constructor not be static? ---");
        new Question4_StaticModifier();
    }
}

/*
 * 
 * 
 * 1. INSTANCE VS CLASS SCOPE:
 * - 'static' members belong to the class itself and are loaded once when the
 * class is loaded.
 * - Constructors are invoked to initialize a specific, newly created object
 * instance.
 * 
 * 2. NO 'this' REFERENCE:
 * A constructor executes within the context of an object instance and uses the
 * 'this' reference
 * internally to write to the instance variables. A static method does not run
 * within the context
 * of an object and has no 'this' reference. If a constructor were static, it
 * would not be able to
 * access any non-static instance fields of the object it is supposed to
 * initialize.
 * 
 * 3. CONFLICT OF LIFECYCLE:
 * A static method can be accessed without creating any objects (using
 * ClassName.methodName()).
 * A constructor is strictly bound to object instantiation using the 'new'
 * keyword. Therefore,
 * making a constructor static is a direct violation of its lifecycle and
 * runtime design.
 */
