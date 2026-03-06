package JAVA_BASIC;

public class TypeConversion5 {
    public static void main(String[] args) {
        System.out.println("type conversion in java:");
        System.out.println("two type of conversion:");
        System.out.println("1> implicit or widening conversion (automatic):");

        int myInt= 100;
        double myDouble=myInt; // now its automatically convert int into double
        System.out.println("Integer value: " + myInt);
        System.out.println("Converted to Double: " + myDouble);

        System.out.println("now 2> explicit conversion or  NARROWING CONVERSION (Manual)");
        double originalPrice=999.99;
        int roundedPrice=(int)originalPrice; // Manual cast: double -> int
        System.out.println("Original Double value: " + originalPrice);
        System.out.println("Manual Cast to Integer: " + roundedPrice); //999
        //Note: The .99 was lost/truncated

    }
}
//
//TYPE CONVERSION IN JAVA (TYPE CASTING)
//
//Definition:
//Type conversion happens when you assign a value of one data type to another data type.
//
//
//There are TWO types of conversion in Java:
//
//        1. WIDENING CONVERSION (Implicit/Automatic)
//- Definition: Converting a smaller type to a larger type size.
//- How it works: Java does this AUTOMATICALLY because there is no risk of losing data.
//- Order: byte -> short -> char -> int -> long -> float -> double
//
//Example:
//int myInt = 9;
//double myDouble = myInt; // Automatic casting: int to double
//
//System.out.println(myInt);    // Outputs 9
//System.out.println(myDouble); // Outputs 9.0
//
//
//-----------------------------------------------------------
//
//
//        2. NARROWING CONVERSION (Explicit/Manual)
//- Definition: Converting a larger type to a smaller type size.
//- How it works: You must do this MANUALLY by placing the type in parentheses () in front of the value.
//        - Risk: You might lose data (decimal points or large numbers might get cut off).
//        - Order: double -> float -> long -> int -> char -> short -> byte
//
//Example:
//double myDouble = 9.78d;
//int myInt = (int) myDouble; // Manual casting: double to int
//
//System.out.println(myDouble); // Outputs 9.78
//System.out.println(myInt);    // Outputs 9 (The .78 is LOST)
//
//
//-----------------------------------------------------------
//
//
//SUMMARY COMPARISON
//
//Type         | Conversion Direction | Process   | Data Loss?
//        -------------|----------------------|-----------|-----------
//Widening     | Small -> Large       | Automatic | No
//Narrowing    | Large -> Small       | Manual    | Yes (Possible)
//
//
//-----------------------------------------------------------
//
//
//REAL-WORLD ANALOGY
//
//- Widening: Pouring water from a SMALL cup into a LARGE bucket. (Easy, no spill)
//        - Narrowing: Pouring water from a LARGE bucket into a SMALL cup. (Hard, might overflow/spill)
//
//
//        -----------------------------------------------------------
//
//
//SPECIAL CASE: TYPE PROMOTION IN EXPRESSIONS
//When you perform math with different types, Java promotes the result to the largest type involved.
//
//        Example:
//int a = 10;
//double b = 5.5;
//double result = a + b; // 'a' is promoted to double before calculation (10.0 + 5.5)
//
//
//-----------------------------------------------------------
//
//
//TYPE CONVERSION CHEAT SHEET
//
//1. Implicit (Widening): Done by Java.
//long x = 100; // 100 is an int, automatically becomes long.
//
//2. Explicit (Narrowing): Done by YOU.
//int y = (int) 100.50; // Manual cast, y becomes 100.
