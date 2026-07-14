// package Java_Constructor_4.Intro_01;

public class ConstructorVsMethod_02 {
    public static void main(String[] args) {
        Demo obj=new Demo();//// constructor called automatically

        obj.show();// // method called manually

    }
}
//Class demonstrating constructor vs method
class Demo{
    //constructor
    Demo(){
        System.out.println("Constructor is called");
    }
    //method
    void show(){
        System.out.println("Method is called");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Constructor vs Method:

       Constructor:
       - Special method
       - Same name as class
       - No return type
       - Called automatically

       Method:
       - Normal method
       - Any name
       - Has return type (or void)
       - Called manually


    2. Key Difference:

       Constructor → runs at object creation
       Method → runs when called


    3. Example Understanding:

       new Demo() → constructor runs
       obj.show() → method runs


    4. Purpose Difference:

       Constructor → initialize object
       Method → perform operations


    5. Important Rule:

       Constructor cannot be called like method


    6. Common Mistake:

       Writing return type in constructor


    7. One-line Revision:

       "Constructor initializes, method performs action"
*/
