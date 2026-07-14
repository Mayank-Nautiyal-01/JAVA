// package OOP_2.inheritance_2;

public class MultilevelInheritance_02 {
    public static void main(String[] args) {
       // Creating object of lowest level class
        seniorDeveloper sd=new seniorDeveloper();
        //Accessing properties from top-level parent
        sd.name = "Mayank";
        sd.company = "xyz";

        //Calling methods from all levels
        sd.work();     // from EmployeeML
        sd.code();     // from DeveloperML
        sd.design();   // from SeniorDeveloper
    }
}
// level 1( parent class)
class EmployeeML {
    String name;
    String company;

    void work() {
        System.out.println(name + " works at " + company);
    }
}
//Level 2 (Child of EmployeeML)

class DeveloperML extends  EmployeeML{
    void code(){
        System.out.println(name+" wries code");
    }
}

//Level 3 (Child of DeveloperML)
class seniorDeveloper extends DeveloperML{
    void design(){
        System.out.println(name+" Design system architecture");
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Multilevel Inheritance?

       Multilevel inheritance means a class inherits from a class,
       which itself inherits from another class.

       Example:
       SeniorDeveloper → DeveloperML → EmployeeML


    2. Inheritance Chain:

       EmployeeML (Level 1)
            ↓
       DeveloperML (Level 2)
            ↓
       SeniorDeveloper (Level 3)


    3. What gets inherited?

       SeniorDeveloper gets:
       - work() from EmployeeML
       - code() from DeveloperML
       - its own method design()


    4. Key Concept:

       "Child class inherits properties from all its ancestor classes"


    5. Real-World Mapping:

       Employee → general
       Developer → more specific
       SeniorDeveloper → most specialized


    6. Code Reusability:

       No need to rewrite methods at each level


    7. Important Note:

       Object of lowest class can access all parent methods


    8. One-line Revision:

       "Multilevel inheritance = inheritance chain (parent → child → grandchild)"
*/
