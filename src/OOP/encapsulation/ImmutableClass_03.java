package OOP.encapsulation;

public class ImmutableClass_03 {
    public static void main(String[] args) {
        //Creating immutable object
        Stud s1=new Stud("Mayank",90);

        // accessing values
        System.out.println("Name:"+s1.getName());
        System.out.println("Marks:"+s1.getMarks());

       //trying to modify(not possible)
        //s1.name="aman"; //not allowed
        //s1.setName("Aman");// no setter method we used
    }
}
// immutable class
final class Stud{
    private final String name;
    private final int marks;

    //constructor to initialize values
    public Stud(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    // only getters(no setters)
    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Immutable Class?

       An immutable class is a class whose objects cannot be changed
       after they are created.

       Once initialized, data remains constant.


    2. How to Create Immutable Class?

       (A) Make class final
       (B) Make variables private
       (C) Make variables final
       (D) Initialize via constructor
       (E) Provide only getters (no setters)


    3. Why Immutability?

       - Data safety (cannot be modified)
       - Thread-safe (safe in multi-threading)
       - Predictable behavior
       - Used in core Java (e.g., String)


    4. Example Flow:

       Student s1 = new Student("Rahul", 90);

       After this:
       - name cannot be changed
       - marks cannot be changed


    5. Key Difference:

       Normal Class:
       - Data can be modified

       Immutable Class:
       - Data cannot be modified after creation


    6. Real-World Example:

       ATM receipt / ID card:
       - Once created, details do not change


    7. Important Note:

       No setter methods are provided
       → This prevents modification


    8. Key Concept:

       "Object state cannot change after creation"


    9. One-line Revision:

       "Immutable class = read-only object after creation"
*/