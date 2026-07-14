// package Memory_Management_and_Garbage_Collection_5.MemoryTypes_02;


public class DataStorageExample_03 {
    public static void main(String[] args) {

        /*
            Primitive variables (stack)
        */
        int a = 10;
        int b = a;   // copy value

        b = 20;

        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 20


        /*
            Object variables (heap + reference)
        */
        Student s1 = new Student(10);
        Student s2 = s1;   // copy reference

        s2.age = 50;

        System.out.println("s1 age: " + s1.age); // 50
        System.out.println("s2 age: " + s2.age); // 50
    }
}

/*
    Class for object example
*/
class Student {

    int age;

    Student(int age) {
        this.age = age;
    }
}

/*
    =========================================
    DATA STORAGE - PRIMITIVE vs OBJECT
    =========================================

    1. Primitive Data Storage:

       int a = 10;
       int b = a;

       → Value is copied

       So:
       b = 20 → does NOT affect a


    2. Object Data Storage:

       Student s1 = new Student(10);
       Student s2 = s1;

       → Reference is copied (not object)


    3. Key Difference:

       Primitive → value copy
       Object   → reference copy


    4. Example Understanding:

       Primitive:
       a = 10
       b = a → copy
       b = 20 → a unchanged

       Object:
       s1 → object
       s2 = s1 → same object
       s2.age = 50 → s1 also affected


    5. Visualization:

       Primitive (Stack):
       a = 10
       b = 20   (separate)

       Object:

       STACK                HEAP
       s1  ------------→    Object (age=50)
       s2  ------------→    same object


    6. Key Concept:

       "Primitive copies value, object copies reference"


    7. Common Mistake:

       Thinking s2 creates new object --wrong

       Correct:
       It only copies reference


    8. One-line Revision:

       "Primitive = independent, Object = shared"
*/
