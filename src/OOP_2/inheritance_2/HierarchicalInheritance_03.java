// package OOP_2.inheritance_2;

public class HierarchicalInheritance_03 {
    public static void main(String[] args) {
       manager m1=new manager();
       Tester t1=new Tester();

       // Assigning values (parent properties)
        m1.name="mayank";
        m1.company="xyz";

        t1.name="rahul";
        t1.company="xyz";

        //calling parent method

        m1.work();
        t1.work();

        //calling child-specific methods
        m1.manage();
        t1.test();

    }
}

//parent class

class EmployeeHI{
    String name;
    String company;

    void work(){
        System.out.println(name + " works at " + company);
    }
}
//Child class 1
class manager extends EmployeeHI{
    void manage(){
        System.out.println(name + " manages the team");
    }
}
//Child class 2
class Tester extends EmployeeSI{
    void test(){
        System.out.println(name + " tests the software");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Hierarchical Inheritance?

       Hierarchical inheritance means multiple child classes
       inherit from a single parent class.

       Example:
       Manager → EmployeeHI
       Tester  → EmployeeHI


    2. Structure:

            EmployeeHI
            /       \
        Manager    Tester


    3. What gets inherited?

       Both Manager and Tester get:
       - Variables → name, company
       - Method → work()


    4. Key Concept:

       "One parent class is shared by multiple child classes"


    5. Real-World Mapping:

       Employee → base role
       Manager → manages
       Tester → tests


    6. Code Reusability:

       Common code (work()) is written once in parent


    7. Important Note:

       Child classes are independent of each other
       (Manager cannot access Tester methods)


    8. One-line Revision:

       "Hierarchical inheritance = one parent, many children"
*/
