package JAVA_BASIC;

public class skelton2 {
    public static void main(String[] args) {
        System.out.println("this class is all about  the skeleton of a Java Program | What is main method in Java ?");
    }
}
//    The Skeleton of a Java Program
//    Every Java program follows a specific structure or "skeleton." Understanding this structure is essential for writing even the simplest code.
//
//1. The Basic Skeleton
//    Here is the simplest possible Java program that does something:
//public class HelloWorld { // 1. Class Declaration
//
//    public static void main(String[] args) { // 2. Main Method
//
//        System.out.println("Hello, World!"); // 3. Executable Statement
//
//    }
//}
//    Breakdown of Components:
//    Class Declaration (public class HelloWorld):
//    In Java, every line of code must be inside a class.
//    The name of the class (e.g., HelloWorld) must exactly match the filename (HelloWorld.java).
//    Braces { }:
//    Curly braces define blocks of code.
//    The outer braces belong to the class; the inner braces belong to the method.
//            Statements (System.out.println):
//    These are instructions that the program performs.
//    Every statement in Java must end with a semicolon (;).
//            2. What is the main method?
//    The main method is the entry point of any Java application. When you run a Java program, the JVM looks for this specific method to start execution.
//
//    Signature Breakdown: public static void main(String[] args)
//    Keyword	Meaning
//    public	An Access Modifier. It means this method can be accessed from outside the class (specifically by the JVM).
//    static	Means the method belongs to the class itself, not to a specific object instances. The JVM can call it without creating an object of the class.
//    void	The Return Type. It means the method does not return any value after it finishes execution.
//    main	The Name of the method. This is the reserved name the JVM searches for to start the program.
//    String[] args	The Parameters. It is an array of strings used to receive command-line arguments when the program starts.
//            3. How to Run It
//    Write: Save the code as HelloWorld.java.
//            Compile: Run javac HelloWorld.java. This creates HelloWorld.class (Bytecode).
//    Run: Run java HelloWorld. The JVM enters through the main method and prints Hello, World!.
//}
