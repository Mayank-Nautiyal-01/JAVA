package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type4_Arrays;

public class SecondLargest_08 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 30, 50};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int value:arr){
            if(value>largest){
                secondLargest=largest;
                largest=value;
            }
            else if(value>secondLargest && value!=largest){
                secondLargest=value;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Goal:
       Find second largest element in array

       Example:
       {10, 20, 40, 30}
       → Largest = 40
       → Second Largest = 30


    2. Logic:

       Maintain two variables:
       - largest
       - secondLargest


    3. Steps:

       for each element:

       if value > largest:
           secondLargest = largest
           largest = value

       else if value > secondLargest AND value != largest:
           secondLargest = value


    4. Why Integer.MIN_VALUE?

       - Handles negative numbers
       - Ensures proper comparison


    5. Example:

       arr = {5, 10, 8}

       largest = 10
       secondLargest = 8


    6. Edge Case:

       arr = {10, 10, 10}

       → No second largest


    7. Common Mistake:

       Not checking:
       value != largest

       → may give duplicate value


    8. Time Complexity:

       O(n) (single loop)


    9. Key Concept:

       "Track top two values while traversing"


    10. One-line Revision:

       "Update largest and secondLargest together"
*/