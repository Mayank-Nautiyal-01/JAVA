package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type4_Arrays;

/*
    File: Array2DBasic_10.java
*/

public class Array2DBasic_10 {
    public static void main(String[] args) {

        /*
            2D Array Declaration + Allocation
            (3 rows, 3 columns)
        */
        int[][] matrix = new int[3][3];

        /*
            Initialization
        */
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        /*
            Accessing elements
        */
        System.out.println("Element at [0][0]: " + matrix[0][0]);
        System.out.println("Element at [2][1]: " + matrix[2][1]);

        /*
            Shortcut initialization
        */
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60}
        };

        System.out.println("Shortcut element: " + arr[1][2]);
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is 2D Array?

       - Array of arrays
       - Represents matrix (rows × columns)

       Example:
       int[][] arr = new int[3][3];


    2. Structure:

       matrix[row][column]

       Example:
       matrix[1][2]


    3. Steps:

       (A) Declaration:
           int[][] arr;

       (B) Allocation:
           arr = new int[3][3];

       (C) Initialization:
           arr[0][0] = 1;


    4. Shortcut:

       int[][] arr = {
           {1, 2},
           {3, 4}
       };


    5. Indexing:

       - Row index → outer
       - Column index → inner


    6. Default values:

       int → 0


    7. Common Mistake:

       arr[3][3]  // out of bounds


    8. Key Concept:

       "2D array = rows and columns"


    9. One-line Revision:

       "matrix[row][col] represents element position"
*/

