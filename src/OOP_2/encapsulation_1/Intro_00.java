// package OOP_2.encapsulation_1;

//class with encapsulation applied
class Student{
    // private var (data hiding)
    private String name;
    private int marks;

    //setter methods(to modify data)
    void setName(String name){
        this.name=name;
    }
    void setMarks(int marks){
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
    // getter methods(to access data)
    String getName(){ return name;}

    int getMarks(){ return marks;}

}
public class Intro_00 {
    public static void main(String[] args) {
        // basic idea
       Student s1=new Student();

        // Setting values using methods (controlled access)
        s1.setName("Mayank");
        s1.setMarks(90);

        // getting values using methods
        System.out.println("Name:"+ s1.getName()); // Mayank
        System.out.println("Marks:"+s1.getMarks()); // 90
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Encapsulation?

       Encapsulation is the process of wrapping data (variables)
       and code (methods) into a single unit (class),
       while restricting direct access to the data.

       It is used to protect and control how data is accessed.


    2. Why Encapsulation?

       - To hide sensitive data
       - To prevent unauthorized access
       - To control how data is modified
       - To improve code security and maintainability


    3. How Encapsulation is Achieved?

       (A) Make variables private
       (B) Provide public methods (getters/setters)

       Example:
       private int marks;
       public void setMarks(int marks) { }


    4. Data Hiding:

       - Direct access to variables is restricted
       - Variables cannot be accessed outside the class

       Example:
       s1.marks = 90;   Not allowed (private)


    5. Controlled Access:

       Data is accessed through methods only

       Example:
       s1.setMarks(90);  Allowed

       This allows validation before setting values.


    6. Real-World Example:

       ATM Machine:

       - You cannot directly access your balance
       - You must use methods (withdraw, deposit)

       This is encapsulation.


    7. Advantage of Encapsulation:

       - Data security
       - Flexibility to change implementation
       - Better control over data
       - Cleaner and maintainable code


    8. Key Concept:

       "Hide data using private, allow access using methods"


    9. One-line Revision:

       "Encapsulation = Data Hiding + Controlled Access"
*/
