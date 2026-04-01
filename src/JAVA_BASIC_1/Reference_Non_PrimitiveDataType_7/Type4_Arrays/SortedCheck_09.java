package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

public class SortedCheck_09 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        boolean isSorted = true;

        /*
            Check if array is sorted (ascending)
        */
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        /*
            Output
        */
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Goal:
       Check if array is sorted in ascending order

       Example:
       {10, 20, 30} → sorted
       {10, 30, 20} → not sorted


    2. Logic:

       Compare adjacent elements:

       arr[i] and arr[i + 1]

       if arr[i] > arr[i + 1]
           → not sorted


    3. Loop condition:

       for (i = 0; i < n - 1; i++)

       Why n-1?
       Because we compare i with i+1


    4. Example:

       arr = {10, 20, 15}

       Step:
       10 < 20 ✔
       20 > 15  → not sorted


    5. Boolean flag:

       isSorted = true initially
       change to false if condition breaks


    6. Optimization:

       break; → stops early if not sorted


    7. For descending order:

       if (arr[i] < arr[i + 1])
           → not sorted


    8. Common Mistake:

       i < arr.length   //  causes error at arr[i+1]


    9. Key Concept:

       "Compare adjacent elements"


    10. One-line Revision:

       "If any element is greater than next → not sorted"
*/


