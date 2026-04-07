package Memory_Management_and_Garbage_Collection_5.Intro_1;

public class StackVsHeap_02 {
    public static void main(String[] args) {
       //stack variables
        int a=10;
        int b=20;
        //obj creation
         Stud s1=new Stud();
         //reference copy
        Stud s2=s1;
        //removing reference
        s1=null;
        System.out.println("Program running");
    }
}
//Class representing object in heap
//*/
class Stud {
    int age=20;
    Stud(){
        System.out.println("Obj created in heap");
    }
}

/*
    =========================================
    STACK vs HEAP MEMORY
    =========================================

    1. What is Stack Memory?

       Stack stores:
       - Local variables
       - Method calls
       - References (addresses of objects)

       Example:
       int a = 10;   → stored in stack
       Student s1;   → reference stored in stack


    2. What is Heap Memory?

       Heap stores:
       - Objects
       - Instance variables

       Example:
       new Student(); → object stored in heap


    3. Key Difference:

       Stack → stores reference
       Heap  → stores actual object


    4. Example Flow:

       Student s1 = new Student();

       Stack:
       s1 → reference

       Heap:
       Student object (age = 20)


    5. Reference Copy:

       Student s2 = s1;

       → Both s1 and s2 point to same object


    6. Removing Reference:

       s1 = null;

       → Object still exists (s2 pointing)


    7. When object is destroyed?

       When NO reference points to it

       Example:
       s1 = null;
       s2 = null;

       → Eligible for GC


    8. Memory Behavior:

       Stack:
       - Fast
       - Automatic cleanup

       Heap:
       - Slower
       - Managed by GC


    9. Key Concept:

       "Stack holds references, Heap holds objects"


    10. One-line Revision:

       "Stack = variables, Heap = objects"
*/