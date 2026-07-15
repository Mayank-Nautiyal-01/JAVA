
public class FinalizeMethod_03 {

   static class Student {

      String name;

      Student(String name) {
         this.name = name;
      }

      // finalize() is called by the Garbage Collector
      // before reclaiming the object's memory.
      @Override
      protected void finalize() throws Throwable {

         System.out.println(name + " object is being garbage collected.");

      }
   }

   public static void main(String[] args) {

      System.out.println("========== finalize() Method Example ==========\n");

      // Creating an object
      Student s1 = new Student("Mayank");

      System.out.println("Student Object Created.");

      // Removing the reference
      s1 = null;

      System.out.println("Reference Removed.");

      // Requesting Garbage Collection
      System.gc();

      System.out.println("Garbage Collection Requested.");

      System.out.println("\nProgram Finished.");
   }
}
// ✔ finalize() belongs to Object class.

// ✔ It may be called before an object is reclaimed.

// ✔ It is NOT guaranteed to execute.

// ✔ System.gc() does not guarantee finalize() will run.

// ✔ finalize() is deprecated.

// ✔ Avoid using it in modern Java.

// Note:
// In modern Java versions, finalize() may never be called.
// This example is for learning the historical concept only.

// Interview Questions
// Q1. What is finalize()?

// A method inherited from Object that the JVM may invoke before reclaiming an
// eligible object's memory.

// Q2. Can we call finalize() ourselves?

// Technically yes, because it's just a method, but we should never do so. It is
// intended for the JVM's use, and modern Java discourages relying on it.

// Q3. Is finalize() guaranteed to execute?

// No.

// Q4. Is finalize() used in modern Java?

// No. It is deprecated and should be avoided.

// Q5. Why was it removed?

// Because it is:

// unpredictable,
// inefficient,
// and there are better resource-management mechanisms.