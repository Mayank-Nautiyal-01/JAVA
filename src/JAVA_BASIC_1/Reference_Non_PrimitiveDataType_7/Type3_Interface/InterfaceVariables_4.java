// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type3_Interface;

interface  Vehicle{
    /*
     Variables inside interface are:
        public + static + final (by default)

        So this is actually:
        public static final int speedLimit = 100;
    */
   int speedLimit=100;
}

class Car1 implements Vehicle {
    void showSpeed(){
        // Accessing interface variable
        System.out.println("Speed Limit: " + speedLimit);
        //or(recommended way)
        System.out.println("Speed Limit:"+Vehicle.speedLimit);
    }
}
public class InterfaceVariables_4 {
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.showSpeed();
         /*
            Direct access without object
            because variable is static
        */
        System.out.println("Access directly:"+Vehicle.speedLimit);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Interface Variables Rule:

       All variables are by default:
       - public
       - static
       - final

       Example:
       int x = 10;

       is same as:
       public static final int x = 10;


    2. Meaning of each keyword:

       public  → accessible everywhere
       static  → belongs to interface (no object needed)
       final   → constant (cannot change)


    3. Cannot modify variable:

       Example:
       Vehicle.speedLimit = 200;  //  ERROR

       Because:
       final → value cannot change


    4. Accessing variable:

       (A) Using class:
           Vehicle.speedLimit

       (B) Inside implementing class:
           speedLimit


    5. Best Practice:

       Always use:
       Vehicle.speedLimit

       Reason:
       - Improves readability
       - Avoids confusion


    6. Real-world example:

       interface Rules {
           int MAX_SPEED = 120;
       }

       → constant rules shared by all classes


    7. Common Mistake:

       interface Test {
           int x;  //  must initialize
       }

       Correct:
       int x = 10;


    8. Key Concept:

       "Interface variables are constants"


    9. One-line Revision:

       "All variables in interface are public static final"
*/
