// package Java_Methods_3.Intro_1;

public class MethodDeclaration_02 {
    public static void main(String[] args) {

        Demo1 obj = new Demo1();

        /*
            Method with no parameters
        */
        obj.greet();

        /*
            Method with parameters
        */
        obj.add(10, 20);

        /*
            Method with return type
        */
        int result = obj.multiply(5, 4);
        System.out.println("Result: " + result);
    }
}

/*
    Class demonstrating method declaration
*/
class Demo1 {

    // No parameters, no return type
    void greet() {
        System.out.println("Hello, welcome!");
    }

    // Parameters, no return type
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Parameters with return type
    int multiply(int a, int b) {
        return a * b;
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Method Declaration?

       Method declaration defines:
       - return type
       - method name
       - parameters


    2. Syntax:

       returnType methodName(parameters) {
           // body
       }


    3. Components:

       a) Return Type
          - Type of value method returns
          - Example: int, double, void

       b) Method Name
          - Name used to call method

       c) Parameters
          - Inputs given to method


    4. Types based on return:

       void → no return value
       non-void → must return a value


    5. Example Understanding:

       greet() → no input, no return
       add(10,20) → input, no return
       multiply(5,4) → input + return


    6. Important Rule:

       If return type is not void,
       method MUST return a value


    7. Method Execution Flow:

       main() → calls method → method executes → returns value (if any)


    8. One-line Revision:

       "Method declaration defines structure of a method"
*/
