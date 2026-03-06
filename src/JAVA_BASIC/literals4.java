package JAVA_BASIC;

public class literals4 {
    public static void main(String[] args) {
        System.out.println("about literals");
        int age = 20;          // integer literal
        double pi = 3.14;      // floating literal
        char grade = 'A';      // character literal
        String name = "Mayank"; // string literal
        boolean passed = true; // boolean literal

        System.out.println(age);
        System.out.println(pi);
        System.out.println(grade);
        System.out.println(name);
        System.out.println(passed);
    }
}
//JAVA LITERALS:
//
//
//What is a Literal?
//
//        In Java, a literal is a constant value written directly in the source code. It represents a value that the program can use immediately without calculating or reading it from input.
//
//
//        Simple Definition
//
//Literals are fixed values that are directly written in a Java program and do not change during execution.
//
//
//Example Breakdown:
//
//int number = 50;
//
//number -> Variable
//50     -> Literal (direct value)
//
//
//The program already knows the value 50 as soon as it reads the code, so it does not need to compute it.
//
//
//        -----------------------------------------------------------
//
//
//TYPES OF LITERALS IN JAVA
//
//Java divides literals into 5 main types.
//
//
//1. Integer Literals
//
//These represent whole numbers (without decimal points).
//
//Examples:
//int a = 100;
//int b = -20;
//
//(Other examples: 0, 25, -99, 5000)
//
//
//Different Base Forms
//Java allows integer literals to be written in different number systems:
//
//Decimal:      10      (Base 10, normal numbers)
//Binary:       0b1010  (Base 2, starts with 0b)
//Octal:        012     (Base 8, starts with 0)
//Hexadecimal:  0xA     (Base 16, starts with 0x)
//
//Example in code:
//int x = 0b1010; // This is the binary representation for 10
//
//
//-----------------------------------------------------------
//
//
//2. Floating-Point Literals
//
//These represent numbers with fractional parts (decimal points).
//
//Examples:
//float price = 10.5f;
//double pi = 3.14159;
//
//(Other examples: 10.5, 0.25, 3.14)
//
//
//IMPORTANT: Floating Point Requirement
//float literals must end with f or F, otherwise Java assumes they are double.
//
//Example:
//float x = 5.5f;

//
//-----------------------------------------------------------
//
//
//3. Character Literals
//
//These represent single characters and are always written inside single quotes ' '.
//
//Examples:
//char grade = 'A';
//char symbol = '$';
//
//(Other examples: 'A', 'b', '9', '#')
//
//
//Special characters (Escape Sequences):
//Sometimes characters represent actions rather than visual letters.
//
//char newline = '\n'; // Moves text to the next line
//char tab = '\t';     // Adds a large horizontal space
//-----------------------------------------------------------

//4. String Literals
//
//Strings represent a sequence of characters and are always written inside double quotes " ".
//A string can contain letters, numbers, and symbols.
//
//Examples:
//String name = "Mayank";
//String message = "Hello World";
//
//(Other examples: "Java", "Programming", "ChatGPT")

//        -----------------------------------------------------------
//5. Boolean Literals
//
//These represent logical values used heavily in decision-making and conditions.
//There are only two possible boolean literals:
//
//        - true
//        - false
//
//Examples:
//boolean isStudent = true;
//boolean isRainy = false;
//
//
//Used in conditions like:
//        if (isStudent) {
//        System.out.println("Discount applied");
//}
//        -----------------------------------------------------------

//KEY POINTS TO REMEMBER
//
//- Literals are fixed values written directly in code.
//        - They represent constant data.
//        - Java has exactly 5 main literal types:
//        1. Integer
//  2. Floating-point
//  3. Character
//  4. String
//  5. Boolean

//=========================================================
//----->LITERALS VS VARIABLES VS CONSTANTS IN JAVA
//
//
//1. LITERALS (The "Values")
//- A literal is a fixed value written directly in the code.
//- It is the data itself.
//- You cannot change a literal.
//- Example: 10, "Hello", 5.5, true
//
//        now many thinks why literal is a fixed ,like ex a=10 now a=11 so literal became 10 to 11
//        so The number 10 is a piece of data. You cannot make the number 10 suddenly represent the value 11.
//        In the universe of math and programming, 10 is always 10.
//        That is why it is called a "literal"—it is literally that value and nothing else.
//        The point is a is a variable here but literal is 10 a can be changed but a literal can't.
//
//2. VARIABLES (The "Containers")
//- A variable is a named storage location in memory.
//- It holds a value (literal) and can be changed during program execution.
//        - Syntax: dataType variableName = value;
//- Example: int age = 20; (Here, age is the variable)
//
//
//3. CONSTANTS (The "Locked Containers")
//- A constant is a variable whose value cannot be changed once assigned.
//        - In Java, we use the 'final' keyword to make a variable a constant.
//- By convention, constant names are written in ALL_CAPS.
//- Example: final double PI = 3.14;
//
//
//-----------------------------------------------------------
//
//
//COMPARISON TABLE
//
//Feature      | Literal            | Variable            | Constant (final)
//-------------|--------------------|---------------------|--------------------
//Definition   | The actual value   | Named storage       | Named storage
//Changeable?  | No (Fixed)         | Yes                 | No (Locked)
//Example      | 50                 | int x = 50;         | final int X = 50;
//Memory       | Hardcoded in code  | Allocated in RAM    | Allocated in RAM
//
//
//-----------------------------------------------------------
//
//
//REAL-WORLD ANALOGY
//
//- Literal:  The ACTUAL WATER (e.g., 500ml)
//- Variable: A BOTTLE that you can refill with different amounts of water.
//- Constant: A SEALED BOTTLE that you can never open or change once filled.
//
//
//        -----------------------------------------------------------
//
//
//
//
//public class Comparison {
//    public static void main(String[] args) {
//
//        // 1. Literal (The value 10)
//        System.out.println(10);
//
//        // 2. Variable (Can be changed)
//        int score = 50;
//        score = 60; // Allowed
//
//        // 3. Constant (Cannot be changed)
//        final int MAX_SCORE = 100;
//        // MAX_SCORE = 110; // This would cause an ERROR
//
//        System.out.println("Score: " + score);
//        System.out.println("Max Score: " + MAX_SCORE);
//    }
//}
//
//
//-----------------------------------------------------------
//
//
//QUICK SUMMARY
//
//- Literal  = The Data (e.g., 5)
//- Variable = The Label for data (e.g., x)
//- Constant = The Label for data that never changes (e.g., final X)
