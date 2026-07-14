// package Java_Constructor_4.ConstructorConcepts_03;


public class ConstructorOverloading_01 {
    public static void main(String[] args) {

        /*
            Calling different constructors
        */
        Student4 obj1 = new Student4();
        Student4 obj2 = new Student4(20);
        Student4 obj3 = new Student4(25, "Mayank");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}

/*
    Class demonstrating constructor overloading
*/
class Student4 {

    int age;
    String name;

    // default constructor
    Student4() {
        age = 18;
        name = "Unknown";
    }

    // one parameter constructor
    Student4(int age) {
        this.age = age;
        this.name = "Unknown";
    }

    // two parameter constructor
    Student4(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Constructor Overloading?

       Multiple constructors with same name
       but different parameters in same class


    2. Rules:

       Must differ in:
       - Number of parameters
       - Type of parameters
       - Order of parameters


    3. Example Understanding:

       Student4()
       Student4(int age)
       Student4(int age, String name)


    4. Key Concept:

       Same class, multiple ways to create object


    5. Why use?

       - Flexibility
       - Different initialization options


    6. Important Point:

       Constructor name is always class name


    7. Relation:

       Same concept as method overloading


    8. One-line Revision:

       "Constructor overloading = multiple constructors with different parameters"
*/
