package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type1_Classes;

public class multiple_objects_5 {
    int value;

    public static void main(String[] args) {

        multiple_objects_5 obj1 = new multiple_objects_5();
        multiple_objects_5 obj2 = new multiple_objects_5();

        obj1.value = 100;
        obj2.value = 200;

        System.out.println(obj1.value);//100
        System.out.println(obj2.value);//200
    }
}
// lets understand

//what  is this topic?

//Here we learn:

//Different objects = Different memory

// Step-by-Step Execution:

//1️>First object====>

//multiple_objects_5 obj1 = new multiple_objects_5();

//----Creates Object 1 in Heap----

///  2️>Second object
///multiple_objects_5 obj2 = new multiple_objects_5();

//Creates Object 2 in Heap

// Memory Representation
//Stack                     Heap
//------                   ---------------------
//obj1 --------------->     Object 1
//                         value = 100
//
//obj2 --------------->     Object 2
//                         value = 200

///====Key Difference from Previous Topic===

//r2 = r1;

// SAME object
//
//Now (multiple objects)
//obj1 = new ...
//obj2 = new ...
//=>DIFFERENT objects


//note

//Try this:

//obj1.value = 500;

//        System.out.println(obj1.value);
//System.out.println(obj2.value);
//Output
//        500
//        200

        // Why obj2 didn't change?

//Because:
//
//obj1 and obj2 point to DIFFERENT objects

// Most Important Understanding:
//Case	          Result
//r2 = r1	      Same object
//new again	      New object

// One Line Summary
//Every time you use "new", a new object is created in heap

