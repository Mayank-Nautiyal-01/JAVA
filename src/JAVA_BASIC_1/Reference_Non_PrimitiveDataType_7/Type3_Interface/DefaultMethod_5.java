// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type3_Interface;
interface  Animal2{
    void sound();// abstract method
    /*
    *  Default method(java 8 feature)
    *  has body
    *  not compulsory to override
    * */

    default  void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog1 implements  Animal2{
    public void sound(){
        System.out.println("Dog barks");
    }
    /*
        Optional: overriding default method
    */
    public void sleep(){
        System.out.println("dog sleeps");
    }
}

class Cat1 implements  Animal2{
    public void sound(){
        System.out.println("cat meows");
    }

    // Not overriding sleep(), will use default version
}
public class DefaultMethod_5 {
    public static void main(String[] args) {
        Dog1 d= new Dog1();
        d.sound();
        d.sleep(); //overridden version

        Cat1 c=new Cat1();
        c.sound();
        c.sleep();// default version from interface
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Default Method?

       - A method inside interface WITH body
       - Introduced in Java 8

       Syntax:
       default void methodName() {
           // body
       }


    2. Why it was introduced?

       - To add new methods in interface without breaking old classes


    3. Example:

       interface A {
           default void show() {
               System.out.println("Hello");
           }
       }


    4. Rule:

       - Not mandatory to override
       - Class can use it directly


    5. Overriding default method:

       class Test implements A {
           public void show() {
               System.out.println("Overridden");
           }
       }


    6. Without overriding:

       class Test implements A { }

       Test t = new Test();
       t.show();  // calls default method


    7. Key Concept:

       - Interface can now have behavior (not just rules)


    8. Common Confusion:

       Interface earlier → only abstract methods
       Now → can have default + static methods


    9. Real-world thinking:

       - Common behavior shared by all classes
       - But still allows customization


    10. One-line Revision:

       "Default method = method with body inside interface"
*/
