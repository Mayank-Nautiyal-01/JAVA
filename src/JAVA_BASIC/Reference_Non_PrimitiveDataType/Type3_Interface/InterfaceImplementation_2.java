package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type3_Interface;

interface Animal1{
    void sound();
}
class Lion implements Animal1 {
    public void sound() {
        System.out.println("Lion roars");
    }
}
class Cat implements Animal1{
    public void sound(){
        System.out.println("Cat meows");
    }
}
public class InterfaceImplementation_2 {
    public static void main(String[] args) {
        //using different implementations
        Lion d =new Lion();
        d.sound();

        Cat c=new Cat();
        c.sound();

        //interface reference (imp concept)
        Animal1 a;

        a=new Lion();
        a.sound();

        a=new Cat();
        a.sound();
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Implementation?
       - Interface only declares methods
       - Class must implement them using "implements"

       Example:
       class Dog implements Animal

    2. Rule: Must override all methods
       - If not implemented → compile-time error

       Example:
       class Test implements Animal {
           // void sound();  // missing → ERROR
       }

    3. Method rules:
       - Must be public
       - Same name, return type, parameters

       Wrong Example:
       void sound() { }        // ERROR (not public)

       Correct:
       public void sound() { }

    4. Multiple classes can implement same interface

       Example:
       class Dog implements Animal
       class Cat implements Animal

    5. Interface reference (very important)

       Animal a = new Dog();
       a.sound();

       Animal a = new Cat();
       a.sound();

       Meaning:
       - Reference type = interface
       - Object type = class

    6. Runtime behavior (Polymorphism intro)

       Animal a = new Dog();
       a.sound();  // Dog version

       Animal a = new Cat();
       a.sound();  // Cat version

    7. Key Concept:
       One interface → many implementations

    8. Real-world idea:
       Animal → common rule
       Dog/Cat → different behaviors

    9. One-line Revision:
       "Interface allows multiple implementations of same method"
*/