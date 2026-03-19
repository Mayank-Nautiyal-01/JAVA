package JAVA_BASIC.Reference_Non_PrimitiveDataType.Intro;

public class Intro {

    public static void main(String[] args) {
        System.out.println("Non Primitive data type/reference data type");
    }
}
/*
*   there are mainly 4 types of reference data type
* 1>class
* 2> string
* 3>Interface
* 4>Array
*
*  ques1> what is reference?
* =====reference is a variable that stores the memory address of an object,
* not the object itself.

     When you create an object using new,
*    the object is created in heap memory,
*     and the variable holds a reference (address) to that object.
*
*  ex:=  public class employee{
*  int empid;
*  public int getId(){
*    return empid;
*   }
*   public void setid(int empid){
*    this.empid=empid;
*  }
* }
*
*   now to create an obj of this class emp
*
*  public class student {
*   public static void main(String args[]){
*      Employee empObj = new Employee();  // reference + object creation
        empObj.setId(101);  // setting value
        System.out.println(empObj.getId()); // getting value // print-101
* }
* }
*  -- here new keyword allocate a memory  block obj & the variable's name holds a
* reference  to actual memory
*
*   Employee → class name
    empObj → reference variable
    new Employee() → creates an object in memory

*   emp obj variable ----->holds reference --->(actual obj)heap memory
* */

// in java everything is pass by value .so with the help of refernce
// var  we achieve the functionality of pointer in cpp




//Interview One-Line Answers
//
//1>>>>>>>>>>>Multiple references to same object:
//
//When multiple references point to the same object, any change made through one reference
//is reflected when accessed through the others.
// ex:

//class Employee {
//    int id;
//}
//
//public class Test {
//
//    public static void main(String[] args) {
//
//        Employee e1 = new Employee();
//        e1.id = 10;
//
//        Employee e2 = e1;   // second reference pointing to same object
//
//        e2.id = 50;
//
//        System.out.println(e1.id); //50
//    }
//}
  //---------  Memory view:
//
//Stack Memory             Heap Memory
//-------------           ----------------
//e1  -----------\
//                ----->  Employee Object
//e2  -----------/           id = 50

//Important Point>>>>>>>
//
//If we change the reference, not the object:
//
//e2 = new Employee();
//
//Now memory becomes:
//
//e1 -----> Object1 (id=10)
//
//e2 -----> Object2 (id=0)

//==========================================================================================



//2>>>>>>>>>>>Object vs Reference:
//
//An object is the actual instance of a class stored in heap memory,
//while a reference is a variable that stores the address of that object.

//        |Feature   |      Object                 | Reference                              |
//        | -------- | --------------------------- | -------------------------------------- |
//        | Meaning  | Actual instance of a class  | Variable that stores address of object |
//        | Memory   | Stored in **Heap memory**   | Stored in **Stack memory**             |
//        | Creation | Created using `new` keyword | Created as variable                    |
//        | Purpose  | Holds data and methods      | Used to access the object              |
