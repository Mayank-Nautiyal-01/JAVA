// package Java_Constructor_4.interview_que;

public class Question6_NameMatching {

    // Constructor name matches the class name exactly
    public Question6_NameMatching() {
        System.out.println("Constructor matched the class name and initialized the object successfully!");
    }

    public static void main(String[] args) {
        System.out.println("--- Question 6: Why is a constructor name the same as the class name? ---");
        new Question6_NameMatching();
    }
}

/*
 * 
 * 
 * 1. PARSING AND COMPILATION EFFICIENCY:
 * The compiler must be able to instantly distinguish between a constructor and
 * a normal method when
 * parsing source code. Enforcing that the constructor has:
 * - The exact same name as the class.
 * - No return type declaration.
 * Allows the compiler to parse code with maximum efficiency, without needing
 * complicated lookup rules.
 * 
 * 2. LOGICAL LINK TO INSTANTIATION:
 * When creating an object using the 'new' keyword, we are allocating memory for
 * that specific class
 * blueprint. Writing:
 * MyClass obj = new MyClass();
 * Syntactically binds the class type ('MyClass') to its initialization
 * execution ('MyClass()').
 * If constructors could be named anything (like 'initialize()'), it would make
 * class instantiation
 * less readable and more error-prone (e.g., writing: new MyClass().initialize()
 * instead of a clean,
 * atomic instantiation step).
 * 
 * 3. PREVENTING DUPLICATION CONFLICTS:
 * By coupling the constructor name directly to the class name, Java ensures
 * that constructors have
 * a unique, protected namespace within the class. You cannot create a method
 * with a different name
 * that behaves as a constructor, eliminating any ambiguity about the entry
 * point of object creation.
 */
