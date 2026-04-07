package Memory_Management_and_Garbage_Collection_5.MemoryTypes_02;

public class StackMemory_01 {
    public static void main(String[] args) {
        int a=10; //local variable
        int b=20;

        //method call
        display(a);
        System.out.println("main method ends");
    }
    static void display(int x){
        int y=50; //local variable

        System.out.println("Display method running");
    }
}
/*
    =========================================
    STACK MEMORY - DEEP UNDERSTANDING
    =========================================

    1. What is Stack Memory?

       Stack memory is used to store:
       - Method calls
       - Local variables
       - References


    2. Stack Frame Concept (IMPORTANT)

       Each method call creates a separate block
       called "stack frame"

       Example:
       main() → one frame
       display() → another frame


    3. Execution Flow:

       main() starts
       → variables a, b stored in stack

       display(a) is called
       → new stack frame created
       → x and y stored in this frame

       display() ends
       → its frame is destroyed

       main() continues


    4. Memory Behavior:

       Stack works on LIFO (Last In First Out)

       Last method called → first removed


    5. Example Visualization:

       Stack:

       -----------------
       display() frame
       x = 10
       y = 50
       -----------------
       main() frame
       a = 10
       b = 20
       -----------------


    6. Important Points:

       - Stack memory is fast
       - Automatically managed
       - No garbage collection needed


    7. Key Concept:

       "Each method call gets its own stack frame"


    8. When is memory removed?

       When method finishes execution


    9. Common Mistake:

       Thinking objects are stored in stack --wrong


    right==>      Only references are stored in stack


    10. One-line Revision:

        "Stack stores method calls and local variables using LIFO"
*/