package JAVA_BASIC;

public class operator6 {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println("ARITHMETIC:");
        System.out.println("Sum: " + (a + b));
        System.out.println("Remainder (10 % 3): " + (a % b));
        System.out.println();

        // 2. Assignment Operators
        int x = 5;
        x += 10; // x = x + 10
        System.out.println("ASSIGNMENT:");
        System.out.println("Value after += 10: " + x);
        System.out.println();

        // 3. Unary Operators
        int y = 5;
        y++; // Increment: y = 6
        System.out.println("UNARY:");
        System.out.println("Value after ++: " + y);
        System.out.println();

        // 4. Comparison & Logical Operators
        int age = 20;
        boolean isStudent = true;
        System.out.println("COMPARISON/LOGICAL:");
        // Are you at least 18 AND a student?
        boolean canGetDiscount = (age >= 18) && isStudent;
        System.out.println("Can get discount? " + canGetDiscount);
        System.out.println();

        // 5. Ternary Operator (Shorthand If-Else)
        int score = 75;
        String result = (score >= 40) ? "Pass" : "Fail";
        System.out.println("TERNARY:");
        System.out.println("Exam Result: " + result);
    }
}


//OPERATORS IN JAVA:
//
//Definition:
//Operators are special symbols used to perform operations on variables and values.
//
//
//Java operators are grouped into the following categories:
//
//
//        1. ARITHMETIC OPERATORS (Math)
//Used to perform basic mathematical operations.
//
//        +  Addition       (x + y)
//-  Subtraction    (x - y)
//*  Multiplication (x * y)
///  Division       (x / y)
//%  Modulus        (x % y) -> Returns the remainder (e.g., 10 % 3 = 1)
//
//
//-----------------------------------------------------------
//
//
//        2. ASSIGNMENT OPERATORS (Storage)
//Used to assign values to variables.
//
//        =   Simple assignment (x = 10)
//+=  Add and assign    (x += 5 is the same as x = x + 5)
//-=  Subtract/assign   (x -= 5 is the same as x = x - 5)
//*=  Multiply/assign   (x *= 5)
///=  Divide/assign     (x /= 5)
//%=  Modulus/assign    (x %= 5)
//
//
//-----------------------------------------------------------
//
//
//        3. COMPARISON OPERATORS (Checking)
//Used to compare two values. They always return a boolean (true or false).
//
//        ==  Equal to                 (5 == 5 is true)
//!=  Not equal to             (5 != 3 is true)
//>   Greater than             (5 > 3 is true)
//<   Less than                (5 < 8 is true)
//>=  Greater than or equal to (5 >= 5 is true)
//<=  Less than or equal to    (5 <= 2 is false)
//
//
//-----------------------------------------------------------
//
//
//        4. LOGICAL OPERATORS (Logic Gates)
//Used to combine multiple conditions.
//
//&&  Logical AND  (Returns true if BOTH conditions are true)
//||  Logical OR   (Returns true if at least ONE condition is true)
//!   Logical NOT  (Reverses the result: true becomes false)
//
//
//-----------------------------------------------------------
//
//
//        5. UNARY OPERATORS (Self-Change)
//Used with only one operand.
//
//++  Increment (Increases value by 1)
//--  Decrement (Decreases value by 1)
//
//Example:
//int x = 10;
//x++; // x is now 11
//
//
//        -----------------------------------------------------------
//
//
//        6. TERNARY OPERATOR (Shorthand If-Else)
//It is the only operator that takes three operands.
//
//        Syntax: variable = (condition) ? value_if_true : value_if_false;
//
//Example:
//int age = 20;
//String status = (age >= 18) ? "Adult" : "Minor";
//// status will be "Adult"
//
//
//-----------------------------------------------------------
//
//
//OPERATOR PRECEDENCE (Order of Operations)
//Which operator runs first?
//
//        1. Parentheses ()
//2. Increment/Decrement ++, --
//        3. Multiplication/Division/Modulus *, /, %
//        4. Addition/Subtraction +, -
//        5. Comparison <, >, <=, >=
//        6. Equality ==, !=
//        7. Logical AND &&
//        8. Logical OR ||
//        9. Assignment =
//
//
