// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type1_Classes;

// many one have a confusion about static and non-static variable lets see

public class static_vs_non_static_8 {
    static int a = 10;   // static variable
    int b = 20;          // non-static (instance variable)

    public static void main(String[] args) {

        static_vs_non_static_8 obj1 = new static_vs_non_static_8();
        static_vs_non_static_8 obj2 = new static_vs_non_static_8();

        obj1.b = 100;
        obj2.b = 200;

        System.out.println(a);        // static
        System.out.println(obj1.b);   // instance
        System.out.println(obj2.b);   // instance
    }
}

//notes:
//What is Static vs Non-Static
//Non-Static (Instance Variable)
//int b = 20;
//
//-belongs to object
//
//-each object has its own copy
//
//=>Static Variable
//static int a = 10;
//
//belongs to class
//
//shared by all objects
//
//                Memory Representation
//    Stack                     Heap                     Method Area
//  ------                   --------                  -------------
//obj1  ----------->          object1 (b = 100)
//
//obj2  ----------->          object2 (b = 200)
//
//                                                       a = 10 (shared)
//Key Difference
//Feature	        Static	        Non-Static
//Belongs         to	Class	    Object
//Memory	        One copy	    Multiple copies
//Access	        Class name	    Object
//Sharing	        Shared	        Not shared
//
//
//=>Accessing Static Variable
//System.out.println(static_vs_non_static_8.a);
//
//or
//
//System.out.println(a);
//
//
//Important Concept:
//-static = one copy for all objects
//-non-static = separate copy per object
//
//==>Experiment (Very Important)
//
//Add this:
//
//obj1.a = 50;
//
//        System.out.println(obj2.a);
//
//Output:50
//
//Reason:
//
//static variable is shared
//Another Experiment
//obj1.b = 300;
//
//        System.out.println(obj2.b);
//
//Output:
//
//        200
//
//Reason:
//
//instance variables are separate
//One Line Summary
//static => class level (shared)
//non-static => object level (separate)
