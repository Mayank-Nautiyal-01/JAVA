// package Java_Constructor_4.ConstructorConcepts_03;


public class ConstructorChaining_03 {
    public static void main(String[] args) {

        /*
            Calling constructor with parameters
        */
        Student6 obj = new Student6(20, "Mayank");
    }
}

/*
    Class demonstrating constructor chaining
*/
class Student6 {

    int age;
    String name;

    // default constructor
    Student6() {
        System.out.println("Default Constructor");
    }

    // one parameter constructor
    Student6(int age) {
        this();  // calls default constructor
        this.age = age;
        System.out.println("One Parameter Constructor");
    }

    // two parameter constructor
    Student6(int age, String name) {
        this(age);  // calls one parameter constructor
        this.name = name;
        System.out.println("Two Parameter Constructor");
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Constructor Chaining?

       Calling one constructor from another
       within the same class


    2. Key Keyword:

       this()


    3. Flow in this example:

       new Student6(20, "Mayank")

       → calls Student6(int, String)
       → calls Student6(int)
       → calls Student6()


    4. Output Order:

       Default Constructor
       One Parameter Constructor
       Two Parameter Constructor


    5. Important Rule:

       this() must be FIRST statement


    6. Why use?

       - Avoid code duplication
       - Reuse constructor logic


    7. Concept:

       Constructors call each other in chain


    8. One-line Revision:

       "Constructor chaining = calling constructor using this()"
*/
