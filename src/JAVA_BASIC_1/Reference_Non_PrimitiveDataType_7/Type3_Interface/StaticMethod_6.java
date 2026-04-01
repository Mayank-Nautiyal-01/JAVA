package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type3_Interface;


interface MathOperations{
       /*
        Static method in interface (Java 8 feature)
        - Belongs to interface
        - Cannot be overridden
    */

    static int add(int a,int b){
        return a+b;
    }
    static int subtraction(int a,int b){
        return a-b;
    }
}

class Calculator implements MathOperations{
    //No need to implements static methods
}
public class StaticMethod_6 {
    public static void main(String[] args) {
          /*
            Calling static methods:
            - Use interface name
            - Not with object
        */

        int sum=MathOperations.add(10,20);
        System.out.println("sum:"+sum);

        int sub=MathOperations.subtraction(2,4);
        System.out.println("subtraction:"+sub);

       /*
            Wrong ways:
        */
        // Calculator c = new Calculator();
        // c.add(10, 20);  //  NOT ALLOWED
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Static Method in Interface?

       - Method with body
       - Belongs to interface, not class

       Syntax:
       static returnType methodName() { }


    2. Example:

       interface A {
           static void show() {
               System.out.println("Hello");
           }
       }


    3. How to call?

       A.show();   //  correct


    4. Cannot use object:

       A a = new A();  //  not allowed
       a.show();       //  not allowed


    5. Cannot be overridden:

       class Test implements A {
           // static methods are NOT inherited
       }


    6. Difference from Default Method:

       default method:
           - can be overridden
           - called using object

       static method:
           - cannot be overridden
           - called using interface name


    7. Key Concept:

       - Utility/helper methods inside interface


    8. Real-world example:

       interface MathUtils {
           static int square(int x) {
               return x * x;
           }
       }


    9. One-line Revision:

       "Static method in interface is called using interface name only"
*/