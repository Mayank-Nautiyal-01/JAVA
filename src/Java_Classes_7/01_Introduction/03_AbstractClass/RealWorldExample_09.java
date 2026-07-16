// package Java_Classes_7._01_Introduction._03_AbstractClass;

abstract class Bank {

    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Concrete Method
    void displayBank() {
        System.out.println("Bank : " + bankName);
    }

    // Abstract Method
    abstract double calculateInterest();
}

class SBI extends Bank {

    SBI() {
        super("State Bank of India");
    }

    @Override
    double calculateInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {

    HDFC() {
        super("HDFC Bank");
    }

    @Override
    double calculateInterest() {
        return 7.2;
    }
}

public class RealWorldExample_09 {

    public static void main(String[] args) {

        System.out.println("========== Real World Example of Abstract Class ==========\n");

        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        sbi.displayBank();
        System.out.println("Interest Rate : " + sbi.calculateInterest() + "%");

        System.out.println();

        hdfc.displayBank();
        System.out.println("Interest Rate : " + hdfc.calculateInterest() + "%");
    }
}

/*
 * =========================================================
 * REAL-WORLD EXAMPLE OF ABSTRACT CLASS
 * =========================================================
 * 
 * Problem Statement
 * ---------------------------------------------------------
 * 
 * Suppose we are developing software for multiple banks.
 * 
 * Every bank has
 * 
 * ✔ Bank Name
 * 
 * ✔ Interest Rate
 * 
 * The bank name can be shared.
 * 
 * However,
 * 
 * every bank has a different interest rate.
 * 
 * Examples
 * 
 * SBI
 * 
 * ↓
 * 
 * 6.5%
 * 
 * HDFC
 * 
 * ↓
 * 
 * 7.2%
 * 
 * ICICI
 * 
 * ↓
 * 
 * 6.9%
 * 
 * Punjab National Bank
 * 
 * ↓
 * 
 * 6.8%
 * 
 * The common information should be written once,
 * while the different behaviour should be implemented
 * by each bank separately.
 * 
 * This is where an Abstract Class is useful.
 * 
 * ---------------------------------------------------------
 * 
 * Program Structure
 * ---------------------------------------------------------
 * 
 * Bank (Abstract)
 * 
 * displayBank()
 * 
 * calculateInterest()
 * 
 * ▲
 * 
 * ----------------------------
 * 
 * | |
 * 
 * SBI HDFC
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * abstract class Bank
 * 
 * Represents the common parent class.
 * 
 * It stores
 * 
 * ✔ Bank Name
 * 
 * Provides
 * 
 * ✔ displayBank()
 * 
 * Requires
 * 
 * ✔ calculateInterest()
 * 
 * ---------------------------------------------------------
 * 
 * String bankName;
 * 
 * Stores the name of every bank.
 * 
 * Every child class inherits this variable.
 * 
 * ---------------------------------------------------------
 * 
 * Bank(String bankName)
 * 
 * Parent constructor.
 * 
 * Initializes the common data.
 * 
 * ---------------------------------------------------------
 * 
 * displayBank()
 * 
 * Concrete Method.
 * 
 * All banks display their name in the same way.
 * 
 * Therefore one implementation is enough.
 * 
 * ---------------------------------------------------------
 * 
 * abstract double calculateInterest();
 * 
 * Abstract Method.
 * 
 * Each bank has its own interest rate.
 * 
 * So every child class must provide its own implementation.
 * 
 * ---------------------------------------------------------
 * 
 * class SBI
 * 
 * Inherits everything from Bank.
 * 
 * Implements calculateInterest().
 * 
 * Returns
 * 
 * 6.5%
 * 
 * ---------------------------------------------------------
 * 
 * class HDFC
 * 
 * Also inherits Bank.
 * 
 * Returns
 * 
 * 7.2%
 * 
 * ---------------------------------------------------------
 * 
 * Program Output
 * ---------------------------------------------------------
 * 
 * Bank : State Bank of India
 * 
 * Interest Rate : 6.5%
 * 
 * Bank : HDFC Bank
 * 
 * Interest Rate : 7.2%
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * ---------------------------------------------------------
 * 
 * Stack Memory
 * 
 * sbi ------------------------+
 * 
 * |
 * 
 * ▼
 * 
 * SBI Object
 * 
 * ------------
 * 
 * Bank Part
 * 
 * bankName
 * 
 * displayBank()
 * 
 * ------------
 * 
 * SBI Part
 * 
 * calculateInterest()
 * 
 * ---------------------------------------------------------
 * 
 * Why not create Bank objects?
 * ---------------------------------------------------------
 * 
 * Can we write
 * 
 * Bank bank = new Bank();
 * 
 * No.
 * 
 * Reason
 * 
 * A generic Bank has no fixed interest rate.
 * 
 * Only specific banks like SBI, HDFC, ICICI, etc.,
 * know their own interest rate.
 * 
 * Therefore,
 * 
 * Bank is declared abstract.
 * 
 * ---------------------------------------------------------
 * 
 * Where are Abstract Classes used?
 * ---------------------------------------------------------
 * 
 * Java Libraries
 * 
 * Examples
 * 
 * InputStream
 * 
 * Reader
 * 
 * Writer
 * 
 * Collection
 * 
 * AbstractList
 * 
 * AbstractMap
 * 
 * Frameworks
 * 
 * Spring Framework
 * 
 * Hibernate
 * 
 * Android SDK
 * 
 * Game Engines
 * 
 * Enterprise Applications
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * ---------------------------------------------------------
 * 
 * ✔ Common code is written once.
 * 
 * ✔ Duplicate code is avoided.
 * 
 * ✔ Easy to maintain.
 * 
 * ✔ Easy to extend by adding new banks.
 * 
 * ---------------------------------------------------------
 * 
 * Real-Life Examples
 * ---------------------------------------------------------
 * 
 * Vehicle
 * 
 * ↓
 * 
 * Car
 * 
 * Bike
 * 
 * Truck
 * 
 * ---------------------------------------------------------
 * 
 * Employee
 * 
 * ↓
 * 
 * Developer
 * 
 * Tester
 * 
 * Manager
 * 
 * ---------------------------------------------------------
 * 
 * Shape
 * 
 * ↓
 * 
 * Circle
 * 
 * Rectangle
 * 
 * Triangle
 * 
 * ---------------------------------------------------------
 * 
 * Payment
 * 
 * ↓
 * 
 * UPI
 * 
 * Credit Card
 * 
 * Debit Card
 * 
 * Net Banking
 * 
 * ---------------------------------------------------------
 * 
 * Interview Trap
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Why not make Bank a normal class?
 * 
 * Answer
 * 
 * Because a generic bank does not have a single
 * implementation of calculateInterest().
 * 
 * Every bank calculates interest differently.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Why not create separate classes without inheritance?
 * 
 * Answer
 * 
 * That would duplicate
 * 
 * bankName
 * 
 * displayBank()
 * 
 * and other common functionality.
 * 
 * Inheritance removes duplication.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * ---------------------------------------------------------
 * 
 * Q1.
 * 
 * Why is Bank declared abstract?
 * 
 * Because it represents a general concept that should not
 * be instantiated directly.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Which method is abstract?
 * 
 * calculateInterest()
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * Which method is concrete?
 * 
 * displayBank()
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * Can more banks be added later?
 * 
 * Yes.
 * 
 * Simply extend Bank and implement calculateInterest().
 * 
 * ---------------------------------------------------------
 * 
 * Q5.
 * 
 * What principle is followed here?
 * 
 * Code Reuse through Inheritance and Abstraction.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * ---------------------------------------------------------
 * 
 * ✔ Parent stores common data.
 * 
 * ✔ Parent provides common methods.
 * 
 * ✔ Parent declares abstract methods.
 * 
 * ✔ Child classes implement abstract methods.
 * 
 * ✔ Objects are created only for child classes.
 * 
 * =========================================================
 */