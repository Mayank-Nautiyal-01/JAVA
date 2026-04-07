package Memory_Management_and_Garbage_Collection_5.References_3;

public class StrongReference_01 {
    public static void main(String[] args) {
        //strong reference
        Student s1=new Student();
        //obj is still reachable
        System.gc();
        System.out.println("Obj is still alive");

        //remove reference
        s1=null;

        //now eligible for gc

        System.gc();
        System.out.println("reference removed");
    }
}

class Student{
    int age=20;
    Student(){
        System.out.println("Obj created");
    }

    @Override
    protected void finalize(){
        System.out.println("Object destroyed");
    }
}
/*
    =========================================
    STRONG REFERENCE - UNDERSTANDING
    =========================================

    1. What is Strong Reference?

       Default type of reference in Java

       Example:
       Student s1 = new Student();


    2. Key Feature:

       As long as strong reference exists,
       object CANNOT be garbage collected


    3. Example Flow:

       Student s1 = new Student();

       → Object created in heap
       → s1 points to it

       System.gc();
       → Object NOT removed (still referenced)


    4. Removing Reference:

       s1 = null;

       → No reference left
       → Object becomes eligible for GC


    5. Important Rule:

       Strong reference prevents GC


    6. Real Meaning:

       "As long as you can reach object,
        JVM will NOT delete it"


    7. Common Mistake:

       Thinking GC removes all objects -wrong

       Correct:
       Only unreachable objects are removed


    8. One-line Revision:

       "Strong reference keeps object alive"
*/