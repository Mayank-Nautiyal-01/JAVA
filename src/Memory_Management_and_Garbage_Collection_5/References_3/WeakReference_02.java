package Memory_Management_and_Garbage_Collection_5.References_3;

import java.lang.ref.WeakReference;

public class WeakReference_02 {
    public static void main(String[] args) {
        //created obj
        Student1 s1=new Student1();

        // Creating weak reference

        WeakReference<Student1> weakRef=new WeakReference<>(s1);

        //remove strong reference
        s1=null;

        //suggest gc
        System.gc();

        //check obj
        if(weakRef.get()!=null){
            System.out.println("obj still alive");
        }
        else{
            System.out.println("Object garbage collected");;
        }

    }
}

class Student1{
    int age=20;
    Student1(){
        System.out.println("Object created");
    }
    @Override
    protected void finalize(){
        System.out.println("Object destroyed");
    }
}

/*
    =========================================
    WEAK REFERENCE - UNDERSTANDING
    =========================================

    1. What is Weak Reference?

       A reference that does NOT prevent
       garbage collection


    2. Key Feature:

       Object can be removed by GC
       even if weak reference exists


    3. Example Flow:

       Student s1 = new Student();
       WeakReference<Student> weakRef = new WeakReference<>(s1);

       s1 = null;

       → Only weak reference left

       System.gc();

       → Object likely removed


    4. weakRef.get():

       - Returns object if still alive
       - Returns null if GC removed it


    5. Important Rule:

       Weak reference does NOT keep object alive


    6. Use Cases:

       - Caching
       - Memory-sensitive data


    7. Difference from Strong Reference:

       Strong → prevents GC
       Weak   → allows GC


    8. One-line Revision:

       "Weak reference does not protect object from GC"
*/