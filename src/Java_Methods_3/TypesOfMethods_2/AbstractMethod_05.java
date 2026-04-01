package Java_Methods_3.TypesOfMethods_2;


public class AbstractMethod_05 {
    public static void main(String[] args) {

        /*
            Cannot create object of abstract class

            Shape obj = new Shape();// ERROR
        */

        Rectangle obj = new Rectangle();

        obj.draw();
    }
}

/*
    Abstract class
*/
abstract class Shape {

    // abstract method (no body)
    abstract void draw();
}

/*
    Child class implementing abstract method
*/
class Rectangle extends Shape {

    // implementation of abstract method
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is an Abstract Method?

       A method declared without body
       (no implementation)


    2. Key Feature:

       Must be implemented by child class


    3. Syntax:

       abstract returnType methodName();


    4. Important Rules:

       - Must be inside abstract class
       - Child class MUST override it


    5. Example Understanding:

       Shape → abstract class
       draw() → abstract method
       Rectangle → provides implementation


    6. Important Point:

       Cannot create object of abstract class


    7. Why use abstract?

       - To define structure
       - Force child classes to implement


    8. One-line Revision:

       "Abstract method = method without body, must be overridden"
*/