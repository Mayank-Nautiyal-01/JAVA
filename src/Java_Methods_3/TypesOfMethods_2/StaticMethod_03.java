// package Java_Methods_3.TypesOfMethods_2;



public class StaticMethod_03 {
    public static void main(String[] args) {

        /*
            Calling static methods
            (No object required)
        */
        Demo3.showMessage();

        int sum = Demo3.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}

/*
    Class demonstrating static methods
*/
class Demo3 {

    // static method
    static void showMessage() {
        System.out.println("This is a static method");
    }

    // static method with return
    static int add(int a, int b) {
        return a + b;
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is a Static Method?

       A method that belongs to the class,
       not to the object


    2. Key Feature:

       Can be called without creating object


    3. Syntax:

       static returnType methodName() {
           // code
       }


    4. How to call?

       ClassName.methodName()


    5. Example Understanding:

       Demo3.showMessage()
       Demo3.add(10,20)


    6. Important Rule:

       Static methods can access only
       static data directly


    7. Why use static?

       - Memory efficient
       - No need to create object
       - Common functionality


    8. One-line Revision:

       "Static method belongs to class, not object"
*/
