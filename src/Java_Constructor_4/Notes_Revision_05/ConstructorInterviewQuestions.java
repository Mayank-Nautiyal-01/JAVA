// package Java_Constructor_4.Notes_Revision_05;

public class ConstructorInterviewQuestions {
    public static void main(String[] args) {
        System.out.println("some comman ques and revision");
    }
}

/*
    =========================================
    CONSTRUCTORS - COMPLETE MASTER REVISION
    =========================================

    1. What is a Constructor?

       A constructor is a special method used to initialize objects.

       It is automatically called when an object is created.

       Example:

       class Student {
           Student() {
               System.out.println("Constructor called");
           }
       }

       Student s = new Student();
       → Constructor runs automatically


    2. Why do we need Constructors?

       Without constructor:
       - Object variables may remain uninitialized
       - Default values may not be meaningful

       Example:

       class Student {
           int age;
       }

       Student s = new Student();
       System.out.println(s.age);  // 0 (default, not useful)

       Using constructor:

       class Student {
           int age;

           Student() {
               age = 18;
           }
       }

       → Now object is initialized properly


    3. Can constructor have return type?

       No

       Example:

       class Student {
           void Student() {   // Not constructor
               System.out.println("Hello");
           }
       }

       → This is a METHOD, not constructor


    4. Can we overload constructor?

       Yes

       Example:

       class Student {

           Student() {
               System.out.println("Default");
           }

           Student(int age) {
               System.out.println("Age: " + age);
           }
       }

       Student s1 = new Student();      // Default
       Student s2 = new Student(20);    // Parameterized


    5. Can we override constructor?

       No

       Reason:
       - Constructor is NOT inherited
       - Overriding requires inheritance

       Example:

       class Parent {
           Parent() {
               System.out.println("Parent");
           }
       }

       class Child extends Parent {
           Child() {
               System.out.println("Child");
           }
       }

       Output:
       Parent
       Child

       → Not overriding, just execution order


    6. Default Constructor

       Provided by Java if no constructor is written

       Example:

       class Student {
           int age;
       }

       Internally:
       Student() { }

       Rule:
       If you write ANY constructor → default is removed


    7. Parameterized Constructor

       Used to pass values during object creation

       Example:

       class Student {
           int age;

           Student(int age) {
               this.age = age;
           }
       }

       Student s = new Student(20);


    8. Copy Constructor

       Used to copy values from another object

       Example:

       class Student {
           int age;

           Student(int age) {
               this.age = age;
           }

           Student(Student s) {
               this.age = s.age;
           }
       }

       Student s1 = new Student(20);
       Student s2 = new Student(s1);


    9. Constructor Overloading

       Multiple constructors with different parameters

       Example:

       class Student {

           Student() { }

           Student(int age) { }

           Student(int age, String name) { }
       }


    10. this() Keyword (Constructor Call)

        Used to call another constructor in same class

        Example:

        class Student {

            Student() {
                System.out.println("Default");
            }

            Student(int age) {
                this(); // calls default
            }
        }


    11. Constructor Chaining

        Calling one constructor from another

        Example:

        class Student {

            Student() {
                System.out.println("Default");
            }

            Student(int age) {
                this();
                System.out.println("One param");
            }

            Student(int age, String name) {
                this(age);
                System.out.println("Two param");
            }
        }

        Output order:
        Default → One param → Two param


    12. super() Keyword

        Calls parent class constructor

        Example:

        class Parent {
            Parent() {
                System.out.println("Parent");
            }
        }

        class Child extends Parent {
            Child() {
                super();
                System.out.println("Child");
            }
        }


    13. this() vs super()

        this()  → calls same class constructor
        super() → calls parent constructor

        Both cannot be used together
        because both must be first line


    14. Execution Order

        When object is created:

        1. Parent constructor
        2. Child constructor

        If chaining:
        → chain executes first


    15. Private Constructor

        Restricts object creation

        Example:

        class Demo {

            private Demo() { }

            static void show() {
                System.out.println("Access via method");
            }
        }

        Demo.show();


    16. Common Mistakes

        Writing return type in constructor
        Forgetting default constructor rule
        Using this()/super() not in first line
        Thinking constructor can be overridden


    17. Real-Life Understanding

        Constructor = Object setup phase

        Like:
        Buying phone → initial setup runs


    18. Ultimate One-Line Summary

        "Constructor initializes object at creation time,
         chaining avoids duplication,
         super() handles parent initialization"
*/
