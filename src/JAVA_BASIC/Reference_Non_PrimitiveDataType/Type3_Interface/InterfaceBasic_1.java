package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type3_Interface;

interface Animal {
    void sound();   // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceBasic_1 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

        Animal a = new Dog();
        a.sound();
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Interface Definition:
       - Interface is a blueprint of a class
       - It contains only method declarations

       Example:
       interface Animal {
           void sound();
       }

    2. Interface methods:
       - By default: public + abstract

       Example (same meaning):
       void sound();
       public abstract void sound();

    3. Cannot create object of interface:

       Example:
       Animal a = new Animal(); // ERROR

    4. Interface needs a class to use it:

       Example:
       class Dog implements Animal {
           public void sound() {
               System.out.println("Dog barks");
           }
       }

    5. Calling methods:

       (A) Using class object:
           Dog d = new Dog();
           d.sound();

       (B) Using interface reference:
           Animal a = new Dog();
           a.sound();

    6. Key Concept:
       - Interface → rule
       - Class → implementation

    7. Common Mistake:

       interface Test {
           void show() {
               System.out.println("Hello"); // ERROR
           }
       }

    8. One-line Revision:
       "Interface defines WHAT, class defines HOW"
*/