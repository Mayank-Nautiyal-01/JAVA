// package Java_Constructor_4.Types_02;

public class CopyConstructor_03 {
    public static void main(String[] args) {
     //Original object
        Student3 obj1=new Student3(20,"mayank");

        //copy obj
        Student3 obj2=new Student3(obj1);

        obj1.display();
        obj2.display();
    }
}
//Class demonstrating copy constructor

class Student3{
     int age;
     String name;

     // parameterized constructor
     Student3(int age,String name){
         this.age=age;
         this.name=name;
     }

    //copy constructor
    Student3(Student3 other){
         this.age=other.age;
         this.name=other.name;
    }

    void display(){
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Copy Constructor?

       A constructor that creates a new object
       by copying values from another object


    2. Key Feature:

       Takes object of same class as parameter


    3. Syntax:

       ClassName(ClassName obj) {
           // copy values
       }


    4. Example Understanding:

       Student3 obj2 = new Student3(obj1);

       → obj2 gets same values as obj1


    5. Important Point:

       Java does NOT provide default copy constructor
       (we create it manually)


    6. Use Case:

       - Clone object
       - Duplicate data


    7. Concept:

       Creates separate object with same data


    8. One-line Revision:

       "Copy constructor = copy data from one object to another"
*/
