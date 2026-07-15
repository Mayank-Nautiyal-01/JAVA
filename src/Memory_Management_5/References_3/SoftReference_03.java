// package Memory_Management_and_Garbage_Collection_5.References_3;

import java.lang.ref.SoftReference;

public class SoftReference_03 {
    public static void main(String[] args) {
        //Creating object

        Student3 s1=new Student3();
        //creating soft reference

        SoftReference<Student3> softRef=new SoftReference<>(s1);

        //remove strong reference

        s1=null;

        //suggest gc
        System.gc();

        //check obj
        if (softRef.get() != null) {
            System.out.println("Object still alive (soft reference)");
        } else {
            System.out.println("Object garbage collected");
        }
    }
}
/*
    Class representing object
*/
class Student3 {

    int age = 20;

    Student3() {
        System.out.println("Object created");
    }
}

/*
    =========================================
    SOFT REFERENCE - UNDERSTANDING
    =========================================

    1. What is Soft Reference?

       A reference that allows object to stay
       in memory until JVM needs memory


    2. Key Feature:

       Object is NOT immediately removed

       Removed ONLY when memory is low


    3. Example Flow:

       Student s1 = new Student();
       SoftReference<Student> softRef = new SoftReference<>(s1);

       s1 = null;

       → Only soft reference remains

       System.gc();

       → Object usually stays alive


    4. When is object removed?

       Only when JVM needs memory


    5. softRef.get():

       - Returns object if still alive
       - Returns null if GC removed it


    6. Difference from Weak Reference:

       Weak Reference:
       → Removed quickly by GC

       Soft Reference:
       → Removed only when memory is low


    7. Use Cases:

       - Caching
       - Image storage
       - Memory-sensitive applications


    8. Key Concept:

       "Soft reference keeps object until memory pressure"


    9. One-line Revision:

       "Soft reference = survive GC, die only when memory needed"
*/
