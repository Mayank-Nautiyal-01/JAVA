package OOP_2.inheritance_2;

public class SingleInheritance_01 {
    public static void main(String[] args) {
        // Creating object of child class
        Developer d1=new Developer();

        //Accessing parent class properties
        d1.name="Mayank";
        d1.company="xyz";
        // calling parent method
        d1.work();
        //calling childmethod
        d1.code();
    }
}
// parent class
 class EmployeeSI{
    String name;
    String company;

    void work(){
        System.out.println(name+" is working at "+ company);
    }
}

//child class

class Developer extends EmployeeSI{
    void code(){
        System.out.println(name+" is writing code");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Single Inheritance?

       Single inheritance means one child class inherits
       from one parent class.

       Example:
       Developer extends EmployeeSI


    2. What gets inherited?

       - Variables → name, company
       - Methods → work()


    3. Real-World Mapping:

       Employee → general role
       Developer → specific role

       Developer "is-a" Employee


    4. Code Reusability:

       Developer uses work() without rewriting it


    5. Key Concept:

       "Child class can directly use parent class members"


    6. One-line Revision:

       "Single inheritance = one parent, one child"
*/