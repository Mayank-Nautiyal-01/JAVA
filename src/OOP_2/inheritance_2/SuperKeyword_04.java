package OOP_2.inheritance_2;

public class SuperKeyword_04 {
    public static void main(String[] args) {

        /*
            Creating object
        */
        DeveloperSK d1 = new DeveloperSK();

        /*
            Calling method
        */
        d1.showDetails();
    }
}

/*
    Parent class
*/
class EmployeeSK {

    String name = "Employee";

    void display() {
        System.out.println("This is parent class method");
    }
}

/*
    Child class
*/
class DeveloperSK extends EmployeeSK {

    String name = "Developer";

    void showDetails() {

        /*
            Accessing child variable
        */
        System.out.println("Child name: " + name);

        /*
            Accessing parent variable using super
        */
        System.out.println("Parent name: " + super.name);

        /*
            Calling parent method using super
        */
        super.display();
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is super keyword?

       super is a reference variable used to refer
       to the immediate parent class object.


    2. Why use super?

       When parent and child have same variable/method name,
       super helps to access parent version.


    3. Uses of super:

       (A) Access parent variable
           super.name

       (B) Call parent method
           super.display()

       (C) Call parent constructor (we’ll see later)


    4. Example Understanding:

       Child class has:
       name = "Developer"

       Parent class has:
       name = "Employee"

       super.name → accesses parent value


    5. Key Concept:

       "super refers to immediate parent class"


    6. Important Note:

       - Used only in child class
       - Cannot be used in static context


    7. One-line Revision:

       "super is used to access parent class members"
*/