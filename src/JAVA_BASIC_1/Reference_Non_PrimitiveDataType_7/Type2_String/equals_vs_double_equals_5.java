// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type2_String;

public class equals_vs_double_equals_5 {

    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);  //false
        System.out.println(s1.equals(s2));//true

    }
}

//notes:==
//What is == in Java?
//        == compares references (memory addresses) when used with objects.
//
//Example:

//String a = "Java";
//String b = "Java";
//
//System.out.println(a == b);
//
//Output:true
//
//Why?
//
//Because both references point to the same object in the String Pool.
//
//Memory idea:
//
//a ----\
//        ---> "Java"
//b ----/

//What is .equals()?
//  .equals() compares the actual value/content of the object.
//
//Example:
//
//String a = new String("Java");
//String b = new String("Java");
//
//System.out.println(a.equals(b));
//
//Output: true
//
//Because both strings contain the same text "Java".

// so
//== compares object references, while .equals() compares the content of objects.
//Objects comparison → use equals()
//
//Reference comparison → use ==
