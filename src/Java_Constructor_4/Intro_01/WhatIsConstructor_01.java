// package Java_Constructor_4.Intro_01;

public class WhatIsConstructor_01 {
    public static void main(String[] args) {
        //obj  creation
        Student obj=new Student();
    }
}

class Student{
    //constructor
    Student(){
        System.out.println("Constructor is called");
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is a Constructor?

       A constructor is a special method
       used to initialize objects


    2. Key Feature:

       Automatically called when object is created


    3. Syntax:

       ClassName() {
           // code
       }


    4. Important Rules:

       - Same name as class
       - No return type (not even void)


    5. Example Understanding:

       Student obj = new Student();

       → Constructor runs automatically


    6. Purpose:

       - Initialize variables
       - Set initial values


    7. Key Concept:

       "Constructor runs at object creation"


    8. One-line Revision:

       "Constructor = special method to initialize object"
*/
