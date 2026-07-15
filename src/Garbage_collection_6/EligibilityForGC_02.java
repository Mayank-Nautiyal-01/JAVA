//When does an object become eligible for Garbage Collection? lets see:

public class EligibilityForGC_02 {

    // simple class Stud
    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // 1> Nullifying a Reference

        Student s1 = new Student("mayank");

        System.out.println("obj created");

        // obj becomes eligible for gc
        s1 = null;
        System.out.println("reference set to null");

        // 2 reassigning the reference

        Student s2 = new Student("Rahul");
        Student s3 = new Student("Aman");

        // obj referred by s2 becomes unreachble
        s2 = s3;

        System.out.println("Reference Reassigned.");

        // 3> anonymous obj

        new Student("Anonymous");
        System.out.println("Anonymous obj created.");

        // 4. Object Created Inside a Method

        CreateStudent();

        System.out.println("Method Finished.");
    }

    static void CreateStudent() {
        Student s = new Student("inside method");
        System.out.println("student created inside method.");
    }
}

// let understand

// Case 1 — Nullifying a Reference
// Student s1 = new Student("Mayank");

// Memory:

// Stack Heap

// s1 ------------------> Student Object

// Now
// s1 = null;

// Memory

// Stack Heap

// s1 = null Student Object

// Nothing points to the object.

// Therefore

// Eligible for Garbage Collection

// This is the most common way.

// Case 2 — Reassigning a Reference

// Student s2 = new Student("Rahul");
// Student s3 = new Student("Aman");

// Memory

// Stack

// s2 -----------> Rahul Object

// s3 -----------> Aman Object

// Now

// s2 = s3;

// Memory becomes

// Stack

// s2 -----------> Aman Object

// s3 -----------> Aman Object

// Rahul Object

// (No reference)

// Notice carefully.

// The "Rahul" object lost its only reference.

// So it becomes

// Eligible for Garbage Collection.

// This is another frequently asked interview question.

// Case 3 — Anonymous Object
// new Student("Anonymous");

// Here we create an object.

// But we never store its reference.

// Normally we write

// Student s = new Student();

// Here

// s

// stores the reference.

// But

// new Student();

// creates the object and immediately forgets its address.

// Memory

// Heap

// Anonymous Student Object

// (No reference)

// As soon as this statement finishes executing,

// the object becomes eligible for GC.

// Case 4 — Local Object (Method Scope)

// Method

// static void createStudent() {

// Student s = new Student("Inside Method");

// }

// Memory while the method is running

// Stack

// s ----------> Student Object

// After the method returns

// createStudent();

// ↓

// Method Ends

// The local variable

// s

// is destroyed.

// Memory becomes

// Stack

// (No variable)

// Heap

// Student Object

// No reference remains.

// Therefore,

// the object becomes eligible for Garbage Collection.

// ===============================

// =========================================================
// ELIGIBILITY FOR GARBAGE COLLECTION
// =========================================================

// What does "Eligible for Garbage Collection" mean?

// An object is eligible for Garbage Collection when
// it is no longer reachable by any live reference.

// Important:

// Eligible does NOT mean immediately deleted.

// It only means the JVM is now allowed to remove it
// whenever it decides to run Garbage Collection.

// ---------------------------------------------------------

// Ways an object becomes eligible for GC

// 1. Nullifying a Reference

// Student s = new Student();

// s = null;

// The object has no references.

// Eligible for GC.

// ---------------------------------------------------------

// 2. Reassigning a Reference

// Student s1 = new Student();

// Student s2 = new Student();

// s1 = s2;

// The first object loses its reference.

// Eligible for GC.

// ---------------------------------------------------------

// 3. Anonymous Object

// new Student();

// No reference is stored.

// The object becomes eligible immediately
// after the statement finishes.

// ---------------------------------------------------------

// 4. Local Object

// Object created inside a method.

// When the method finishes,

// its local reference variable is destroyed.

// If no other references exist,

// the object becomes eligible for GC.

// ---------------------------------------------------------

// Remember

// Eligible ≠ Deleted

// Only the JVM decides when to reclaim memory.

// =========================================================