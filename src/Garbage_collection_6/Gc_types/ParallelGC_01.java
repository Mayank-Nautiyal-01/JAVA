public class ParallelGC_01 {

    public static void main(String[] args) {

        System.out.println("========== Parallel Garbage Collector ==========\n");

        // Creating many objects to put pressure on Heap Memory
        for (int i = 1; i <= 100000; i++) {

            byte[] data = new byte[1024]; // Allocate 1 KB

        }

        System.out.println("Objects Created Successfully.");

    }

}

/*
 * =========================================================
 * PARALLEL GARBAGE COLLECTOR
 * =========================================================
 * 
 * What is Parallel GC?
 * --------------------
 * 
 * Parallel Garbage Collector is a Garbage Collector
 * that performs Garbage Collection using multiple
 * threads instead of a single thread.
 * 
 * Its main goal is to increase the overall performance
 * (throughput) of the application by reducing the
 * time spent in Garbage Collection.
 * 
 * ---------------------------------------------------------
 * 
 * Why was Parallel GC introduced?
 * -------------------------------
 * 
 * Earlier, Java mainly used Serial Garbage Collector.
 * 
 * Serial GC uses only ONE thread.
 * 
 * Suppose Heap Memory contains millions of objects.
 * 
 * Cleaning all those objects with a single thread
 * takes more time.
 * 
 * Modern computers have multiple CPU cores.
 * 
 * Instead of using only one core,
 * 
 * Parallel GC uses multiple cores simultaneously
 * to perform Garbage Collection faster.
 * 
 * ---------------------------------------------------------
 * 
 * Simple Definition
 * 
 * Parallel GC is a multi-threaded Garbage Collector
 * designed to maximize application throughput.
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
 * We intentionally create many objects.
 * 
 * This increases memory usage inside Heap Memory.
 * 
 * Eventually the JVM decides to perform
 * Garbage Collection.
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * ---------------------------------------------------------
 * 
 * public class ParallelGC_01
 * 
 * Main class of our program.
 * 
 * ---------------------------------------------------------
 * 
 * public static void main(String[] args)
 * 
 * Program execution starts here.
 * 
 * ---------------------------------------------------------
 * 
 * System.out.println("========== Parallel Garbage Collector ==========");
 * 
 * Prints the heading on the console.
 * 
 * ---------------------------------------------------------
 * 
 * for (int i = 1; i <= 100000; i++)
 * 
 * Runs the loop one hundred thousand times.
 * 
 * Each iteration creates one new object.
 * 
 * ---------------------------------------------------------
 * 
 * byte[] data = new byte[1024];
 * 
 * Explanation:
 * 
 * byte[] creates an array of bytes.
 * 
 * new byte[1024]
 * 
 * allocates
 * 
 * 1024 bytes (1 KB)
 * 
 * inside Heap Memory.
 * 
 * Each iteration creates a completely new object.
 * 
 * The variable
 * 
 * data
 * 
 * exists only during that loop iteration.
 * 
 * After the next iteration,
 * 
 * the previous object usually becomes unreachable
 * because no reference points to it anymore.
 * 
 * Those unreachable objects become eligible
 * for Garbage Collection.
 * 
 * ---------------------------------------------------------
 * 
 * Approximate Memory Usage
 * 
 * Each Object
 * 
 * ↓
 * 
 * 1 KB
 * 
 * 100000 Objects
 * 
 * ↓
 * 
 * Approximately
 * 
 * 100 MB
 * 
 * This creates enough memory pressure for
 * the JVM to perform Garbage Collection.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * 
 * Iteration 1
 * 
 * Stack Memory
 * 
 * data
 * |
 * |
 * V
 * 
 * Heap Memory
 * 
 * byte[1024]
 * 
 * ---------------------------------------------------------
 * 
 * Iteration 2
 * 
 * Stack Memory
 * 
 * data
 * |
 * |
 * V
 * 
 * Heap Memory
 * 
 * byte[1024]
 * 
 * Old byte[1024]
 * 
 * (No reference)
 * 
 * Eligible for Garbage Collection
 * 
 * ---------------------------------------------------------
 * 
 * Internal Working of Parallel GC
 * 
 * Suppose your computer has
 * 
 * 8 CPU Cores
 * 
 * Serial GC
 * 
 * Core 1
 * 
 * Cleaning Heap
 * 
 * Core 2
 * 
 * Idle
 * 
 * Core 3
 * 
 * Idle
 * 
 * Core 4
 * 
 * Idle
 * 
 * Only one thread performs the work.
 * 
 * ---------------------------------------------------------
 * 
 * Parallel GC
 * 
 * Core 1
 * 
 * Cleaning Objects
 * 
 * Core 2
 * 
 * Cleaning Objects
 * 
 * Core 3
 * 
 * Cleaning Objects
 * 
 * Core 4
 * 
 * Cleaning Objects
 * 
 * Multiple threads divide the work.
 * 
 * This finishes Garbage Collection faster.
 * 
 * ---------------------------------------------------------
 * 
 * Does Parallel GC stop the application?
 * 
 * YES.
 * 
 * Parallel GC still performs
 * 
 * Stop-The-World (STW)
 * 
 * Garbage Collection.
 * 
 * Meaning
 * 
 * Application Running
 * 
 * ↓
 * 
 * GC Starts
 * 
 * ↓
 * 
 * Application Pauses
 * 
 * ↓
 * 
 * Multiple GC Threads Clean Memory
 * 
 * ↓
 * 
 * Application Resumes
 * 
 * Although multiple threads work together,
 * 
 * the application itself remains paused.
 * 
 * ---------------------------------------------------------
 * 
 * What is Throughput?
 * 
 * Throughput means
 * 
 * How much time the application spends doing
 * actual work compared to Garbage Collection.
 * 
 * Example
 * 
 * 100 Seconds Total
 * 
 * 95 Seconds
 * 
 * Application Running
 * 
 * 5 Seconds
 * 
 * Garbage Collection
 * 
 * Throughput
 * 
 * 95%
 * 
 * Parallel GC is designed to maximize throughput.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * 
 * ✔ Uses multiple GC threads.
 * 
 * ✔ Faster than Serial GC.
 * 
 * ✔ Better CPU utilization.
 * 
 * ✔ Good for multi-core processors.
 * 
 * ✔ High throughput.
 * 
 * ---------------------------------------------------------
 * 
 * Disadvantages
 * 
 * ✘ Still causes Stop-The-World pauses.
 * 
 * ✘ Pause time may become large for huge heaps.
 * 
 * ✘ Not suitable for applications requiring
 * very low latency.
 * 
 * ---------------------------------------------------------
 * 
 * JVM Option
 * 
 * To explicitly use Parallel GC
 * 
 * java -XX:+UseParallelGC MyProgram
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * 
 * Q1. What is Parallel GC?
 * 
 * Parallel GC is a multi-threaded Garbage Collector
 * that performs Garbage Collection using multiple
 * threads.
 * 
 * ---------------------------------------------------------
 * 
 * Q2. What is the main objective of Parallel GC?
 * 
 * To maximize application throughput.
 * 
 * ---------------------------------------------------------
 * 
 * Q3. Does Parallel GC remove Stop-The-World pauses?
 * 
 * No.
 * 
 * It reduces Garbage Collection time,
 * but the application still pauses.
 * 
 * ---------------------------------------------------------
 * 
 * Q4. How is Parallel GC different from Serial GC?
 * 
 * Serial GC
 * 
 * • One thread
 * 
 * Parallel GC
 * 
 * • Multiple threads
 * 
 * ---------------------------------------------------------
 * 
 * Q5. Is Parallel GC suitable for modern servers?
 * 
 * Yes.
 * 
 * It performs much better than Serial GC
 * on multi-core processors.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * 
 * ✔ Uses Multiple Threads
 * 
 * ✔ Faster than Serial GC
 * 
 * ✔ Designed for High Throughput
 * 
 * ✔ Still Uses Stop-The-World
 * 
 * ✔ Good for Multi-Core CPUs
 * 
 * ✔ JVM Option
 * 
 * -XX:+UseParallelGC
 * 
 * =========================================================
 */
