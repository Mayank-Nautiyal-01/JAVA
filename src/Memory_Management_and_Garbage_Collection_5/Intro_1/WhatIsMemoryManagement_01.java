// package Memory_Management_and_Garbage_Collection_5.Intro_1;

import java.util.*;
public class WhatIsMemoryManagement_01 {
    public static void main(String[] args) {
       //creating obj
        Student s1=new  Student();
        Student s2=new Student();

        //removing reference
        s1=null;
        // suggesting garbage collection
        System.gc();
        System.out.println("Program running...");
    }
}

//Class representing object in memory

class Student{
    int age=20;
    Student(){
        System.out.println("Obj created");
    }
    @Override
    protected void finalize(){
        System.out.println("object destroyed by gc");
    }
}
/*
    =========================================
    MEMORY MANAGEMENT - INTRO
    =========================================

    1. What is Memory Management?

       Memory management is the process of
       allocating and deallocating memory
       to objects during program execution.


    2. Who handles memory in Java?

       Java automatically manages memory
       using JVM (Java Virtual Machine)

       No manual free/delete like C/C++


    3. Object Creation (Memory Allocation)

       Student s1 = new Student();

       → Memory allocated in HEAP
       → Reference stored in STACK


    4. Object Removal

       s1 = null;

       → Object has no reference now
       → Becomes eligible for GC


    5. Garbage Collection (GC)

       GC removes unused objects from memory

       Example:
       s1 = null;
       → Object becomes garbage


    6. System.gc()

       Suggests JVM to run GC

       Important:
       - It is only a request
       - JVM may ignore it


    7. finalize() Method

       Called before object is destroyed

       Note:
       - Not guaranteed to run
       - Deprecated in modern Java


    8. Key Concept

       "Object without reference = eligible for GC"


    9. Flow:

       Object created → used → reference removed → GC cleans


    10. One-line Revision:

       "Java handles memory automatically using garbage collection"
*/
