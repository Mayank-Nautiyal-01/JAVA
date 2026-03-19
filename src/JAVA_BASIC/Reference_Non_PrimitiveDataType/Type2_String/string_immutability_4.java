package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type2_String;

public class string_immutability_4 {

        public static void main(String[] args) {

            String s1 = "Hello";
            String s2 = s1.concat(" World");

            System.out.println(s1);
            System.out.println(s2);
        }
    }
// notes=====

//1️>What is String Immutability?
//
//Immutability means the object cannot be changed after it is created.

//A String object cannot be modified once it is created.

//Example
//public class StringImmutability {
//
//    public static void main(String[] args) {
//
//        String s = "Hello";
//
//        s.concat(" World");
//
//        System.out.println(s); // hello
//    }
//}

// ques>>>>>Why didn't it change?
//
//Because concat() creates a new String object, it does not modify the old one.
//
//Memory idea:
//
//Before concat:
//
//s -----> "Hello"
//
//
//After concat:
//
//s  -----> "Hello"
//        |
//         ---> "Hello World"  (new object)
//
//But since we didn't store "Hello World" anywhere, s still points to "Hello".

// if---- > s = s.concat(" World");
//
//        System.out.println(s); // hello world  coz Now s stores the reference of the new object.


//Why Java made String immutable
//
// => In Java, Strings are immutable because it helps with:
//i>Security
//ii>String Pool memory optimization
//iii>Thread safety
//iv>Performance in caching

//------------------------

//One-line Interview Answer

//String is immutable in Java, which means once
//a String object is created, its value cannot be changed;
//any modification creates a new object.