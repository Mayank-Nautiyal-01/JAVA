package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type1_Classes;

public class constructor_6 {
    int x;

    // constructor
    constructor_6() {
        x = 10;
    }

    public static void main(String[] args) {

        constructor_6 obj = new constructor_6();

        System.out.println(obj.x);
    }
}
//notes:-------------------------------->
//What is a Constructor?
//== A constructor is a special method that is automatically called when an object is created.


//Key Rule------>
//Constructor name = Class name
//
//Here:
//
//constructor_6()   // constructor

//Step-by-Step Execution
//-1️>Object creation
//constructor_6 obj = new constructor_6();
//
//-2> Automatically constructor runs
//constructor_6() {
//    x = 10;
//}
//
//- This sets value of x
//
//- 3>Output
//System.out.println(obj.x);
//
//-Output:10
//
//==Memory Representation
//Stack                    Heap
//------                  -------------------
//obj --------------->     object
//                         x = 10
//Important Points
// -=Constructor has:
//No return type (not even void)
//
//Same name as class
//
// Wrong (Common Mistake)
//void constructor_6() { }   //  not constructor
//
//-This becomes a normal method, not constructor.
//Why Constructor is Needed?
//
//-Without constructor:
//
//int x;
//
//-Default value:
//
//x = 0
//
//-With constructor:
//
//constructor_6() {
//    x = 10;
//}
//
//-We initialize object with custom values
//
// Real Use;
//Object creation + Initialization = Constructor
// One Line Summary
//Constructor initializes object automatically when it is created