package OOP.abstraction;

public class Intro_00 {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.start();
        Vehicle v2=new Bike();
        v2.start();
    }
}

//ABSTRACT CLASS
abstract class Vehicle{
    //abstract method(no body)
    abstract void start();
}

//child class 1
class Car extends  Vehicle{
    @Override
    void start() {
        System.out.println("car start with key");
    }
}

//child class 2
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike start with kick");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Abstraction?

       Abstraction is the process of hiding implementation details
       and showing only essential functionality to the user.


    2. Key Idea:

       User only knows:
       start()

       But does not know:
       how start() works internally


    3. How to Achieve Abstraction?

       (A) Abstract Class
       (B) Interface


    4. Abstract Class:

       - Declared using 'abstract' keyword
       - Can have abstract and non-abstract methods
       - Cannot be instantiated


    5. Abstract Method:

       - Method without body
       - Must be implemented by child class

       Example:
       abstract void start();


    6. Real-World Example:

       Car/Bike:
       - You just start it
       - You don’t know internal engine process


    7. Key Concept:

       "Hide implementation, show functionality"


    8. Important Note:

       Cannot do:
       Vehicle v = new Vehicle();  wrong


    9. One-line Revision:

       "Abstraction hides internal details and exposes only required features"
*/