// package Java_Methods_3.Intro_1;

public class WhatIsMethod_01 {
    public static void main(String[] args) {

        Demo obj = new Demo();

        /*
            Calling method multiple times
        */
        obj.greet();
        obj.greet();

        /*
            Calling another method
        */
        obj.sayHello("Mayank");
    }
}

/*
    Class demonstrating what a method is
*/
class Demo {

    // Simple method
    void greet() {
        System.out.println("Welcome to Java Methods!");
    }

    // Method with parameter
    void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is a Method?

       A method is a block of code
       that performs a specific task
       and runs when it is called.


    2. Why use Methods?

       - Code reuse
       - Cleaner code
       - Avoid repetition


    3. Method Call:

       obj.greet();

       → Method runs only when called


    4. Example Understanding:

       greet() → prints message
       sayHello("Mayank") → prints name


    5. Key Concept:

       "Write once, use many times"


    6. Real Meaning:

       Method = reusable functionality


    7. Flow:

       main() → calls method → method executes


    8. One-line Revision:

       "Method is a reusable block of code"
*/
