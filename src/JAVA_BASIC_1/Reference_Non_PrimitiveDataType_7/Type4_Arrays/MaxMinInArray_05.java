// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

public class MaxMinInArray_05 {
    public static void main(String[] args) {
        int[]arr= {10, 5, 30, 2, 50};

        /*
            Assume first element as max and min
        */
        int max=arr[0];
        int min=arr[0];
         /*
            Traverse array
        */
        for(int value:arr){
            if(value>max){
                max=value;
            }
            if(value<min){
                min=value;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Logic:

       Step 1:
       Assume:
       max = arr[0]
       min = arr[0]

       Step 2:
       Compare each element


    2. Example:

       arr = {10, 5, 30, 2, 50}

       max → 10 → 30 → 50
       min → 10 → 5 → 2


    3. Core Conditions:

       if (value > max)
           max = value;

       if (value < min)
           min = value;


    4. Why start with arr[0]?

       - Ensures valid comparison
       - Avoids incorrect default values


    5. Common Mistake:

       int max = 0;   //  wrong if all values are negative

       Example:
       arr = {-10, -5, -2}
       → max will be wrong


    6. Alternative using for loop:

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > max)
               max = arr[i];
       }


    7. Key Concept:

       "Keep updating max and min while traversing"


    8. One-line Revision:

       "Initialize with first element, then compare all"
*/
