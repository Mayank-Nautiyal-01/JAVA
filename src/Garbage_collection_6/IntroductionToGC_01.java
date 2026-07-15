
public class IntroductionToGC_01 {
    // simple class student
    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // creating an obj
        Student s1 = new Student("mayank");
        System.out.println("stud obj created");

        // removing the reference
        s1 = null;
        System.out.println("reference removed");

        // requesting jvm to perform gc
        System.gc();
        System.out.println("garbage collection requested");
    }
}

// NOTES
// Explanation of the Code

// Now let's understand the code line by line.

// 1. Creating the object

// This single line does three things:

// Creates a Student object in the Heap Memory.
// Creates a reference variable s1 in the Stack Memory.
// Makes s1 point to the object.

// Memory:

// 2. Removing the reference

// Now the memory looks like this:

// The object is still in memory, but no variable points to it.

// Therefore, it becomes eligible for Garbage Collection.

// 3. Requesting Garbage Collection

// This does not force the JVM to clean memory.

// It only says:

// "JVM, if you think this is a good time, please run Garbage Collection."

// The JVM may:

// Run GC immediately.
// Run it later.
// Ignore the request completely.

// Interview Questions
// Q1 Why do we use System.gc()?

// To request the JVM to perform Garbage Collection.

// Q2 Does System.gc() force Garbage Collection?

// No.

// It is only a request.

// Q3 Who decides when GC runs?

// The JVM.

// Q4 Can the JVM ignore System.gc()?

// Yes.

// Q5 Which method is equivalent to System.gc()?
// Runtime.getRuntime().gc();