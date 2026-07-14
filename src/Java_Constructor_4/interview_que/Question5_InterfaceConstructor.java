// package Java_Constructor_4.interview_que;

public class Question5_InterfaceConstructor {

    public static void main(String[] args) {
        System.out.println("--- Question 5: Can we define a constructor in an interface? ---");
        System.out.println(
                "No! Interfaces cannot have constructors because they cannot hold instance state or be instantiated directly.");
    }
}

// COMPILE-TIME ERROR EXAMPLE:
// If you uncomment the constructor inside the interface below, it will fail to
// compile with:
// "<identifier> expected" or "interfaces cannot have constructors"
interface SampleInterface {

    // An interface can have static constants
    int MAX_LIMIT = 100; // Implicitly public static final

    // COMPILE ERROR: interfaces cannot have constructors
    /*
     * public SampleInterface() {
     * System.out.println("Interface constructor not allowed!");
     * }
     */

    void runTask();
}

/*
 * 
 * 
 * 1. NO INSTANTIABLE STATE:
 * A constructor exists to initialize the instance variables (state) of an
 * object. In an interface,
 * all variables are implicitly 'public static final' (compile-time constants).
 * Because interfaces
 * cannot hold any non-static instance state, there is no state for a
 * constructor to initialize.
 * 
 * 2. DIRECT INSTANTIATION FORBIDDEN:
 * Interfaces are pure architectural contracts that define behaviors. You cannot
 * instantiate an
 * interface directly (e.g., 'new SampleInterface()' is invalid). Since direct
 * instantiation is
 * disallowed, a constructor inside an interface would be completely useless and
 * dead code.
 * 
 * 3. CLASS IMPLEMENTATION:
 * Classes that implement the interface will have their own constructors to
 * initialize their own
 * instance states. The interface simply acts as a signature requirement for
 * methods, having no
 * part in the memory allocation or initialization of the implementing class.
 */
