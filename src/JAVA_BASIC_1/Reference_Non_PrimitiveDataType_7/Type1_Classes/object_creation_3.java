// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type1_Classes;

public class object_creation_3 {
    int num=10;

    public static void main(String[] args) {
        object_creation_3 obj=new object_creation_3();
        System.out.println(obj.num);//10
    }
}
//notes==
//An Object is an instance of a class.
//
//Simple meaning:
//
//Class → Blueprint
//Object → Real thing created from that blueprint
//
//Object Creation Syntax :::::::
//ClassName referenceVariable = new ClassName();

//Example from our program:
//
//object_creation_3 obj = new object_creation_3();
//
//Break it down:
//
//object_creation_3:::	Class name
//obj:::::::::	Reference variable
//new::::::::	Keyword that creates object
//new object_creation_3():::::	Constructor call


//Step 1: What happens when program runs?
//
//When JVM executes this line:
//
//object_creation_3 obj = new object_creation_3();
//
//Two things happen:
//
// i>> Memory for reference variable is created in Stack
//
//obj
//
//ii> Object is created in Heap
//
//object_creation_3 object

//Step 2: What goes inside the Object?
//
//When the object is created, all instance variables of the class become part of the object.
//
//Our class has:
//
//int number = 10;
//
//So the object will store:
//
//number = 10
//
//inside itself.
//
//Step 3: Memory Diagram
//Stack Memory                 Heap Memory
//------------                -----------------------
//obj   ------------------->   object_creation_3 Object
//                             number = 10 (instance variables of the class become part of the object)
//
//Explanation:
//
//obj → stored in Stack
//
//object → stored in Heap
//
//instance variables (number) → stored inside the object in Heap
//
//Step 4: Important Rule
//
//In Java:
//
//Item	                 Memory
//Local variables	     Stack
//Objects	             Heap
//Instance variables	 Inside object (Heap)
//Reference variables	 Stack
