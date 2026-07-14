// package Java_Constructor_4.ConstructorConcepts_03;


public class SuperConstructor_04 {
    public static void main(String[] args) {

        /*
            Creating child object
        */
        Dog obj = new Dog();
    }
}

/*
    Parent class
*/
class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

/*
    Child class
*/
class Dog extends Animal {

    Dog() {
        super();  // calls parent constructor
        System.out.println("Dog Constructor");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is super()?

       super() is used to call
       parent class constructor


    2. Key Feature:

       It initializes parent part of object


    3. Default Behavior:

       super() is automatically called
       if not written


    4. Example Understanding:

       new Dog()

       → calls Animal()
       → then Dog()


    5. Output:

       Animal Constructor
       Dog Constructor


    6. Important Rule:

       super() must be FIRST statement


    7. Why use super()?

       - To initialize parent data
       - To reuse parent constructor


    8. One-line Revision:

       "super() calls parent constructor"
*/
