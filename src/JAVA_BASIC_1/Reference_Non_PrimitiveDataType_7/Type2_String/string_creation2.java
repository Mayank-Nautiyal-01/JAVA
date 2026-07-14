// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type2_String;

public class string_creation2 {
    public static void main(String[] args) {
        System.out.println("file teaches how strings are created.");

        // Method 1: String Literal
        String s1 = "Java";

        // Method 2: Using new keyword
        String s2 = new String("Java");

        System.out.println(s1); //java
        System.out.println(s2); //java
    }
}
//What is happening internally
//String Literal
//String s1 = "Java";
//
//Memory:
//
//Stack            String Pool
//-----            -----------
//s1  -----------> "Java"
//
//Java checks the String Pool first.
//
//If "Java" already exists → reuse it.

//========================================
//Using new
//String s2 = new String("Java");
//
//Memory:
//
//Stack                Heap
//-----                ----
//s2  ------------->   "Java"
//
//This always creates a new object

//=============================================
//Why Java Created String Pool
//
//Because strings are used very frequently.
//
//Example:
//
//        "yes"
//        "no"
//        "name"
//        "email"
//        "password"
//
//If Java created a new object every time → memory waste.
//
//So Java created String Pool to reuse objects.

//================================
//with ex of string pool
//public class StringCreation {
//
//    public static void main(String[] args) {
//
//        String s1 = "Java";
//        String s2 = "Java";
//
//        System.out.println(s1 == s2);  //true// here it save the memory
//                                            Because both references point to
//                                            same object in String Pool.
//    }
//}
  //  based on above ex of string pool some question comes in mind of a beginner:

//Q1: Why do we call s1 and s2 reference variables?
//String s1 = "Java";
//String s2 = "Java";
//
//==Answer:==
//We call them reference variables because they store the memory address (reference) of the String object, not the actual text.
//
//        "Java" is the object, and s1, s2 just point to it.
//
//Memory idea:
//
//s1 ----\
//        ---> "Java"
//s2 ----/
//??????Q2: Are reference variables only those where we use new?
//
//Example:
//
//String s = new String("Java");
//
//No.
//
//A variable becomes a reference variable whenever its type is a class.
//
//So both are reference variables:
//
//String s1 = "Java";
//String s2 = new String("Java");
//
//Because String is a class.
//
// ????? Q3: When is the object created if we don't use new?
//String s1 = "Java";
//
// The object "Java" is automatically created in the String Pool by Java when the literal appears.
//
//??? Q4: What is the difference between primitive variable and reference variable?
//Type	Example	What it stores
//Primitive	int a = 10;	actual value
//Reference	String s = "Java";	address of object
//???? Q5: What is the object here?
//String s1 = "Java";
//
//"Java" → Object
//
//s1 → Reference variable
//
// One-line rule to remember==
//
//If the variable type is a class, it is a reference variable.
//
//        Example:
//
//String s = "Hello";
//Employee e = new Employee();
//Scanner sc = new Scanner(System.in);
//
//All are reference variables.
