public class ZGC_03 {

    public static void main(String[] args) {

        System.out.println("========== Z Garbage Collector (ZGC) ==========\n");

        // Creating many objects to increase Heap usage
        for (int i = 1; i <= 100000; i++) {

            byte[] data = new byte[1024];

        }

        System.out.println("Objects Created Successfully.");

    }

}

/*
 * =========================================================
 * Z GARBAGE COLLECTOR (ZGC)
 * =========================================================
 * 
 * Introduction
 * ---------------------------------------------------------
 * 
 * ZGC stands for
 * 
 * Z Garbage Collector.
 * 
 * It is one of the most advanced Garbage Collectors
 * available in modern Java.
 * 
 * Its primary goal is
 * 
 * Extremely Low Pause Time.
 * 
 * Unlike older Garbage Collectors,
 * 
 * ZGC performs most of its work while
 * the application continues running.
 * 
 * ---------------------------------------------------------
 * 
 * Why was ZGC introduced?
 * ---------------------------------------------------------
 * 
 * Suppose you have a Banking Application.
 * 
 * Millions of users are transferring money.
 * 
 * If Garbage Collection pauses the application
 * for even 300 milliseconds,
 * 
 * users may notice delays.
 * 
 * Modern applications demand
 * 
 * Very Low Latency
 * 
 * This requirement led to the development
 * of ZGC.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * ZGC is a scalable, low-latency Garbage Collector
 * designed to keep application pause times
 * extremely short.
 * 
 * ---------------------------------------------------------
 * 
 * Program Used
 * 
 * for (int i = 1; i <= 100000; i++) {
 * 
 * byte[] data = new byte[1024];
 * 
 * }
 * 
 * Just like our previous examples,
 * 
 * we create many objects to increase Heap usage.
 * 
 * Eventually,
 * 
 * the JVM performs Garbage Collection.
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * 
 * public class ZGC_03
 * 
 * Main class.
 * 
 * ---------------------------------------------------------
 * 
 * public static void main(String[] args)
 * 
 * Execution starts here.
 * 
 * ---------------------------------------------------------
 * 
 * for (int i = 1; i <= 100000; i++)
 * 
 * Creates many objects.
 * 
 * ---------------------------------------------------------
 * 
 * byte[] data = new byte[1024];
 * 
 * Allocates approximately
 * 
 * 1 KB
 * 
 * inside Heap Memory.
 * 
 * Thousands of such allocations create
 * memory pressure.
 * 
 * ---------------------------------------------------------
 * 
 * How ZGC Works
 * ---------------------------------------------------------
 * 
 * Older Collectors
 * 
 * ↓
 * 
 * Stop Application
 * 
 * ↓
 * 
 * Perform GC
 * 
 * ↓
 * 
 * Resume Application
 * 
 * ---------------------------------------------------------
 * 
 * ZGC
 * 
 * Application Running
 * 
 * ↓
 * 
 * Very Small Pause
 * 
 * ↓
 * 
 * Application Running
 * 
 * ↓
 * 
 * Concurrent Garbage Collection
 * 
 * ↓
 * 
 * Application Running
 * 
 * Most of the work happens while
 * the application continues executing.
 * 
 * ---------------------------------------------------------
 * 
 * Does ZGC Use Stop-The-World?
 * 
 * YES.
 * 
 * This is a common interview question.
 * 
 * Many students think
 * 
 * "ZGC has no Stop-The-World."
 * 
 * That is incorrect.
 * 
 * ZGC still performs Stop-The-World pauses,
 * 
 * but they are designed to be extremely short.
 * 
 * In many workloads,
 * 
 * they are typically less than
 * 
 * 1 millisecond.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * 
 * ✔ Extremely Low Pause Time
 * 
 * ✔ Scales to Very Large Heaps
 * 
 * ✔ Concurrent Garbage Collection
 * 
 * ✔ Excellent for Modern Server Applications
 * 
 * ✔ Good Performance
 * 
 * ---------------------------------------------------------
 * 
 * Disadvantages
 * 
 * ✘ More CPU Overhead than some simpler collectors
 * 
 * ✘ Usually unnecessary for small applications
 * 
 * ---------------------------------------------------------
 * 
 * G1 GC vs ZGC
 * 
 * G1 GC
 * 
 * Focus
 * 
 * Balanced Throughput
 * 
 * +
 * 
 * Predictable Pause Time
 * 
 * ---------------------------------------------------------
 * 
 * ZGC
 * 
 * Focus
 * 
 * Ultra Low Latency
 * 
 * Pause Time
 * 
 * Usually less than 1 ms
 * 
 * ---------------------------------------------------------
 * 
 * When Should We Use ZGC?
 * 
 * ✔ Financial Systems
 * 
 * ✔ Stock Market Applications
 * 
 * ✔ Cloud Servers
 * 
 * ✔ Large Enterprise Applications
 * 
 * ✔ Real-Time Analytics
 * 
 * ✔ Huge Heap Sizes
 * 
 * ---------------------------------------------------------
 * 
 * JVM Option
 * 
 * Use ZGC
 * 
 * java -XX:+UseZGC MyProgram
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * 
 * Q1.
 * 
 * What is the primary goal of ZGC?
 * 
 * Answer
 * 
 * Extremely Low Pause Time.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Does ZGC completely remove Stop-The-World?
 * 
 * Answer
 * 
 * No.
 * 
 * It minimizes Stop-The-World pauses,
 * but does not eliminate them completely.
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * Which is faster?
 * 
 * G1 or ZGC?
 * 
 * Answer
 * 
 * It depends on what you mean by "faster."
 * 
 * If your goal is
 * 
 * High Throughput,
 * 
 * G1 may be a better fit for many workloads.
 * 
 * If your goal is
 * 
 * Very Low Pause Time,
 * 
 * ZGC is usually the better choice.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * Can ZGC handle very large heaps?
 * 
 * Answer
 * 
 * Yes.
 * 
 * It is designed to scale to very large heap sizes.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * 
 * ✔ Modern Garbage Collector
 * 
 * ✔ Low Latency
 * 
 * ✔ Concurrent GC
 * 
 * ✔ Extremely Short Pause Time
 * 
 * ✔ Suitable for Large Applications
 * 
 * ✔ JVM Option
 * 
 * 
 * =========================================================
 */