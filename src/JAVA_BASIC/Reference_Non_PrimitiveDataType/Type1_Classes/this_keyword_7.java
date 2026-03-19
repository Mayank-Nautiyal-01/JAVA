package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type1_Classes;

public class this_keyword_7 {
    int x;

    this_keyword_7(int x) {
        this.x = x;
    }

    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        this_keyword_7 obj = new this_keyword_7(100);
        obj.display();
    }
}

//notes:=
//What is this
//
//        this = reference to current object
//
//Why this is needed
//
//Constructor:
//
//this_keyword_7(int x) {
//    this.x = x;
//}
//
//There are two variables:
//
//x => parameter (value passed = 100)
//
//this.x => instance variable (belongs to object)
//
//Without this:
//this_keyword_7(int x) {
//    x = x;
//}
//
//Result:
//
//-parameter x gets assigned to itself
//
//-instance variable x remains 0
//
//With this:
//        this.x = x;
//
//Meaning:
//
//object.x = parameter x
//
//Execution Flow:==
//new this_keyword_7(100)
//   =>
//object created (x = 0)
//   =>
//constructor runs
//   =>
//  this.x = x
//   =>
//  x = 100
//
// =Memory View
//Stack                  Heap
//-----                  ----------------
//obj  ------------->    object
//                       x = 100
//Key Uses of this
//
//Access instance variable
//this.x = x
//
//Call method of same object
//this.display()
//
//One Line Summary
//this = current object ka reference