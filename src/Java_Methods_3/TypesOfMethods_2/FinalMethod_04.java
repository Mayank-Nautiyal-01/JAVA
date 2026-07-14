// package Java_Methods_3.TypesOfMethods_2;


public class FinalMethod_04 {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.showMessage();
    }
}

/*
    Parent class with final method
*/
class Parent {

    // final method
    final void showMessage() {
        System.out.println("This is a final method");
    }
}

/*
    Child class
*/
class Child extends Parent {

    /*
        Trying to override final method will cause error

        void showMessage() {
            System.out.println("Overriding not allowed");
        }
    */
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is a Final Method?

       A method declared with 'final'
       cannot be overridden


    2. Key Feature:

       Prevents method overriding


    3. Syntax:

       final returnType methodName() {
           // code
       }


    4. Example Understanding:

       Parent class has final method
       Child class cannot override it


    5. Important Rule:

       final method is inherited
       but NOT overridden


    6. Why use final?

       - Security
       - Prevent modification
       - Fixed behavior


    7. Error Case:

       If child tries to override,
       compile-time error occurs


    8. One-line Revision:

       "Final method = cannot be overridden"
*/
