package JAVA_BASIC.Reference_Non_PrimitiveDataType.Type3_Interface;

interface  Engine{
    void start();
}

interface MusicSystem{
    void playMusic();
}
/*
    A class can implement multiple interfaces
    → this is how Java achieves multiple inheritance
*/
class Car implements Engine,MusicSystem{
    public void start(){
        System.out.println("engine starts");
    }
    public void playMusic(){
        System.out.println("Music is playing");
    }
}
public class MultipleInheritance_3 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.playMusic();

        //interface references
        Engine e=new Car();
        e.start();

        MusicSystem m=new Car();
        m.playMusic();
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Multiple Inheritance?

       - One class inheriting from multiple sources

       Java does NOT support:
           class A extends B, C  // not allowed

       But supports via interfaces:
           class A implements B, C  //  allowed


    2. Example:

       interface Engine {
           void start();
       }

       interface MusicSystem {
           void playMusic();
       }

       class Car implements Engine, MusicSystem { }


    3. Rule:
       - Class must implement ALL methods of ALL interfaces


    4. Method Implementation:

       public void start() { }
       public void playMusic() { }


    5. Interface References:

       Engine e = new Car();
       e.start();

       MusicSystem m = new Car();
       m.playMusic();


    6. Why Java allows this?

       - No ambiguity because:
         interfaces do NOT have method bodies (basic level)


    7. Real-world understanding:

       Car:
       - has Engine functionality
       - has Music system

       → combining multiple features


    8. Key Concept:

       "Java supports multiple inheritance using interfaces"


    9. Common Mistake:

       class Car implements Engine {
           // missing playMusic() → ERROR if MusicSystem also implemented
       }


    10. One-line Revision:

       "One class can implement multiple interfaces"
*/