package Java_Constructor_4.ConstructorConcepts_03;


public class ThisKeyword_02 {
    public static void main(String[] args) {

        Student5 obj = new Student5(20, "Mayank");

        obj.display();
    }
}

/*
    Class demonstrating this keyword
*/
class Student5 {

    int age;
    String name;

    // constructor using this keyword
    Student5(int age, String name) {

        this.age = age;     // refers to instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
/*
    =========================
    NOTES + REVISION EXAMPLES
    =========================

    1. What is 'this' keyword?

       'this' refers to current object


    2. Key Use:

       To differentiate instance variables
       from parameters


    3. Example Understanding:

       this.age = age

       → left side = instance variable
       → right side = parameter


    4. Why needed?

       When variable names are same


    5. Important Point:

       Without 'this', compiler gets confused


    6. Other Use:

       Can be used to call constructor (this())


    7. Concept:

       "this = current object reference"


    8. One-line Revision:

       "'this' refers to current object"
*/