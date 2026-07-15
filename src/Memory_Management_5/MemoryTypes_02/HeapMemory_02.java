// package Memory_Management_and_Garbage_Collection_5.MemoryTypes_02;

public class HeapMemory_02 {
    public static void main(String[] args) {
       //creating obj
        Student1 s1=new Student1(20);
        Student1 s2=new Student1(25);

        //reference copy
        Student1 s3=s1;

     //   Modify using one reference

        s3.age=30;

        System.out.println(s1.age);//30

    }
}
// Class representing heap object
class Student1{
    int age;

    Student1(int age){
        this.age=age;
    }
}

/*
    =========================================
    HEAP MEMORY - DEEP UNDERSTANDING
    =========================================

    1. What is Heap Memory?

       Heap memory is used to store:
       - Objects
       - Instance variables


    2. Object Creation:

       Student s1 = new Student(20);

       → Object is created in heap
       → Reference (s1) stored in stack


    3. Multiple Objects:

       Student s1 = new Student(20);
       Student s2 = new Student(25);

       → Two separate objects in heap


    4. Reference Copy (IMPORTANT)

       Student s3 = s1;

       → s3 does NOT create new object
       → s3 points to same object as s1


    5. Shared Object Behavior:

       s3.age = 30;

       → Changes original object

       So:
       s1.age → 30


    6. Visualization:

       STACK                HEAP
       -----                -----------------
       s1  ------------→    Object (age=30)
       s3  ------------→    same object
       s2  ------------→    Object (age=25)


    7. Key Concept:

       "Multiple references can point to same object"


    8. When is object removed?

       When NO reference points to it

       Example:
       s1 = null;
       s3 = null;

       → Object becomes eligible for GC


    9. Important Points:

       - Heap is larger than stack
       - Managed by Garbage Collector
       - Slower than stack


    10. Common Mistake:

       Thinking new reference = new object =wrong

       Correct:
       New reference can point to existing object


    11. One-line Revision:

       "Heap stores objects, and references can share them"
*/
