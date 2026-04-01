package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type3_Interface;


@FunctionalInterface
 interface  Cal{
    /*
        Functional Interface:
        - Must have ONLY ONE abstract method
    */
    int operate(int a, int b);
}
public class FunctionalInterface_8 {
    public static void main(String[] args) {
         /*
            Using Lambda Expression (Java 8 feature)
        */
        Cal add=(a,b)->a+b;
        System.out.println("Addition:"+add.operate(10,5));

        Cal multiply=(a,b)->a*b;
        System.out.println("Multiplication:"+multiply.operate(10,5));
    }

}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Functional Interface?

       - Interface with exactly ONE abstract method

       Example:
       interface A {
           void show();
       }


    2. @FunctionalInterface annotation:

       - Optional but recommended
       - Ensures only one abstract method

       If you add second method → ERROR


    3. Example:

       @FunctionalInterface
       interface Test {
           void run();
       }


    4. Lambda Expression:

       - Shortcut to implement interface

       Syntax:
       (parameters) -> { body }

       Example:
       (a, b) -> a + b


    5. Without Lambda (old way):

       Calculator c = new Calculator() {
           public int operate(int a, int b) {
               return a + b;
           }
       };


    6. Why important?

       - Used in:
         Streams
         Collections
         Multithreading


    7. Rule:

       Only ONE abstract method allowed

       But can have:
       - default methods
       - static methods


    8. Common Mistake:

       interface Test {
           void a();
           void b();   //  not functional
       }


    9. Key Concept:

       "Functional Interface = Single abstract method interface"


    10. One-line Revision:

       "Lambda works only with functional interfaces"
*/