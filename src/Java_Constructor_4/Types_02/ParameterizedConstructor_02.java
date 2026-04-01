package Java_Constructor_4.Types_02;

public class ParameterizedConstructor_02 {
    public static void main(String[] args) {
        //passing values during obj creation
        Student2 obj1=new Student2(24,"Mayank");
        obj1.display();
    }
}

class Student2 {
    int age;
    String name;

    //parameterized constructor
    Student2(int a, String n){

    age=a;
    name=n;
  }
  void display(){
      System.out.println("Age: " + age + ", Name: " + name);
  }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Parameterized Constructor?

       A constructor that accepts parameters
       to initialize object values


    2. Key Feature:

       Values are passed at the time of object creation


    3. Syntax:

       ClassName(parameters) {
           // initialization
       }


    4. Example Understanding:

       new Student2(20, "Mayank")

       → age = 20
       → name = "Mayank"


    5. Advantage:

       - Initialize objects with different values
       - More flexible than default constructor


    6. Important Rule:

       Once parameterized constructor is created,
       default constructor is NOT available


    7. Real Use:

       Used in almost all real-world classes


    8. One-line Revision:

       "Parameterized constructor = initialize object with values"
*/