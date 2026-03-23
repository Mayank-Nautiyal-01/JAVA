package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type4_Arrays;

public class Array2DTraversal_11 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        /*
            Traversal using nested loops
        */
        System.out.println("2D Array Traversal:");

        for (int i = 0; i < matrix.length; i++) {            // rows

            for (int j = 0; j < matrix[i].length; j++) {     // columns
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();  // move to next row
        }
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Traversal in 2D array:

       - Use nested loops

       Outer loop → rows
       Inner loop → columns


    2. Structure:

       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               arr[i][j];
           }
       }


    3. Why matrix[i].length?

       - Each row can have different size
       - Safer than fixed column value


    4. Example:

       matrix = {
           {1, 2},
           {3, 4}
       }

       Output:
       1 2
       3 4


    5. Important Concept:

       matrix.length → number of rows
       matrix[i].length → number of columns


    6. Common Mistake:

       for (int j = 0; j < matrix.length; j++)  //  wrong
       → should use matrix[i].length


    7. Alternative (for-each):

       for (int[] row : matrix) {
           for (int val : row) {
               System.out.print(val);
           }
       }


    8. Key Concept:

       "Nested loop is required for 2D traversal"


    9. One-line Revision:

       "Outer loop → row, Inner loop → column"
*/
