package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type1_Classes;

public class class_creation_2 {
    // variables (properties)
    String name;
    int age;

    // method (behavior)
    void displayInfo() {
        System.out.println("This method belongs to the class");
    }
}
//notes==
//Here we are just understanding the structure of a class, not creating objects yet.
//
//A class mainly contains two things:
//
//Class
// ├── Variables (data)
// └── Methods (behavior)
//1> Variables in Class
//String name;
//int age;
//
//These are called instance variables.
//
//They represent data that objects will store later.
//
//Example (conceptually):
//
//name	age
//Rahul	20
//Aman	22

//  2> Methods in Class
//void displayInfo()
//
//Methods define behavior or actions.
//
//Example behaviors of a Student:
//
//study()
//
//attendClass()
//
//displayInfo()
//
//----------- Class Structure Visualization
//class Student {
//
//    // data
//    String name;
//    int age;
//
//    // behavior
//    void study(){}
//
//}
//
//So a class groups data and behavior together.
//
//       #### Key Concept
//
//A class is like a template.
//
//Example:
//
//Student class
//   ↓
//Rahul object
//Aman object
//Riya object