// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

public class ArrayTraversal_03 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};

         /*
            1. Traversal using for loop
        */

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        /*
            2. Traversal using enhanced for loop (for-each)
        */
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Traversal?

       - Visiting each element of array one by one

       Example:
       10 → 20 → 30 → 40 → 50


    2. Using normal for loop:

       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
       }

       - We use index (i)
       - arr.length gives size


    3. Using for-each loop:

       for (int value : arr) {
           System.out.print(value);
       }

       - No index needed
       - Directly gives element


    4. Difference:

       for loop:
           - index available
           - more control

       for-each:
           - simple
           - read-only traversal


    5. When to use:

       Use for loop:
           - when index needed
           - reverse traversal

       Use for-each:
           - simple printing
           - no modification


    6. Common Mistake:

       for (int i = 0; i <= arr.length; i++)  // wrong
       → should be < not <=


    7. Key Concept:

       "Traversal = accessing all elements one by one"


    8. One-line Revision:

       "Use loop to visit every element in array"
*/
