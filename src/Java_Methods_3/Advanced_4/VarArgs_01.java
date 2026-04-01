package Java_Methods_3.Advanced_4;

public class VarArgs_01 {
    public static void main(String[] args) {

        Calculator2 calc = new Calculator2();

        /*
            Passing different number of arguments
        */
        calc.add(10, 20);
        calc.add(10, 20, 30);
        calc.add(10, 20, 30, 40);

        /*
            No argument also allowed
        */
        calc.add();
    }
}

/*
    Class demonstrating variable arguments (varargs)
*/
class Calculator2 {

    // varargs method
    void add(int... numbers) {

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is VarArgs?

       VarArgs (Variable Arguments) allows
       passing any number of arguments
       to a method


    2. Syntax:

       returnType methodName(dataType... varName)


    3. Key Feature:

       Internally treated as array


    4. Example Understanding:

       add(10,20)
       add(10,20,30)
       add(10,20,30,40)

       → all handled by single method


    5. Important Rule:

       Only ONE varargs parameter allowed
       and it must be last parameter


    6. Advantage:

       - Flexible method calls
       - Cleaner code
       - No need for multiple overloaded methods


    7. Behind the Scene:

       int... numbers → int[] numbers


    8. One-line Revision:

       "VarArgs = method with variable number of arguments"
*/
