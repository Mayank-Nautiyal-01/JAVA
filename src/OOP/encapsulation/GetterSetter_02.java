package OOP.encapsulation;


public class GetterSetter_02 {
    public static void main(String[] args) {

        /*
            Creating object
        */
        Employee emp = new Employee();

        /*
            Setting values using setters
        */
        emp.setName("Rahul");
        emp.setSalary(50000);

        /*
            Getting values using getters
        */
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}

/*
    Class with proper getter-setter conventions
*/
class Employee {

    private String name;
    private int salary;

    /*
        Setter methods
    */
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    /*
        Getter methods
    */
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What are Getter and Setter?

       Getter:
       - Method used to access (read) private data

       Setter:
       - Method used to modify (write/update) private data


    2. Standard Naming Convention:

       Getter → getVariableName()
       Setter → setVariableName()

       Example:
       getName(), setName()


    3. Why follow naming convention?

       - Improves readability
       - Used by frameworks (Spring, Hibernate)
       - Industry standard practice


    4. Access Modifier (Important):

       - Getters/Setters are usually public
       - Variables are private

       This ensures controlled access from outside class


    5. Validation in Setter:

       Setter can include logic:

       if (salary > 0)

       This ensures only valid data is stored


    6. Read-only / Write-only concept:

       - Only Getter → Read-only class
       - Only Setter → Write-only (rare)


    7. Key Concept:

       "Getter reads data, Setter updates data with control"


    8. One-line Revision:

       "Use get() and set() methods to access private variables"
*/