package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type2_String;

public class string_pool_3 {
    public static void main(String[] args) {
        System.out.println("As we already discussed string pool in string creation file " +
                "but lets see here too with little simple example");
        String s1="java";
        String s2="java";

        System.out.println(s1 == s2);//true

        String s3=new String("java");
        System.out.println(s1==s3); //false

    }
}
//notes:======================

//1️> What is String Pool?====
//
//The String Pool is a special memory area inside the heap where Java stores unique String literals.
//
//Purpose:
//
//i>Save memory
//
//ii>Reuse existing String objects

//   2>> Why first output is true---------------------
//String s1 = "Java";
//String s2 = "Java";
//
//Java checks the String Pool.
//
//        Memory:
//
//STACK                STRING POOL
//-----               -----------
//s1 --------\
//               ---> "Java"
//s2 --------/
//
//Both references point to same object.
//
//So:
//
//s1 == s2  → true

//        3>>> Why second output is false------------
//String s3 = new String("Java");
//
//new forces Java to create a new object in heap memory.
//
//Memory:
//
//STACK                HEAP / POOL
//-----                -----------
//s1 --------\
//             ---> "Java" (Pool)
//
//s3 -------------> "Java" (New Object)
//
//Now references are different.
//
//s1 == s3 → false


// 4>>>>Important Rule--------------
//Code	Object Creation
//"Java"	Stored in String Pool
//new String("Java")	New object in heap
//
//!!!!!!!!!!!!!!====Interview Point
//
//In Java:
//String literals are stored in the String Pool, and Java reuses them to save memory.