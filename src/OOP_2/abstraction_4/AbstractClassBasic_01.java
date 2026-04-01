package OOP_2.abstraction_4;

public class AbstractClassBasic_01 {
    public static void main(String[] args) {
        //creating obj using child class
        Emp e1=new Dev();

        //calling methods
        e1.work();//// abstract method (implemented in child)
        e1.attendance();// normal method (from abstract class)
    }
}

//abstract class
abstract class Emp{
    // constructor
    Emp(){
        System.out.println("Emp constructor called");
    }

    //abstract method
    abstract void work();

    //normal method
    void attendance(){
        System.out.println("Emp attendance marked");
    }
}

//child class
class Dev extends Emp{
    @Override
    void work() {
        System.out.println("Developer is coding");
    }
}