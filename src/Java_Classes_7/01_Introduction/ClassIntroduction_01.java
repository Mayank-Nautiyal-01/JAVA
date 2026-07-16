
public class ClassIntroduction_01 {

    // Class Definition
    static class Student {

        // Instance Variables (Attributes)
        String name;
        int age;

        // Constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method
        void displayInfo() {
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
        }
    }

    public static void main(String[] args) {

        System.out.println("========== Introduction to Java Classes ==========\n");

        // Creating Objects
        Student s1 = new Student("Mayank", 21);
        Student s2 = new Student("Rahul", 22);

        // Calling Methods
        s1.displayInfo();

        System.out.println();

        s2.displayInfo();
    }
}

/*
 * =========================================================
 * INTRODUCTION TO JAVA CLASSES
 * =========================================================
 * 
 * What is a Class?
 * ---------------------------------------------------------
 * 
 * A Class is a blueprint or template used to create
 * objects.
 * 
 * It defines
 * 
 * • Data (Variables)
 * 
 * • Behaviour (Methods)
 * 
 * Think of a class as a design or plan.
 * 
 * The actual object is created from that plan.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * A Class is a user-defined data type that groups
 * variables and methods together into a single unit.
 * 
 * ---------------------------------------------------------
 * 
 * Real-Life Example
 * 
 * Blueprint
 * 
 * ↓
 * 
 * House
 * 
 * The blueprint describes
 * 
 * • Number of Rooms
 * 
 * • Windows
 * 
 * • Doors
 * 
 * • Kitchen
 * 
 * But you cannot live inside a blueprint.
 * 
 * Only after building the house
 * does it become useful.
 * 
 * Similarly,
 * 
 * Student
 * 
 * is a Class.
 * 
 * Student s1 = new Student();
 * 
 * creates an actual object.
 * 
 * ---------------------------------------------------------
 * 
 * Why do we need Classes?
 * 
 * Without classes,every variable would exist independently.
 * 
 * Example
 * 
 * String name;
 * 
 * int age;
 * 
 * double marks;
 * 
 * Imagine handling information for 1000 students.
 * 
 * Managing separate variables would become very difficult.
 * 
 * Instead,
 * we combine related information inside
 * a Class.
 * 
 * Example
 * 
 * class Student {
 * 
 * String name;
 * 
 * int age;
 * 
 * }
 * 
 * Now every Student object contains
 * 
 * its own
 * 
 * name
 * 
 * and
 * 
 * age.
 * 
 * ---------------------------------------------------------
 * 
 * Class vs Object
 * 
 * Class
 * 
 * ↓
 * 
 * Blueprint
 * 
 * ↓
 * 
 * No Memory for Object Data
 * 
 * ↓
 * 
 * Defines Structure
 * 
 * ---------------------------------------------------------
 * 
 * Object
 * 
 * ↓
 * 
 * Actual Instance
 * 
 * ↓
 * 
 * Occupies Heap Memory
 * 
 * ↓
 * 
 * Stores Real Data
 * 
 * ---------------------------------------------------------
 * 
 * Example
 * 
 * Student
 * ↓
 * Class
 * 
 * Student s1 = new Student();
 * ↓
 * Object
 * 
 * ---------------------------------------------------------
 * 
 * class Student {
 * 
 * String name;
 * 
 * int age;
 * 
 * void display() {
 * 
 * }
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Parts of a Class
 * 
 * class Student {
 * 
 * // Instance Variables
 * String name;
 * int age;
 * 
 * // Constructor
 * Student(String name, int age) {
 * 
 * this.name = name;
 * this.age = age;
 * 
 * }
 * 
 * // Method
 * void displayInfo() {
 * 
 * System.out.println(name);
 * 
 * }
 * 
 * }
 * 
 * A class generally contains
 * 
 * ✔ Variables
 * 
 * ✔ Constructors
 * 
 * ✔ Methods
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * 
 * static class Student {
 * 
 * String name;
 * 
 * int age;
 * 
 * Student(String name, int age) {
 * 
 * this.name = name;
 * 
 * this.age = age;
 * 
 * }
 * 
 * void displayInfo() {
 * 
 * System.out.println(name);
 * 
 * System.out.println(age);
 * 
 * }
 * 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * 
 * static class Student
 * 
 * Defines a nested Student class.
 * 
 * We declared it static so that it can be
 * used directly inside the static main()
 * method.
 * 
 * Later in this course,
 * 
 * we will learn
 * 
 * Static Nested Classes
 * 
 * in detail.
 * 
 * ---------------------------------------------------------
 * 
 * String name;
 * 
 * Stores the student's name.
 * 
 * Every object gets its own copy.
 * 
 * ---------------------------------------------------------
 * 
 * int age;
 * 
 * Stores the student's age.
 * 
 * Every object gets its own copy.
 * 
 * ---------------------------------------------------------
 * 
 * Student(String name, int age)
 * 
 * Constructor.
 * 
 * It initializes the object.
 * 
 * Whenever
 * 
 * new Student(...)
 * 
 * is executed,
 * 
 * this constructor runs automatically.
 * 
 * ---------------------------------------------------------
 * 
 * this.name = name;
 * 
 * The left side
 * 
 * this.name
 * 
 * refers to the object's instance variable.
 * 
 * The right side
 * 
 * name
 * 
 * refers to the constructor parameter.
 * 
 * ---------------------------------------------------------
 * 
 * displayInfo()
 * 
 * Instance Method.
 * 
 * Displays the data stored inside
 * the object.
 * 
 * ---------------------------------------------------------
 * 
 * Student s1 = new Student("Mayank",21);
 * 
 * Step 1
 * 
 * new Student(...)
 * 
 * ↓
 * 
 * Creates an object inside Heap Memory.
 * 
 * Step 2
 * 
 * Constructor executes.
 * 
 * Step 3
 * 
 * Reference
 * 
 * s1
 * 
 * stores the object's address.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * 
 * Stack Memory
 * 
 * main()
 * 
 * ↓
 * 
 * s1 -------------
 * 
 * \
 * 
 * \
 * 
 * Heap Memory
 * 
 * +----------------------+
 * 
 * Student Object
 * 
 * name = "Mayank"
 * 
 * age = 21
 * 
 * +----------------------+
 * 
 * ---------------------------------------------------------
 * 
 * Creating Another Object
 * 
 * Student s2 = new Student("Rahul",22);
 * 
 * Stack
 * 
 * s1 -------------------+
 * 
 * |
 * 
 * s2 -------------------|------------+
 * 
 * |
 * 
 * Heap
 * 
 * +----------------------+
 * 
 * Student Object
 * 
 * Mayank
 * 
 * 21
 * 
 * +----------------------+
 * 
 * +----------------------+
 * 
 * Student Object
 * 
 * Rahul
 * 
 * 22
 * 
 * +----------------------+
 * 
 * Notice
 * 
 * Both objects are created from
 * 
 * the SAME Class.
 * 
 * ---------------------------------------------------------
 * 
 * Important Points
 * 
 * ✔ One Class
 * 
 * ↓
 * 
 * Many Objects
 * 
 * ---------------------------------------------------------
 * 
 * Each Object
 * 
 * ↓
 * 
 * Own Data
 * 
 * ---------------------------------------------------------
 * 
 * Methods are shared through the class definition,
 * 
 * but each object has its own instance variables.
 * 
 * ---------------------------------------------------------
 * 
 * Can a Class Exist Without an Object?
 * 
 * YES.
 * 
 * Example
 * 
 * class Student {
 * 
 * }
 * 
 * A class can exist without creating any objects.
 * 
 * ---------------------------------------------------------
 * 
 * Can an Object Exist Without a Class?
 * 
 * NO.
 * 
 * Every object must be created from a class.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages of Classes
 * 
 * ✔ Code Reusability
 * 
 * ✔ Better Organization
 * 
 * ✔ Easier Maintenance
 * 
 * ✔ Supports Object-Oriented Programming
 * 
 * ✔ Data + Behaviour Together
 * 
 * ---------------------------------------------------------
 * 
 * Common Mistakes
 * 
 * ✘ Thinking a Class stores data.
 * 
 * Reality
 * 
 * Objects store data.
 * 
 * The Class only defines the structure.
 * 
 * ---------------------------------------------------------
 * 
 * ✘ Thinking every object has its own copy
 * of methods.
 * 
 * Reality
 * 
 * Objects have their own instance data.
 * 
 * The method implementation belongs to the
 * class definition and is executed on behalf
 * of each object.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * 
 * Q1.
 * 
 * What is a Class?
 * 
 * Answer
 * 
 * A class is a blueprint or template used
 * to create objects.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * What is an Object?
 * 
 * Answer
 * 
 * An object is an instance of a class.
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * Can we create multiple objects from one class?
 * 
 * Answer
 * 
 * Yes.
 * 
 * One class can create any number of objects.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * Can a class exist without objects?
 * 
 * Answer
 * 
 * Yes.
 * 
 * A class definition can exist even if
 * no object has been created.
 * 
 * ---------------------------------------------------------
 * 
 * Q5.
 * 
 * Can an object exist without a class?
 * 
 * Answer
 * 
 * No.
 * 
 * Every object is created from some class.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * 
 * ✔ Class = Blueprint
 * 
 * ✔ Object = Instance
 * 
 * ✔ Objects are stored in Heap Memory
 * 
 * ✔ References are stored in Stack Memory
 * 
 * ✔ One Class can create Multiple Objects
 * 
 * ✔ Every Object has its own Data
 * 
 * ✔ Constructors initialize Objects
 * 
 * =========================================================
 */