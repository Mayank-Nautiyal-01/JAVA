// package OOP_2.inheritance_2;

public class Intro_00 {
    public static void main(String[] args) {
        // Creating object of child class
        Dog d1=new Dog();

        //accessing parent class method
        d1.eat();
        //accessing child class method
        d1.bark();

    }
}

//parent class(super class)
class  Animal{

    void eat(){
        System.out.println("Animal is eating");
    }
}

//child class(sub class)

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}




/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Inheritance?

       Inheritance is a mechanism in Java where one class
       acquires the properties and behaviors of another class.

       It helps in code reuse and establishes a relationship
       between classes.


    2. Terminology:

       Parent Class (Super Class):
       - The class whose properties are inherited

       Child Class (Sub Class):
       - The class that inherits from parent


    3. Syntax:

       class Child extends Parent { }


    4. Example:

       class Dog extends Animal

       Dog gets:
       - eat() method from Animal
       - can also define its own methods


    5. Why Inheritance?

       - Code reusability
       - Avoid duplication
       - Logical hierarchy


    6. Real-World Example:

       Animal → general category
       Dog → specific type of animal

       Dog "is-a" Animal


    7. Key Concept (Very Important):

       "Child class can access parent class methods and variables"


    8. What is NOT inherited?

       - Private members are not directly accessible
       - Constructors are not inherited


    9. One-line Revision:

       "Inheritance allows one class to reuse properties of another class"
*/
