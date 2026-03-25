package OOP.OOP_Intro;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Introduction of oop");
    }
}

/*
=========================
        NOTES
=========================

            1. What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm
that organizes software design around objects rather than functions.

It allows us to model real-world entities by combining:
        - Data (variables)
       - Behavior (methods)

Example:
A Car has properties (brand, color) and actions (drive, stop).

--> sometimes people call it oops
== Then what is “OOPS”?
“OOPS” is not the official term
It’s just an informal way people use (especially in India)

Some expand it as:

Object-Oriented Programming System


        2. What is a Class?

A class is a user-defined blueprint or template used to create objects.

It defines:
        - Attributes (variables)
       - Behaviors (methods)

Syntax:
class ClassName {
    // variables
    // methods
}


    3. What is an Object?

An object is an instance of a class that represents a real-world entity.

It contains:
        - Actual values for variables
       - Ability to call methods

Example:
Car c1 = new Car();


    4. Understanding Object Creation:

Car c1 = new Car();

Breakdown:
        - Car → Class name
       - c1 → Reference variable
       - new → Keyword to allocate memory
       - Car() → Constructor (initializes object)

The object is created in heap memory,
and c1 stores its reference (address).


        5. Real-World Mapping:

Class        → Car (design)
Object       → c1, c2 (actual cars)
Properties   → brand, color
Methods      → showDetails()


    6. Multiple Objects Concept:

        - A single class can create multiple objects
       - Each object has its own separate data

Example:
c1.brand = "Toyota"
c2.brand = "BMW"

This shows independence between objects.


    7. Data + Behavior Together:

OOP combines data and methods into a single unit (object).

Example:
        c1.showDetails()

This improves code organization and readability.


        8. Key Advantages of OOP (Intro Level):

        - Code reusability (reuse classes)
       - Better organization (structured code)
       - Easy maintenance (modular design)
       - Real-world modeling


    9. Key Concept:

        "A class defines structure, and objects use that structure
        to store data and perform actions."


        10. One-line Revision:

        "OOP is a way of programming using classes and objects
        to represent real-world entities."

 */