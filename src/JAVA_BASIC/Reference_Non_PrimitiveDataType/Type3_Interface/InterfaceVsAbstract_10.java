package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type3_Interface;

interface Animall{
    void sound(); //abstract method

    default void sleep(){
        System.out.println("animal sleep");
    }
}

abstract class Vehicle1{
    /*
       Abstract method (no body)
   */
    abstract void start();

    /*
        Concrete method (with body)
    */
    void fuelType(){
        System.out.println("uses petrol or diesel");
    }
}

class Dog3 implements  Animall {
    public void sound(){
        System.out.println("Dog barks");
    }
}

class Bike extends  Vehicle1{
    void start(){
        System.out.println("bike Starts");
    }
}
public class InterfaceVsAbstract_10 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.sound();
        d.sleep();

        //or
//        Animall a=new Dog3();
//        a.sound();
//        a.sleep();

        Bike b=new Bike();
        b.start();
        b.fuelType();

        //or

//        Vehicle1 v=new Bike();
//        v.start();
//        v.fuelType();
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Interface vs Abstract Class

       Interface:
       - Keyword: interface
       - Supports multiple inheritance
       - Methods: abstract + default + static
       - Variables: public static final

       Abstract Class:
       - Keyword: abstract class
       - Supports single inheritance
       - Methods: abstract + concrete
       - Can have instance variables


    2. Syntax Difference:

       interface A { }

       abstract class B { }


    3. Object Creation:

       Animal a = new Dog();     // correct
       Vehicle v = new Car();    // correct

       Animal a = new Animal();  // wrong
       Vehicle v = new Vehicle();// wrong


    4. Inheritance:

       class Test implements A      // interface
       class Test extends B         // abstract class


    5. Key Differences:

       - Interface → full abstraction (mostly)
       - Abstract → partial abstraction

       - Interface → multiple inheritance
       - Abstract → single inheritance


    6. When to use?

       Use Interface:
       - When you define rules
       - Example: Payment system

       Use Abstract Class:
       - When you have shared code
       - Example: Vehicle base class


    7. Real-world thinking:

       Interface → contract (what to do)
       Abstract → base class (what + some how)


    8. Common Mistake:

       class Test extends Animal   //  wrong (interface)

       Correct:
       class Test implements Animal


    9. One-line Revision:

       "Interface = rules, Abstract class = partial implementation"
*/