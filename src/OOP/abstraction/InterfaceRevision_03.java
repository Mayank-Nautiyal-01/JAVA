package OOP.abstraction;

public class InterfaceRevision_03 {
    public static void main(String[] args) {
        //using interface reference
        Payment p;
        p=new CreditCard();
        p.pay();

        p=new Upi();
        p.pay();
    }
}

//interface

interface Payment{
    //  Abstract method (by default public & abstract)
    void pay();
}

// Class 1 implementing interface

class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

class Upi implements  Payment{
    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Interface?

       An interface is a blueprint of a class
       that contains only abstract methods (by default).


    2. Key Points:

       - Methods are public & abstract by default
       - Variables are public static final (constants)
       - Cannot create object of interface


    3. Syntax:

       interface A { }
       class B implements A { }


    4. Difference: Abstract Class vs Interface

       Abstract Class:
       - Can have abstract + normal methods
       - Uses 'extends'

       Interface:
       - Only abstract methods (basic level)
       - Uses 'implements'


    5. Why Interface?

       - Achieve full abstraction
       - Support multiple inheritance
       - Define contract


    6. Multiple Inheritance Example:

       class C implements A, B   ✔ allowed


    7. Key Concept:

       "Interface defines what to do, not how to do"


    8. Important Rule:

       Class implementing interface MUST override all methods


    9. One-line Revision:

       "Interface = 100% abstraction + contract"
*/