package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type4_Arrays;

public class ArraySumAverage_04 {
    public static void main(String[] args) {
        int[]arr= {10,20,30,40,50};
        int sum=0;

         /*
            Calculating sum
        */
        for(int value:arr){
           sum+=value;
        }

        //or
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }

        /*
            Calculating average
        */
        double average=(double)sum/arr.length;
        System.out.println("sum: "+sum);
        System.out.println("Avg: "+average);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Sum of array:

       int sum = 0;

       for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
       }


    2. Average formula:

       average = sum / number of elements

       Example:
       arr = {10, 20, 30}

       sum = 60
       average = 60 / 3 = 20


    3. Important Type Casting:

       double avg = (double) sum / arr.length;

       Why?
       - To avoid integer division
       - To get decimal value

      if we didnt make sum as double then - int / int = int (decimal lost)
      -Example:
       7 / 2 = 3  (not 3.5)

       = To get decimal:
       convert one operand to double

       (double) sum / arr.length

    4. Without casting:

       int avg = sum / arr.length;  // wrong gives integer only


    5. Using for-each (alternative):

       int sum = 0;
       for (int val : arr) {
           sum += val;
       }


    6. Key Concept:

       - Loop + accumulator (sum variable)


    7. Common Mistake:

       sum = arr[i];  //  wrong (overwrites value)

       Correct:
       sum = sum + arr[i];


    8. One-line Revision:

       "Use loop to accumulate sum, then divide for average"
*/