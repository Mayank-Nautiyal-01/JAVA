// package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type3_Interface;

interface  Payment{
    /*
        Common method for all payment types
    */
    void pay(int amount);
}

class CreditCardPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid "+ amount +" using credit card");
    }
}

class UpiPayment implements Payment{
    public void pay(int amount){
        System.out.println("paid "+ amount +"using upi ");
    }
}

class CashPayment implements  Payment{
    public void pay(int amount){
        System.out.println("paid "+amount+" using cash");
    }
}
public class RealWorldExample_9 {
    public static void main(String[] args) {

        /*
            Real-world usage:
            Same interface → different implementations
        */

        Payment p;
         p=new CreditCardPayment();
         p.pay(1000);

//         CreditCardPayment c=new CreditCardPayment();
//         c.pay(2000);

         p=new UpiPayment();
         p.pay(500);

         p=new CashPayment();
         p.pay(200);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Real-world concept:

       Payment system:
       - Same action → pay()
       - Different ways → Card, UPI, Cash


    2. Interface design:

       interface Payment {
           void pay(int amount);
       }


    3. Different implementations:

       class CreditCardPayment implements Payment
       class UpiPayment implements Payment
       class CashPayment implements Payment


    4. Runtime behavior:

       Payment p;

       p = new CreditCardPayment();
       p.pay(1000);

       p = new UpiPayment();
       p.pay(500);

       → Same method call, different output


    5. Key Concept:

       - Loose coupling
       - Easy to extend

       Add new payment:
       class NetBanking implements Payment


    6. Advantage:

       - Code is flexible
       - No need to change existing logic


    7. Interview Point:

       "Interface helps in building scalable systems"


    8. One-line Revision:

       "One interface, many real-world implementations"
*/
