package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type3_Interface;


interface Person{
    default void wakeUp(){
        commonRoutine();
        System.out.println("Person wake up");
    }
    default void sleep(){
        commonRoutine();
        System.out.println("Person goes to sleep");
    }
    /*
      Private method (Java 9 feature)
      - Used only inside interface
      - Helps avoid code duplication
  */
    private void commonRoutine(){
        System.out.println("Checking time and preparing");
    }
}

class Stud implements Person{
    //no need to override anything
}

public class PrivateMethod_7 {
    public static void main(String[] args) {
        Stud s=new Stud();
        s.wakeUp();
        s.sleep();

        //Using interface reference
        Person p=new Stud();
        p.wakeUp();
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Private Method in Interface?

       - Introduced in Java 9
       - Used only inside interface
       - Cannot be accessed by implementing classes


    2. Why we use it?

       - To avoid repeating code in default/static methods

       Example:
       default void A() { common(); }
       default void B() { common(); }


    3. Syntax:

       private void methodName() {
           // code
       }


    4. Example:

       interface Test {

           default void show() {
               helper();
           }

           private void helper() {
               System.out.println("Helper method");
           }
       }


    5. Important Rules:

       - Cannot be overridden
       - Cannot be accessed outside interface
       - Used only internally


    6. Common Mistake:

       class Demo implements Test {
           // trying to override private method → NOT POSSIBLE
       }


    7. Key Concept:

       - Code reuse inside interface


    8. One-line Revision:

       "Private method in interface is for internal use only"
*/