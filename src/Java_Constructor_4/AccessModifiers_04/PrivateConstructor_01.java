// package Java_Constructor_4.AccessModifiers_04;



public class PrivateConstructor_01 {
    public static void main(String[] args) {

        /*
            Cannot create object directly

            Demo obj = new Demo();  ERROR
        */

        /*
            Accessing via static method
        */
        Demo.showMessage();
    }
}

/*
    Class demonstrating private constructor
*/
class Demo {

    // private constructor
    private Demo() {
        System.out.println("Private Constructor");
    }

    // static method to access class
    static void showMessage() {
        System.out.println("Object creation restricted");
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Private Constructor?

       A constructor declared as private
       cannot be accessed outside the class


    2. Key Feature:

       Prevents object creation from outside


    3. Example Understanding:

       Demo obj = new Demo();  not allowed


    4. How to use class then?

       Use static methods or factory methods


    5. Use Cases:

       - Singleton design pattern
       - Utility classes


    6. Important Point:

       Object can only be created inside same class


    7. Concept:

       Restrict object creation


    8. One-line Revision:

       "Private constructor = restrict object creation"
*/
