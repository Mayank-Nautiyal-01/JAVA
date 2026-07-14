// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type2_String;

public class string_methods_5 {
    public static void main(String[] args) {

        String str = "Hello Java";

        // length()
        System.out.println(str.length()); //10

        // charAt()
        System.out.println(str.charAt(1)); //e

        // substring()

        System.out.println(str.substring(0,5));//Hello

        // toUpperCase()
        System.out.println(str.toUpperCase());//Hello Java

        // toLowerCase()
        System.out.println(str.toLowerCase());//hello java

        // contains()
        System.out.println(str.contains("Java")); //true
    }
}
// we will see these method more in methods part
// remember:Even these methods
// do not change the original string because Strings are immutable in Java.

// and
//String methods never modify the original object; they create a new String object.
