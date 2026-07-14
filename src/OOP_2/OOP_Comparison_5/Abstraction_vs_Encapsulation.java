// package OOP_2.OOP_Comparison_5;

public class Abstraction_vs_Encapsulation {
    public static void main(String[] args) {

        /*
            Encapsulation Example
        */
        BankAccount acc = new BankAccount();
        acc.setBalance(1000);
        System.out.println("Balance: " + acc.getBalance());

        /*
            Abstraction Example
        */
        Payment p = new UPI();
        p.pay();
    }
}

/*
    Encapsulation Example
*/
class BankAccount {

    private int balance;

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}

/*
    Abstraction Example
*/
abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using UPI");
    }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

-- sometime people get confuse b/w these two so here it is differentiate:
    1. Encapsulation:

       - Hides data using private variables
       - Access controlled via getter/setter

       Focus: Data protection


    2. Abstraction:

       - Hides implementation details
       - Shows only functionality

       Focus: Simplification


    3. Key Difference:

       Encapsulation → "How data is protected"
       Abstraction → "How complexity is hidden"


    4. Relationship:

       Encapsulation helps achieve abstraction


    5. One-line Revision:

       Encapsulation = data hiding
       Abstraction = implementation hiding
*/
