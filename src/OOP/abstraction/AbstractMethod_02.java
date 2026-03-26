package OOP.abstraction;

public class AbstractMethod_02 {
    public static void main(String[] args) {
       //using abstract reference
        Shape s;
        s=new Circle();
        s.draw();
        s=new Rectangle();
        s.draw();
    }
}

//abstract class
abstract class Shape{
    //abstract method
    abstract void draw();
}
//child class 1
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is Abstract Method?

       An abstract method is a method declared without
       implementation (no body).

       Example:
       abstract void draw();


    2. Rules of Abstract Method:

       - Must be inside abstract class
       - Must not have body
       - Must be implemented in child class
       - If not implemented → child must also be abstract


    3. Key Concept:

       Parent defines "WHAT to do"
       Child defines "HOW to do"


    4. Important Restrictions:

       ❌ Cannot be private
       ❌ Cannot be static
       ❌ Cannot be final

       Because it must be overridden


    5. Example Flow:

       Shape s = new Circle();
       s.draw();

       Output:
       "Drawing Circle"


    6. Why Abstract Method?

       - To enforce implementation in child classes
       - To provide a common contract


    7. Real-World Example:

       Shape:
       - All shapes must draw

       But:
       - Circle draws differently
       - Rectangle draws differently


    8. One-line Revision:

       "Abstract method = method without body, implemented by child"
*/