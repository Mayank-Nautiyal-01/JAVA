package JAVA_BASIC;

public class DecisionMaking7 {
    public static void main(String[] args) {
        System.out.println("everything about decision making:");
    }
}
//DECISION-MAKING IN JAVA (THE COMPLETE GUIDE)
//
//Definition:
//Decision-making structures require the programmer to specify one or more conditions to be evaluated or tested by the program.
//If the condition is true, a specific block of code runs. If false, another block can run.

//1. THE SIMPLE 'IF' STATEMENT::
//Use this when you only care if something IS true. If it is false, the program just skips it.
//
//        Example:
//int age = 20;
//if (age >= 18) {
//        System.out.println("You are an adult.");
//}

//2. THE 'IF-ELSE' STATEMENT (Binary Choice)::
//Use this when you have two paths: one for true, and one for false.
//
//Example:
//int number = 13;
//if (number % 2 == 0) {
//        System.out.println("Even Number");
//} else {
//        System.out.println("Odd Number");
//}

//3. THE 'IF - ELSE IF - ELSE' STAIRCASE::
//Use this when you have multiple different conditions to check in a specific order.
//
//Example:
//int marks = 85;
//if (marks >= 90) {
//        System.out.println("Grade A+");
//} else if (marks >= 75) {
//        System.out.println("Grade A");
//} else if (marks >= 50) {
//        System.out.println("Grade B");
//} else {
//        System.out.println("Fail");
//}

//4. NESTED 'IF' STATEMENT::
//This is an 'if' statement inside another 'if' statement. It is used for "double checking."
//
//Example:
//int age = 25;
//boolean hasLicense = true;
//
//if (age >= 18) {
//        if (hasLicense) {
//        System.out.println("You can drive.");
//    } else {
//            System.out.println("You need a license first.");
//    }
//}

//5. THE 'SWITCH' STATEMENT::
//The switch statement is used to select one of many code blocks to be executed based on a single variable.
//
//Key Features:
//        - 'break': Exits the switch block immediately. If you forget it, the program will "fall through" and run the next case too!
//        - 'case': A specific value to check.
//- 'default': Runs if none of the cases match.
//
//        Example:
//int day = 2;
//switch (day) {
//        case 1:
//        System.out.println("Monday");
//        break;
//                case 2:
//                System.out.println("Tuesday");
//        break;
//default:
//        System.out.println("Invalid day");
//}


//
//MODERN JAVA SWITCH (JAVA 14+)=================
//Modern Java has introduced powerful new features for `switch`.
//
//        1. THE ARROW SYNTAX (->)
//        - No more writing `break` or `:`, avoiding "fall-through" errors.
//- Syntax: case VALUE -> code_to_run;
//
//2. SWITCH AS AN EXPRESSION
//- Switch can now return a value directly into a variable.
//        - Example:
//String type = switch(day) {
//    case 1, 2, 3, 4, 5 -> "Weekday";
//    case 6, 7 -> "Weekend";
//    default -> "Invalid";
//};
//
//3. 'YIELD' KEYWORD
//- Used if a case needs multiple lines of code before returning a value.
//- Example:
//int result = switch (input) {
//    case "A" -> {
//        // multiple lines...
//        yield 100;
//    }
//    default  -> 0;
//};


//6. THE TERNARY OPERATOR (Shorthand If-Else)
//It is the only operator that acts like a decision-maker on a single line.
//
//        Syntax: result = (condition) ? trueValue : falseValue;
//
//Example:
//int time = 20;
//String result = (time < 18) ? "Good Day" : "Good Evening";

