package JAVA_BASIC;

public class DataType{
    public static void main(String[] args) {
        System.out.println("this class is about datatype in java:");
    }
}
//=======Data Types in Java=======
//Data types in Java specify the size and type of values that can be stored in a variable. Java is a strongly typed language, meaning every variable must be declared with a data type.
//
//Data types are divided into two main categories: 1> primitive and 2> non-primitive
//
//
//-------1>>. Primitive Data Types
//Primitive data types are predefined by the language and are the building blocks of data manipulation.
//
//Type	Size	Default	  Range
//boolean	1 bit	 false	    true or false
//byte	1 byte	  0	        -128 to 127
//short	2 bytes	   0	          -32,768 to 32,767
//int	     4 bytes	0	         -2^31 to 2^31-1
//long	8 bytes 	0L	        -2^63 to 2^63-1
//float	4 bytes 	0.0f	    Sufficient for 6 to 7 decimal digits
//double	8 bytes 	0.0d	   Sufficient for 15 decimal digits
//char	2 bytes	 '\u0000'    0 to 65,535 (Unicode characters)
//
//note:
//Use int for whole numbers and double for decimal numbers by default, unless memory is a major concern.
//
//------- 2>>. Non-Primitive (Reference) Data Types
//Non-primitive data types are created by the programmer and are not predefined (except for String). They are also called "Reference Types" because they store references (addresses) to objects.
//
//String: A sequence of characters. "Hello World"
//Arrays: A collection of similar types of elements.
//        Classes/Interfaces: User-defined types.
//        3. Key Differences
//Feature	Primitive	Non-Primitive
//Origin	Predefined in Java	Created by the programmer
//Methods	Cannot call methods on them	Can have methods to perform actions
//Value	Always has a value (default)	Can be null
//Memory	Stack memory	Heap memory (reference in Stack)
//Naming	Starts with lowercase (int)	Starts with uppercase (String)
//        4. Code Example
//java
//public class DataTypesExample {
//    public static void main(String[] args) {
//        // Primitive
//        int age = 25;
//        double price = 19.99;
//        boolean isJavaFun = true;
//        char grade = 'A';
//        // Non-Primitive
//        String message = "Welcome to Java!";
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println("Age: " + age);
//        System.out.println("Message: " + message);
//    }
//}