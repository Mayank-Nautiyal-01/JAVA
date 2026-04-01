package OOP_2.polymorphism_3;

public class MethodOverloading_01 {
    public static void main(String[] args) {

        Calculator1 calc = new Calculator1();

        /*
            Different number of parameters
        */
        calc.add(10, 20);
        calc.add(10, 20, 30);

        /*
            Different data types
        */
        calc.add(10.5, 20.5);

        /*
            Different parameter order
        */
        calc.add(10, 5.5);
        calc.add(5.5, 10);
    }
}

/*
    Class demonstrating method overloading
*/
class Calculator1 {

    // 2 parameters
    void add(int a, int b) {
        System.out.println("int + int: " + (a + b));
    }

    // 3 parameters
    void add(int a, int b, int c){
        System.out.println("int + int + int: " + (a + b + c));
    }

    // double parameters
    void add(double a, double b) {
        System.out.println("double + double: " + (a + b));
    }

    // int + double
    void add(int a, double b) {
        System.out.println("int + double: " + (a + b));
    }

    // double + int
    void add(double a, int b) {
        System.out.println("double + int: " + (a + b));
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Method Overloading?

       Method overloading means defining multiple methods
       with the same name but different parameters
       in the same class.


    2. Rules of Overloading:

       Methods must differ in:
       - Number of parameters
       - Type of parameters
       - Order of parameters


    3. What is NOT allowed?

       Only changing return type is NOT enough

       Example:
       int add(int a, int b)
       double add(int a, int b)   Error


    4. Compile-time Polymorphism:

       - Method call is resolved at compile time
       - Compiler decides which method to call


    5. Example Understanding:

       add(10, 20)       → int version
       add(10.5, 20.5)   → double version

       Decision is made BEFORE execution


    6. Why Overloading?

       - Improves readability
       - Same method name for similar tasks
       - Avoids confusion of multiple names


    7. Key Concept:

       "Same method name, different parameter list"


    8. One-line Revision:

       "Method overloading = compile-time polymorphism"
*/