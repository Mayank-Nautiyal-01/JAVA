package OOP_2.encapsulation_1;

public class EncapsulationBasic_01 {
    public static void main(String[] args) {
        BankAccount  acc=new BankAccount();
        // directly access not allowed like:
        // acc.balance=1000; //error (private var)

        //accessing using methods
        acc.setBalance(1000);
        System.out.println("Balance: " + acc.getBalance());

        /*
            Trying invalid operation
        */
        acc.setBalance(-500);   // validation check

    }
}

//class with encapsulation

class BankAccount{
        //private var(hidden data)
        private int balance;
        //setter method
        void setBalance(int balance){
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

        //getter method
        int getBalance(){
            return balance;
        }
}


/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. Basic Idea of Encapsulation:

       - Variables are made private
       - Access is provided through methods

       This prevents direct modification of data.


    2. Why private?

       If variables are public:

       acc.balance = -1000;   Wrong data allowed

       With private:
       Direct access is blocked → safer


    3. Role of Getter and Setter:

       Setter:
       - Used to set/update value
       - Can include validation

       Getter:
       - Used to read/access value


    4. Validation Concept:

       setBalance(int balance) checks:

       if (balance >= 0)

       This ensures only valid data is stored.


    5. Data Protection:

       - External code cannot directly change data
       - Only allowed operations are performed


    6. Key Difference:

       Without Encapsulation:
       - No control over data

       With Encapsulation:
       - Full control + validation


    7. Key Concept:

       "Encapsulation protects data by restricting direct access
        and allowing controlled modification"


    8. One-line Revision:

       "Make variables private, access them using methods"
*/