package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

public class ReverseArray_07 {
    public static void main(String[] args) {
        int []arr={10, 20, 30, 40, 50};
         /*
            Reverse using two-pointer approach
        */
        int start=0;
        int end=arr.length-1;
        while(start<end){
            //swap
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
                    start++;
                    end--;
        }
        System.out.println("reversed array:");

        for(int value:arr){
            System.out.println(value+" ");
        }
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Goal:
       Reverse array in-place

       Example:
       {10, 20, 30, 40}
       → {40, 30, 20, 10}


    2. Two-pointer approach:

       start → beginning
       end   → last index

       swap(arr[start], arr[end])


    3. Loop condition:

       while (start < end)


    4. Steps:

       Step 1:
       swap first and last

       Step 2:
       move inward:
       start++
       end--


    5. Example:

       arr = {10, 20, 30, 40}

       Step 1: {40, 20, 30, 10}
       Step 2: {40, 30, 20, 10}


    6. Why efficient?

       - No extra array used
       - Time: O(n)
       - Space: O(1)


    7. Common Mistake:

       while (start <= end)  //  unnecessary swap at center


    8. Alternative (extra array):

       int[] rev = new int[n];
       rev[i] = arr[n - 1 - i];


    9. Key Concept:

       "Swap elements from both ends"


    10. One-line Revision:

       "Reverse array using two pointers and swap"
*/

