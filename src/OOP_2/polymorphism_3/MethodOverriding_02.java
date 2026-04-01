package OOP_2.polymorphism_3;

public class MethodOverriding_02 {
    public static void main(String[] args) {
         DogMo d= new DogMo();

         d.sound();
    }
}
// parent class
class AnimalMO{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

//child class overriding method

class DogMo extends AnimalMO{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Method Overriding?

       Method overriding occurs when a child class
       provides a specific implementation of a method
       that is already defined in the parent class.


    2. Conditions for Overriding:

       - Same method name
       - Same parameters
       - Same return type (or compatible)
       - Inheritance must exist


    3. Example Understanding:

       Parent:
       sound() → "Animal makes sound"

       Child:
       sound() → "Dog barks"

       Child method overrides parent method


    4. @Override Annotation:

       - Optional but recommended
       - Helps detect errors at compile time


    5. Why Overriding?

       - To provide specific behavior
       - To modify parent class functionality


    6. Key Concept:

       "Child class replaces parent method behavior"


    7. Important Note:

       Method call depends on object type (not reference yet)


    8. One-line Revision:

       "Same method, different implementation in child class"
*/