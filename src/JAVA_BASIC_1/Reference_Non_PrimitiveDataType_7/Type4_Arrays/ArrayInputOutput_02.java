// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

import java.util.Scanner;

public class ArrayInputOutput_02 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      /*
            Taking size of array from user
        */
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[]arr=new int[n];

                /*
            Taking input
        */
        System.out.println("Enter " + n + " elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        /*
            Printing output
        */
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Taking input in array:

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int[] arr = new int[n];


    2. Input loop:

       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }


    3. Output loop:

       for (int i = 0; i < n; i++) {
           System.out.print(arr[i]);
       }


    4. Example:

       Input:
       n = 3
       elements = 10 20 30

       Output:
       10 20 30


    5. Important Concept:

       - Array size can be dynamic (user input)
       - Loop is required for input/output


    6. Common Mistakes:

       (A) Using wrong index:
           arr[n]  //  out of bounds

       (B) Forgetting loop:
           Only arr[0] taken → incomplete input


    7. Extra:

       sc.close();  // good practice


    8. One-line Revision:

       "Use loop to take and print array input"
*/
