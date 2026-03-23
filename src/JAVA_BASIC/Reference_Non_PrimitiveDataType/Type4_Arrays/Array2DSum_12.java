package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type4_Arrays;

public class Array2DSum_12 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        /*
            Calculating sum of all elements
        */
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Goal:
       Find sum of all elements in 2D array

       Example:
       {1,2}
       {3,4}

       Sum = 1+2+3+4 = 10


    2. Logic:

       Use nested loops:
       - Outer → rows
       - Inner → columns

       sum += matrix[i][j];


    3. Example:

       matrix = {
           {1, 2},
           {3, 4}
       }

       Steps:
       sum = 0 → 1 → 3 → 6 → 10


    4. Alternative (for-each):

       int sum = 0;

       for (int[] row : matrix) {
           for (int val : row) {
               sum += val;
           }
       }


    5. Key Concept:

       "Traverse entire matrix and accumulate values"


    6. Time Complexity:

       O(rows × columns)


    7. Common Mistake:

       Using single loop →  not enough


    8. One-line Revision:

       "Use nested loops to sum 2D array"
*/