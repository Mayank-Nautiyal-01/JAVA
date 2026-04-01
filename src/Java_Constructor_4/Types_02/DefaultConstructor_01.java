package Java_Constructor_4.Types_02;



public class DefaultConstructor_01 {
    public static void main(String[] args) {


        //    Object creation

        Student1 obj = new Student1();

        System.out.println("Age: " + obj.age);
    }
}

/*
    Class demonstrating default constructor
*/
class Student1 {

    int age;

    /*
        No constructor written by programmer
        Java provides default constructor
    */
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Default Constructor?

       A constructor provided by Java
       automatically if no constructor is written

     -->No constructor written → Java gives one

    2. Key Feature:

       Initializes variables with default values


    3. Default Values:

       int → 0
       double → 0.0
       boolean → false
       object → null


    4. Example Understanding:

       Student1 obj = new Student1();

       → Default constructor is called internally


    5. Important Rule:

       If you create your own constructor,
       default constructor is NOT provided


    6. Purpose:

       Ensures object is created safely


    7. Common Confusion:

       Default constructor ≠ empty constructor written by user


    8. One-line Revision:

       "Default constructor is auto-created by Java"
*/