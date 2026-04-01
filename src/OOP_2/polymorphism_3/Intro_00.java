package OOP_2.polymorphism_3;

public class Intro_00 {
    public static void main(String[] args) {
        // Same method name, different behavior
       Calculator c=new Calculator();
       c.add(10,20);
       c.add(10.3,20.5);
    }
}
// Class demonstrating polymorphism

class Calculator{
    //method 1
    void add(int a,int b){
        System.out.println("sum:"+ (a+b));
    }
    //Method 2 (same name, different parameters)
    void add(double a,double b){
        System.out.println("sum:"+(a+b));
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Polymorphism?

       Polymorphism means "many forms".

       It allows one method or object to behave
       in different ways based on context.


    2. Types of Polymorphism:

       (A) Compile-time Polymorphism
           - Also known as Method Overloading,static polymorphism,early binding
           - Decision made at compile time

       (B) Runtime Polymorphism
           - Also known as Method Overriding,dynamic poly.., dynamic binding
           - Decision made at runtime (JVM)


    3. Example Understanding:

       add(10, 20)        → calls int version
       add(10.5, 20.5)    → calls double version

       Same method name → different behavior


    4. Why Polymorphism?

       - Improves flexibility
       - Makes code reusable
       - Cleaner and more readable


    5. Real-World Example:

       A person behaves differently:
       - As a student
       - As a friend
       - As an employee

       Same person → different roles


    6. Key Concept:

       "One name, multiple behaviors"


    7. One-line Revision:

       "Polymorphism allows a method to perform different tasks"
*/