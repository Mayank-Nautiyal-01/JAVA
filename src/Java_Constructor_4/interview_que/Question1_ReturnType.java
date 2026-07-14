// package Java_Constructor_4.interview_que;

public class Question1_ReturnType {

    int data;

    // 1. A VALID CONSTRUCTOR (No return type, same name as class)
    public Question1_ReturnType() {
        this.data = 100;
        System.out.println("Constructor Invoked: Object initialized with data = " + this.data);
    }

    // 2. THIS IS NOT A CONSTRUCTOR! It has a return type 'void'.
    // Even though the name matches the class name, the compiler treats this as a regular method.
    public void Question1_ReturnType() {
        System.out.println("Regular Method Invoked: This has a return type 'void'!");
    }

    public static void main(String[] args) {
        System.out.println("--- Question 1: Why do constructors not have a return type? ---");

        // Instantiating the object. The constructor runs automatically.
        Question1_ReturnType obj = new Question1_ReturnType();

        // Explicitly calling the method that has the same name as the class.
        // We have to call this using the dot operator because it is a normal method.
        obj.Question1_ReturnType();
    }
}

/*


1. THE 'new' OPERATOR PROTOCOL:
   In Java, instantiation is a two-step process handled by the JVM:
   a) 'new' Keyword: Allocates memory on the heap and returns the reference of the new object.
   b) Constructor: Executes code to initialize that allocated memory.
   
   Because the 'new' operator is already hardwired to return the reference of the newly created 
   object, the constructor itself does not need to return anything. It only initializes the state.

2. AVOID AMBIGUITY:
   If constructors were allowed to return a value (e.g., an integer), what would happen when we write:
       Question1_ReturnType obj = new Question1_ReturnType();
   
   Does 'new Question1_ReturnType()' evaluate to the object reference (so we can store it in 'obj')
   or does it evaluate to the returned integer? It would create syntax and type conflicts in the language.

3. METHOD COMPATIBILITY:
   If you accidentally add a return type to a constructor (like 'public void MyClass()'), Java does not
   throw a compile error. Instead, it silently treats it as a standard method. This is a common bug
   for beginners because the compiler expects you to call it like a regular method rather than
   initializing the object.
*/
