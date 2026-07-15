public class ShenandoahGC_04 {

    public static void main(String[] args) {

        System.out.println("========== Shenandoah Garbage Collector ==========\n");

        // Creating many objects to increase Heap usage
        for (int i = 1; i <= 100000; i++) {

            byte[] data = new byte[1024];

        }

        System.out.println("Objects Created Successfully.");

    }

}

/*
 * =========================================================
 * SHENANDOAH GARBAGE COLLECTOR
 * =========================================================
 * 
 * Introduction
 * ---------------------------------------------------------
 * 
 * Shenandoah GC is a modern, low-pause Garbage
 * Collector developed as part of the OpenJDK project.
 * 
 * Its main objective is
 * 
 * Very Low Pause Time.
 * 
 * Like ZGC,
 * 
 * Shenandoah performs most Garbage Collection
 * work while the application is still running.
 * 
 * Instead of making the user wait,
 * 
 * the JVM tries to clean memory concurrently.
 * 
 * ---------------------------------------------------------
 * 
 * Why was Shenandoah introduced?
 * ---------------------------------------------------------
 * 
 * Older Garbage Collectors had one major problem.
 * 
 * As Heap size increased,
 * 
 * Garbage Collection pause time also increased.
 * 
 * Example
 * 
 * Heap Size
 * 
 * 2 GB
 * 
 * ↓
 * 
 * Pause Time
 * 
 * Small
 * 
 * ---------------------------------------------------------
 * 
 * Heap Size
 * 
 * 100 GB
 * 
 * ↓
 * 
 * Pause Time
 * 
 * Much Larger
 * 
 * For applications requiring continuous response,
 * 
 * such long pauses become unacceptable.
 * 
 * Shenandoah was designed to solve this problem.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * Shenandoah is a low-latency Garbage Collector
 * that performs most Garbage Collection work
 * concurrently, helping keep pause times short.
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
 * This creates many objects inside Heap Memory.
 * 
 * As Heap usage increases,
 * 
 * Garbage Collection becomes necessary.
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * 
 * public class ShenandoahGC_04
 * 
 * Main class.
 * 
 * ---------------------------------------------------------
 * 
 * public static void main(String[] args)
 * 
 * Execution begins here.
 * 
 * ---------------------------------------------------------
 * 
 * for (int i = 1; i <= 100000; i++)
 * 
 * Runs one hundred thousand times.
 * 
 * ---------------------------------------------------------
 * 
 * byte[] data = new byte[1024];
 * 
 * Creates a new object of approximately
 * 
 * 1 KB
 * 
 * inside Heap Memory.
 * 
 * Many such allocations create memory pressure.
 * 
 * ---------------------------------------------------------
 * 
 * How Shenandoah Works
 * 
 * Traditional Collectors
 * 
 * ↓
 * 
 * Application Stops
 * 
 * ↓
 * 
 * Garbage Collection
 * 
 * ↓
 * 
 * Application Continues
 * 
 * ---------------------------------------------------------
 * 
 * Shenandoah
 * 
 * Application Running
 * 
 * ↓
 * 
 * Concurrent Marking
 * 
 * ↓
 * 
 * Concurrent Evacuation
 * 
 * ↓
 * 
 * Concurrent Updating
 * 
 * ↓
 * 
 * Application Running
 * 
 * Most of the work happens while
 * the application is still executing.
 * 
 * Only very small Stop-The-World
 * phases remain.
 * 
 * ---------------------------------------------------------
 * 
 * Concurrent Evacuation
 * 
 * One important feature of Shenandoah is
 * 
 * Concurrent Evacuation.
 * 
 * Suppose an object needs to be moved
 * from one memory region to another.
 * 
 * Older collectors often paused the
 * application while moving objects.
 * 
 * Shenandoah performs much of this work
 * concurrently.
 * 
 * This helps keep pause times low.
 * 
 * ---------------------------------------------------------
 * 
 * Does Shenandoah Use Stop-The-World?
 * 
 * YES.
 * 
 * A common misconception is
 * 
 * "Shenandoah completely removes
 * Stop-The-World."
 * 
 * This is incorrect.
 * 
 * Shenandoah still performs small
 * Stop-The-World pauses,
 * 
 * but they are designed to remain
 * very short.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * 
 * ✔ Very Low Pause Time
 * 
 * ✔ Concurrent Garbage Collection
 * 
 * ✔ Concurrent Object Movement
 * 
 * ✔ Good for Large Heap Applications
 * 
 * ✔ Better User Responsiveness
 * 
 * ---------------------------------------------------------
 * 
 * Disadvantages
 * 
 * ✘ More Complex than Parallel GC
 * 
 * ✘ Additional CPU Overhead
 * 
 * ✘ Usually unnecessary for small desktop
 * applications
 * 
 * ---------------------------------------------------------
 * 
 * Shenandoah vs G1
 * 
 * G1
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
 * Shenandoah
 * 
 * Focus
 * 
 * Very Low Pause Time
 * 
 * Concurrent Object Movement
 * 
 * ---------------------------------------------------------
 * 
 * Shenandoah vs ZGC
 * 
 * Shenandoah
 * 
 * ✔ Concurrent Marking
 * 
 * ✔ Concurrent Evacuation
 * 
 * ✔ Low Pause Time
 * 
 * ---------------------------------------------------------
 * 
 * ZGC
 * 
 * ✔ Concurrent Marking
 * 
 * ✔ Very Low Pause Time
 * 
 * ✔ Designed for extremely large heaps
 * 
 * Both are excellent modern collectors.
 * 
 * The choice depends on
 * 
 * Application Requirements,
 * 
 * JVM Distribution,
 * 
 * and Performance Goals.
 * 
 * ---------------------------------------------------------
 * 
 * When Should We Use Shenandoah?
 * 
 * ✔ Large Enterprise Applications
 * 
 * ✔ Cloud Services
 * 
 * ✔ Real-Time Systems
 * 
 * ✔ Applications requiring low latency
 * 
 * ✔ Large Heap Applications
 * 
 * ---------------------------------------------------------
 * 
 * JVM Option
 * 
 * Use Shenandoah GC
 * 
 * java -XX:+UseShenandoahGC MyProgram
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * 
 * Q1.
 * 
 * What is the primary goal of Shenandoah GC?
 * 
 * Answer
 * 
 * To keep Garbage Collection pause times
 * very low.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Does Shenandoah completely remove
 * Stop-The-World?
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
 * What is Concurrent Evacuation?
 * 
 * Answer
 * 
 * Moving objects while the application
 * continues running.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * Which collectors are designed mainly
 * for low latency?
 * 
 * Answer
 * 
 * G1 (to an extent)
 * 
 * ZGC
 * 
 * Shenandoah
 * 
 * ---------------------------------------------------------
 * 
 * Q5.
 * 
 * Which is better,
 * 
 * ZGC or Shenandoah?
 * 
 * Answer
 * 
 * Neither is universally better.
 * 
 * Both target low pause times but use
 * different implementation strategies.
 * 
 * The best choice depends on the
 * application's requirements.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * 
 * ✔ Modern Garbage Collector
 * 
 * ✔ Low Latency
 * 
 * ✔ Concurrent Marking
 * 
 * ✔ Concurrent Evacuation
 * 
 * ✔ Small Stop-The-World Pauses
 * 
 * ✔ Suitable for Large Applications
 * 
 * ✔ JVM Option
 * 
 * 
 * =========================================================
 */