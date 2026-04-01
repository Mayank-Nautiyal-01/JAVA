package Java_Methods_3.PolymorphismInMethods_3;

public class MethodOverriding_02 {
    public static void main(String[] args) {

        /*
            Parent reference, Child object
        */
        Animal obj = new Dog();

        obj.sound();   // Runtime decision
    }
}

/*
    Parent class
*/
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

/*
    Child class overriding method
*/
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Method Overriding?

       Redefining a parent class method
       in child class with same signature


    2. Rules of Overriding:

       - Same method name
       - Same parameters
       - Same return type (or compatible)


    3. Key Feature:

       Child class provides its own implementation


    4. Runtime Polymorphism:

       Method call is resolved at runtime
       based on object


    5. Example Understanding:

       Animal obj = new Dog();

       obj.sound() → Dog version runs


    6. Important Concept:

       Reference type ≠ object type

       Reference → Animal
       Object → Dog


    7. Why overriding?

       - To change behavior
       - Dynamic method execution


    8. One-line Revision:

       "Method overriding = runtime polymorphism"
*/