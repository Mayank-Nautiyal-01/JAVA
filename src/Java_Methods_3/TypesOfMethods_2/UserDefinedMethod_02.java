// package Java_Methods_3.TypesOfMethods_2;
public class UserDefinedMethod_02 {
    public static void main(String[] args) {

        Demo2 obj = new Demo2();

        /*
            Calling user-defined methods
        */
        obj.greet();

        int sum = obj.add(10, 20);
        System.out.println("Sum: " + sum);

        double area = obj.circleArea(5.0);
        System.out.println("Area: " + area);
    }
}

/*
    Class demonstrating user-defined methods
*/
class Demo2 {

    // simple method
    void greet() {
        System.out.println("Hello from user-defined method!");
    }

    // method with return
    int add(int a, int b) {
        return a + b;
    }

    // method with logic
    double circleArea(double radius) {
        return 3.14 * radius * radius;
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What are User-Defined Methods?

       Methods created by the programmer
       to perform specific tasks


    2. Why use them?

       - Custom logic
       - Code reuse
       - Better structure


    3. Example Understanding:

       greet() → prints message
       add(10,20) → returns 30
       circleArea(5) → returns area


    4. Difference from System-Defined:

       System-defined → already given by Java
       User-defined → created by programmer


    5. Key Concept:

       "You define your own functionality"


    6. Important Point:

       Must be called using object (if not static)


    7. Real Use:

       Used in real projects to handle logic


    8. One-line Revision:

       "User-defined methods = methods created by programmer"
*/
