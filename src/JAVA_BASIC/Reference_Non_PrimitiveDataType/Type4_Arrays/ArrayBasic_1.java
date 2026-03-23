package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type4_Arrays;

public class ArrayBasic_1 {
    public static void main(String[] args) {

        /*
            1. Declaration
        */
        int[] arr;

        /*
            2. Allocation (memory creation)
        */
        arr = new int[5];

        /*
            3. Initialization
        */
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /*
            Accessing elements
        */
        System.out.println("First element: " + arr[0]);
        System.out.println("Third element: " + arr[2]);

        /*
            Shortcut way (declare + initialize)
        */
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Second array first element: " + nums[0]);
    }
    }
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Array?

       - Collection of similar data types
       - Stored in continuous memory

       Example:
       int[] arr = new int[5];


    2. Steps to create array:

       (A) Declaration:
           int[] arr;

       (B) Allocation:
           arr = new int[5];

       (C) Initialization:
           arr[0] = 10;


    3. Shortcut:

       int[] arr = {10, 20, 30};


    4. Indexing:

       - Starts from 0
       - Ends at size-1

       Example:
       arr[0] → first element
       arr[4] → last element (if size = 5)


    5. Default values:

       int → 0
       double → 0.0
       boolean → false
       String → null


    6. Common Mistake:

       arr[5] = 100;  //  ArrayIndexOutOfBounds


    7. Key Concept:

       "Array uses index to store and access data"


    8. One-line Revision:

       "Array = fixed size collection of same data type"
*/