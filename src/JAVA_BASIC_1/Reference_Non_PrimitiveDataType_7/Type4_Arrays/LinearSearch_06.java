package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

public class LinearSearch_06 {
    public static void main(String[] args) {
        int []arr={10, 20, 30, 40, 50};
        int target=30;
        int index=-1; //default:not found
     /*
            Linear Search
        */

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break; //stop once found
            }
        }

        if(index!=-1){
            System.out.println("element found at index:"+index);
        }
        else{
            System.out.println("Element not found");
        }
    }

}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Linear Search?

       - Searching element one by one from start

       Example:
       arr = {10, 20, 30, 40}

       target = 30

       → check 10 → 20 → 30 ✔ found


    2. Logic:

       for each element:
           if element == target
               return index


    3. Why index = -1?

       - Indicates "not found"
       - Valid indices start from 0


    4. Break statement:

       - Stops loop when element is found
       - Improves efficiency


    5. Example:

       Input:
       arr = {5, 10, 15}
       target = 10

       Output:
       Element found at index: 1


    6. Time Complexity:

       Worst case → O(n)
       (checks all elements)


    7. Common Mistake:

       if (arr[i] = target)  // ❌ assignment
       should be:
       if (arr[i] == target)


    8. Using for-each (not ideal):

       for (int val : arr) {
           if (val == target) { }
       }

       → index not available


    9. Key Concept:

       "Compare each element until found"


    10. One-line Revision:

       "Linear search checks elements one by one"
*/