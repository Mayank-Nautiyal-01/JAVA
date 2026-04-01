package Java_Methods_3.TypesOfMethods_2;

public class SystemDefinedMethod_01 {
    public static void main(String[] args) {

        /*
            System-defined methods (built-in methods)
        */

        /*
            Math class methods
        */
        int max = Math.max(10, 20);
        System.out.println("Max: " + max);

        double sqrt = Math.sqrt(25);
        System.out.println("Square Root: " + sqrt);

        /*
            String methods
        */
        String name = "mayank";

        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Length: " + name.length());

        /*
            System.out.println() is also a method
        */
        System.out.println("This is also a system-defined method");
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What are System-Defined Methods?

       Methods that are already created
       by Java (built-in methods)


    2. Provided by:

       - Java libraries
       - Predefined classes


    3. Examples:

       Math.max(a, b)
       Math.sqrt(x)
       String.length()
       String.toUpperCase()
       System.out.println()


    4. Why use them?

       - Save time
       - No need to write logic
       - Already optimized


    5. Example Understanding:

       Math.max(10, 20) → returns 20
       name.length() → returns string length


    6. Key Concept:

       "Use ready-made methods instead of writing from scratch"


    7. Important Point:

       These methods belong to predefined classes
       like Math, String, System


    8. One-line Revision:

       "System-defined methods = built-in Java methods"
*/