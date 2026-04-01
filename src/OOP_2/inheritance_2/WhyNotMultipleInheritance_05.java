package OOP_2.inheritance_2;

public class WhyNotMultipleInheritance_05 {
    public static void main(String[] args) {

        /*
            Creating object
        */
        C obj = new C();

        /*
            Calling method
        */
        obj.show();
    }
}

/*
    Interface A
*/
interface A {
    void show();
}

/*
    Interface B
*/
interface B {
    void show();
}

/*
    Class implementing both interfaces
*/
class C implements A, B {

    /*
        Must override show() to resolve ambiguity
    */
    public void show() {
        System.out.println("Class C resolves ambiguity");
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    . What is Multiple Inheritance?

       Multiple inheritance means a class inherits
       from more than one parent class.

       Example (NOT allowed in Java):
       class C extends A, B   ❌


    . Why Java does NOT support it?

       Due to "Diamond Problem"


    1. Diamond Problem:

            A
           / \
          B   C
           \ /
            D

       If both B and C have same method:

           void show()

       Then D gets confused:
       Which show() to call?


    2. With Classes (NOT allowed):

       class A {
           void show() { }
       }

       class B {
           void show() { }
       }

       class C extends A, B { }   ❌ Not allowed

       Reason:
       Java cannot decide which show() to call


    3. With Interfaces (Allowed):

       interface A { void show(); }
       interface B { void show(); }

       class C implements A, B {
           public void show() { }
       }

       Here:
       - No ambiguity remains
       - C provides implementation


    4. Key Concept:

       "Child class must override conflicting methods
        when implementing multiple interfaces"


    5. Who decides method?

       - In classes → Java cannot decide ❌
       - In interfaces → Child class decides ✔


    6. Why Java allows interfaces?

       - Interfaces originally had no implementation
       - So no conflict at start
       - Conflict resolved by child class


    7. Important Rule:

       If multiple interfaces have same method,
       implementing class MUST override it


    8. One-line Revision:

       "In interfaces, ambiguity is resolved by overriding in child class"
*/

//another scenario:

// what If interfaces have default methods:

/*

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}
---->Now again conflict comes
    Java forces:

class C implements A, B {
    public void show() {
        A.super.show();  // or B.super.show()
    }
}
 */