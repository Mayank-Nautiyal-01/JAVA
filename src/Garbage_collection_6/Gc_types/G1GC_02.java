
public class G1GC_02 {

    public static void main(String[] args) {

        System.out.println("========== G1 (Garbage First) Garbage Collector ==========\n");

        // Creating many objects to increase heap usage
        for (int i = 1; i <= 100000; i++) {

            byte[] data = new byte[1024];

        }

        System.out.println("Objects Created Successfully.");

    }

}

/*
 * =========================================================
 * G1 (GARBAGE FIRST) GARBAGE COLLECTOR
 * =========================================================
 * 
 * Introduction
 * ---------------------------------------------------------
 * 
 * G1 (Garbage First) Garbage Collector is one of the
 * most advanced Garbage Collectors provided by the JVM.
 * 
 * It was introduced to solve the limitations of older
 * Garbage Collectors like:
 * 
 * 1. Serial GC
 * 2. Parallel GC
 * 3. CMS (Concurrent Mark Sweep)
 * 
 * Starting from Java 9,
 * 
 * G1 became the DEFAULT Garbage Collector.
 * 
 * This means that if you simply run
 * 
 * java MyProgram
 * 
 * the JVM will normally use G1 GC unless another
 * collector is explicitly selected.
 * 
 * ---------------------------------------------------------
 * 
 * Why was G1 GC introduced?
 * ---------------------------------------------------------
 * 
 * Before G1,
 * 
 * the most commonly used collectors were
 * 
 * • Serial GC
 * • Parallel GC
 * • CMS GC
 * 
 * Each had its own problems.
 * 
 * ---------------------------------------------------------
 * 
 * Problem 1 : Serial GC
 * 
 * Serial GC uses
 * 
 * Only ONE thread.
 * 
 * Advantages
 * 
 * ✔ Simple
 * 
 * Disadvantages
 * 
 * ✘ Very slow for large applications.
 * 
 * ✘ Cannot efficiently use modern multi-core CPUs.
 * 
 * ---------------------------------------------------------
 * 
 * Problem 2 : Parallel GC
 * 
 * Parallel GC solved the first problem.
 * 
 * Instead of one thread,
 * 
 * it uses multiple GC threads.
 * 
 * Advantages
 * 
 * ✔ Faster than Serial GC.
 * 
 * ✔ Better CPU utilization.
 * 
 * However...
 * 
 * Parallel GC still pauses the entire application
 * while Garbage Collection runs.
 * 
 * This is called
 * 
 * Stop-The-World (STW).
 * 
 * Suppose an online shopping application receives
 * thousands of requests every second.
 * 
 * If the application pauses for even a few hundred
 * milliseconds,
 * 
 * users may experience delays.
 * 
 * ---------------------------------------------------------
 * 
 * Problem 3 : CMS (Concurrent Mark Sweep)
 * 
 * CMS tried to solve long pause times.
 * 
 * Most of its work happened while the application
 * continued running.
 * 
 * This greatly reduced STW pauses.
 * 
 * However CMS had several issues.
 * 
 * ✘ Memory Fragmentation
 * 
 * After deleting objects,
 * 
 * free memory became scattered into many
 * small pieces.
 * 
 * Example
 * 
 * Free Space
 * 
 * 10 MB
 * 
 * 5 MB
 * 
 * 2 MB
 * 
 * 7 MB
 * 
 * Suppose a new object needs
 * 
 * 20 MB.
 * 
 * Although total free memory is
 * 
 * 24 MB,
 * 
 * there is no single continuous block of
 * 20 MB.
 * 
 * The allocation fails.
 * 
 * This is called
 * 
 * Memory Fragmentation.
 * 
 * ---------------------------------------------------------
 * 
 * Another CMS Problem
 * 
 * CMS required a lot of CPU resources.
 * 
 * Since both
 * 
 * Application Threads
 * 
 * and
 * 
 * GC Threads
 * 
 * worked simultaneously,
 * 
 * they competed for CPU time.
 * 
 * ---------------------------------------------------------
 * 
 * CMS was eventually
 * 
 * Deprecated in Java 9
 * 
 * Removed in Java 14
 * 
 * ---------------------------------------------------------
 * 
 * Solution
 * 
 * Oracle designed
 * 
 * G1 Garbage Collector.
 * 
 * Its goals were
 * 
 * ✔ High Throughput
 * 
 * ✔ Short Pause Time
 * 
 * ✔ Better Heap Management
 * 
 * ✔ Better Performance
 * 
 * ✔ Predictable Garbage Collection
 * 
 * ---------------------------------------------------------
 * 
 * Meaning of G1
 * 
 * G1
 * 
 * stands for
 * 
 * Garbage First
 * 
 * ---------------------------------------------------------
 * 
 * Why "Garbage First"?
 * 
 * Suppose Heap Memory contains
 * 
 * Region A
 * 
 * 90% Garbage
 * 
 * Region B
 * 
 * 5% Garbage
 * 
 * Region C
 * 
 * 80% Garbage
 * 
 * Region D
 * 
 * 10% Garbage
 * 
 * Instead of scanning the entire Heap,
 * 
 * G1 first cleans
 * 
 * Region A
 * 
 * and
 * 
 * Region C
 * 
 * because they contain the highest amount
 * of garbage.
 * 
 * Hence the name
 * 
 * Garbage First.
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
 * The purpose of this program is NOT to
 * demonstrate G1 itself.
 * 
 * Instead,
 * 
 * it continuously creates objects,
 * 
 * which increases Heap usage.
 * 
 * When enough memory is occupied,
 * 
 * the JVM starts Garbage Collection.
 * 
 * Depending on the JVM configuration,
 * 
 * G1 GC may perform collection.
 * 
 * ---------------------------------------------------------
 * 
 * Code Explanation
 * 
 * public class G1GC_02
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
 * System.out.println(...)
 * 
 * Prints the heading.
 * 
 * ---------------------------------------------------------
 * 
 * for (int i = 1; i <= 100000; i++)
 * 
 * Runs one hundred thousand iterations.
 * 
 * ---------------------------------------------------------
 * 
 * byte[] data = new byte[1024];
 * 
 * Creates one byte array.
 * 
 * Each array occupies approximately
 * 
 * 1024 Bytes
 * 
 * (1 KB)
 * 
 * inside Heap Memory.
 * 
 * As the loop continues,
 * 
 * Heap usage increases.
 * 
 * Eventually,
 * 
 * Garbage Collection becomes necessary.
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * 
 * Initially
 * 
 * Stack
 * 
 * main()
 * 
 * Heap
 * 
 * Empty
 * 
 * ---------------------------------------------------------
 * 
 * Iteration 1
 * 
 * Stack
 * 
 * data
 * 
 * ↓
 * 
 * Heap
 * 
 * byte[1024]
 * 
 * ---------------------------------------------------------
 * 
 * Iteration 2
 * 
 * Stack
 * 
 * data
 * 
 * ↓
 * 
 * Heap
 * 
 * byte[1024]
 * 
 * Old byte[1024]
 * 
 * Eligible for GC
 * 
 * ---------------------------------------------------------
 * 
 * After Thousands of Iterations
 * 
 * Heap
 * 
 * □□□□□□□□□□□□□□□□□□□□□□□□
 * 
 * Large number of objects
 * 
 * Some Reachable
 * 
 * Some Unreachable
 * 
 * ↓
 * 
 * G1 starts identifying regions
 * containing the most garbage.
 * 
 * ---------------------------------------------------------
 * 
 * How G1 is Different
 * 
 * Older Collectors
 * 
 * ↓
 * 
 * Treat Heap as
 * 
 * Young Generation
 * 
 * Old Generation
 * 
 * and collect large sections.
 * 
 * ---------------------------------------------------------
 * 
 * G1
 * 
 * ↓
 * 
 * Divides Heap into
 * 
 * Many Small Regions.
 * 
 * Each Region is managed independently.
 * 
 * Instead of cleaning the entire Heap,
 * 
 * G1 selects the regions containing
 * the maximum garbage.
 * 
 * This significantly reduces unnecessary work.
 * 
 * ---------------------------------------------------------
 * 
 * Important Points
 * 
 * ✔ Default Garbage Collector (Java 9+)
 * 
 * ✔ Replaced CMS
 * 
 * ✔ Region-Based Heap
 * 
 * ✔ Better Pause Time
 * 
 * ✔ High Throughput
 * 
 * ✔ Suitable for Large Applications
 * 
 * =========================================================
 */

/*
 * =========================================================
 * G1 GARBAGE COLLECTOR (PART - 2)
 * HEAP REGIONS & INTERNAL WORKING
 * =========================================================
 * 
 * Heap Structure in Older Garbage Collectors
 * ---------------------------------------------------------
 * 
 * Older Garbage Collectors divided Heap into
 * large continuous sections.
 * 
 * Example
 * 
 * +---------------------------------------+
 * | HEAP MEMORY |
 * +---------------------------------------+
 * | |
 * | Young Generation |
 * | |
 * +---------------------------------------+
 * | |
 * | Old Generation |
 * | |
 * +---------------------------------------+
 * 
 * The entire Young Generation or Old Generation
 * was often collected as one large area.
 * 
 * As Heap size increased,
 * 
 * Garbage Collection became slower.
 * 
 * ---------------------------------------------------------
 * 
 * Heap Structure in G1 GC
 * ---------------------------------------------------------
 * 
 * Instead of dividing Heap into only
 * 
 * Young
 * 
 * and
 * 
 * Old,
 * 
 * G1 divides the Heap into many small
 * equal-sized pieces.
 * 
 * These pieces are called
 * 
 * REGIONS.
 * 
 * Example
 * 
 * +----+----+----+----+----+
 * | R1 | R2 | R3 | R4 | R5 |
 * +----+----+----+----+----+
 * | R6 | R7 | R8 | R9 |R10 |
 * +----+----+----+----+----+
 * |R11 |R12 |R13 |R14 |R15 |
 * +----+----+----+----+----+
 * |R16 |R17 |R18 |R19 |R20 |
 * +----+----+----+----+----+
 * 
 * Each box is called a
 * 
 * Region.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * How many regions are there?
 * 
 * Answer
 * 
 * There is no fixed number.
 * 
 * The JVM decides.
 * 
 * A region usually has a size between
 * 
 * 1 MB
 * 
 * and
 * 
 * 32 MB.
 * 
 * Depending on Heap size,
 * 
 * the JVM creates hundreds or even
 * thousands of regions.
 * 
 * ---------------------------------------------------------
 * 
 * Question
 * 
 * Why divide Heap into Regions?
 * 
 * Imagine a city.
 * 
 * Instead of cleaning the whole city,
 * 
 * workers first clean the dirtiest streets.
 * 
 * That is exactly what G1 does.
 * 
 * Instead of cleaning the whole Heap,
 * 
 * it cleans only selected Regions.
 * 
 * This saves time.
 * 
 * ---------------------------------------------------------
 * 
 * Types of Regions
 * ---------------------------------------------------------
 * 
 * A Region can become
 * 
 * • Eden Region
 * 
 * • Survivor Region
 * 
 * • Old Region
 * 
 * • Humongous Region
 * 
 * Notice carefully.
 * 
 * A Region is NOT permanently Eden or Old.
 * 
 * Its role can change.
 * 
 * Today
 * 
 * Region 5
 * 
 * may be Eden.
 * 
 * Later
 * 
 * Region 5
 * 
 * can become Old.
 * 
 * This flexibility is one of the biggest
 * advantages of G1.
 * 
 * ---------------------------------------------------------
 * 
 * 1. Eden Region
 * ---------------------------------------------------------
 * 
 * New Objects are created here.
 * 
 * Example
 * 
 * Student s = new Student();
 * 
 * Object
 * 
 * ↓
 * 
 * Eden Region
 * 
 * Example
 * 
 * +-----+-----+-----+
 * | E | E | E |
 * +-----+-----+-----+
 * 
 * E means Eden.
 * 
 * ---------------------------------------------------------
 * 
 * 2. Survivor Region
 * ---------------------------------------------------------
 * 
 * Suppose an object survives one Garbage Collection.
 * 
 * Instead of immediately moving it to Old Generation,
 * 
 * G1 moves it into a Survivor Region.
 * 
 * Example
 * 
 * +-----+-----+
 * | S | S |
 * +-----+-----+
 * 
 * S means Survivor.
 * 
 * Objects that are still alive remain here.
 * 
 * ---------------------------------------------------------
 * 
 * 3. Old Region
 * ---------------------------------------------------------
 * 
 * Objects that survive multiple Garbage Collections
 * 
 * are promoted to Old Regions.
 * 
 * Example
 * 
 * +-----+-----+-----+
 * | O | O | O |
 * +-----+-----+-----+
 * 
 * O means Old.
 * 
 * These usually contain
 * 
 * Long-lived objects.
 * 
 * Example
 * 
 * Database Connections
 * 
 * Cache Objects
 * 
 * Configuration Objects
 * 
 * Singleton Objects
 * 
 * ---------------------------------------------------------
 * 
 * 4. Humongous Region
 * ---------------------------------------------------------
 * 
 * Some objects are very large.
 * 
 * Example
 * 
 * Very Large Image
 * 
 * Large Video
 * 
 * Huge Array
 * 
 * Instead of storing them across many
 * normal regions,
 * 
 * G1 allocates one or more
 * 
 * Humongous Regions.
 * 
 * These regions are treated differently.
 * 
 * ---------------------------------------------------------
 * 
 * Object Journey
 * ---------------------------------------------------------
 * 
 * Imagine
 * 
 * Student s = new Student();
 * 
 * Step 1
 * 
 * Object Created
 * 
 * ↓
 * 
 * Eden Region
 * 
 * ---------------------------------------------------------
 * 
 * Young GC Happens
 * 
 * ↓
 * 
 * Object Still Alive
 * 
 * ↓
 * 
 * Move to Survivor Region
 * 
 * ---------------------------------------------------------
 * 
 * Another Young GC
 * 
 * ↓
 * 
 * Still Alive
 * 
 * ↓
 * 
 * Stay in Survivor Region
 * 
 * ---------------------------------------------------------
 * 
 * Many Garbage Collections Later
 * 
 * ↓
 * 
 * Still Alive
 * 
 * ↓
 * 
 * Move to Old Region
 * 
 * ---------------------------------------------------------
 * 
 * Finally
 * 
 * No Reference Exists
 * 
 * ↓
 * 
 * Eligible for Garbage Collection
 * 
 * ↓
 * 
 * Region becomes cleaner
 * 
 * ---------------------------------------------------------
 * 
 * Memory Representation
 * 
 * Initially
 * 
 * +----------------------------------+
 * | Eden | Eden | Eden | Empty | Old |
 * +----------------------------------+
 * 
 * Objects are continuously created.
 * 
 * ---------------------------------------------------------
 * 
 * After Young GC
 * 
 * +----------------------------------+
 * | Empty | Empty | Survivor | Old |
 * +----------------------------------+
 * 
 * Dead objects removed.
 * 
 * Live objects moved.
 * 
 * ---------------------------------------------------------
 * 
 * After Promotion
 * 
 * +----------------------------------+
 * | Eden | Survivor | Old | Old |
 * +----------------------------------+
 * 
 * Long-lived objects reach Old Regions.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages of Regions
 * ---------------------------------------------------------
 * 
 * ✔ Small collection area.
 * 
 * ✔ Less unnecessary scanning.
 * 
 * ✔ Better pause times.
 * 
 * ✔ Flexible memory management.
 * 
 * ✔ Better scalability.
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * 
 * Q1.
 * 
 * What is the biggest innovation of G1 GC?
 * 
 * Answer
 * 
 * Instead of treating Heap as one large memory area,
 * 
 * G1 divides it into many small Regions.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Can one Region permanently remain Eden?
 * 
 * Answer
 * 
 * No.
 * 
 * A Region can change its role.
 * 
 * Today it may be Eden.
 * 
 * Later it can become Survivor or Old.
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * Where are new objects created?
 * 
 * Answer
 * 
 * Inside Eden Regions.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * What happens to objects that survive
 * Garbage Collection?
 * 
 * Answer
 * 
 * They move to Survivor Regions.
 * 
 * After surviving multiple GCs,
 * 
 * they move to Old Regions.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * 
 * ✔ Heap divided into Regions.
 * 
 * ✔ Region Size
 * 
 * 1 MB to 32 MB (typically decided by JVM).
 * 
 * ✔ Types
 * 
 * Eden
 * 
 * Survivor
 * 
 * Old
 * 
 * Humongous
 * 
 * ✔ Objects
 * 
 * Eden
 * 
 * ↓
 * 
 * Survivor
 * 
 * ↓
 * 
 * Old
 * 
 * =========================================================
 */

/*
 * =========================================================
 * G1 GARBAGE COLLECTOR (PART - 3)
 * GARBAGE COLLECTION PROCESS & JVM OPTIONS
 * =========================================================
 * 
 * How Does G1 GC Actually Work?
 * ---------------------------------------------------------
 * 
 * Suppose our Heap contains many Regions.
 * 
 * +-----+-----+-----+-----+-----+
 * | E | E | S | O | O |
 * +-----+-----+-----+-----+-----+
 * | O | H | O | E | S |
 * +-----+-----+-----+-----+-----+
 * 
 * E = Eden
 * S = Survivor
 * O = Old
 * H = Humongous
 * 
 * As objects are created,
 * 
 * Eden Regions slowly become full.
 * 
 * When Eden becomes full,
 * 
 * G1 starts a
 * 
 * Young Garbage Collection.
 * 
 * ---------------------------------------------------------
 * 
 * Young Garbage Collection
 * ---------------------------------------------------------
 * 
 * Young GC mainly works on
 * 
 * ✔ Eden Regions
 * 
 * ✔ Survivor Regions
 * 
 * Old Regions are generally not collected
 * during a normal Young GC.
 * 
 * Example
 * 
 * Before Young GC
 * 
 * +------------------------------+
 * | Eden | Eden | Survivor | Old |
 * +------------------------------+
 * 
 * Suppose Eden contains
 * 
 * 100 Objects
 * 
 * 70 Objects
 * 
 * ↓
 * 
 * Dead
 * 
 * 30 Objects
 * 
 * ↓
 * 
 * Still Alive
 * 
 * After Young GC
 * 
 * 70 dead objects
 * 
 * ↓
 * 
 * Removed
 * 
 * 30 live objects
 * 
 * ↓
 * 
 * Moved to Survivor Region
 * 
 * Result
 * 
 * +------------------------------+
 * | Empty | Empty | Survivor |Old|
 * +------------------------------+
 * 
 * This operation is much faster than scanning
 * the entire Heap.
 * 
 * ---------------------------------------------------------
 * 
 * Concurrent Marking
 * ---------------------------------------------------------
 * 
 * Young GC alone is not enough.
 * 
 * The JVM must also know
 * 
 * Which Old Regions contain lots of garbage?
 * 
 * Instead of stopping the application,
 * 
 * G1 performs
 * 
 * Concurrent Marking.
 * 
 * Meaning
 * 
 * Application
 * 
 * Running
 * 
 * +
 * 
 * G1
 * 
 * Checking Old Regions
 * 
 * Both happen together.
 * 
 * The application continues to work while
 * the JVM identifies regions that contain
 * mostly garbage.
 * 
 * This greatly reduces pause time.
 * 
 * ---------------------------------------------------------
 * 
 * Mixed Garbage Collection
 * ---------------------------------------------------------
 * 
 * Once Concurrent Marking finishes,
 * 
 * the JVM knows
 * 
 * Old Region A
 * 
 * 90% Garbage
 * 
 * Old Region B
 * 
 * 10% Garbage
 * 
 * Old Region C
 * 
 * 80% Garbage
 * 
 * Old Region D
 * 
 * 5% Garbage
 * 
 * Instead of cleaning every Old Region,
 * 
 * G1 chooses only those with the highest
 * amount of garbage.
 * 
 * Example
 * 
 * Collected
 * 
 * ✔ Region A
 * 
 * ✔ Region C
 * 
 * Skipped
 * 
 * ✘ Region B
 * 
 * ✘ Region D
 * 
 * This is why it is called
 * 
 * Garbage First.
 * 
 * ---------------------------------------------------------
 * 
 * Stop-The-World in G1
 * 
 * Many students think
 * 
 * "G1 has no Stop-The-World."
 * 
 * This is WRONG.
 * 
 * G1 still performs Stop-The-World pauses.
 * 
 * However,
 * 
 * its pauses are
 * 
 * Much Shorter
 * 
 * Much More Predictable
 * 
 * than older collectors.
 * 
 * Example
 * 
 * Parallel GC
 * 
 * Application
 * 
 * ↓
 * 
 * STOP
 * 
 * ↓
 * 
 * GC
 * 
 * ↓
 * 
 * Continue
 * 
 * Large Pause
 * 
 * ---------------------------------------------------------
 * 
 * G1
 * 
 * Application
 * 
 * ↓
 * 
 * Very Short Pause
 * 
 * ↓
 * 
 * Continue
 * 
 * ↓
 * 
 * Concurrent Work
 * 
 * ↓
 * 
 * Small Pause
 * 
 * ↓
 * 
 * Continue
 * 
 * Notice
 * 
 * G1 reduces pause time,
 * 
 * it does NOT completely remove it.
 * 
 * ---------------------------------------------------------
 * 
 * Pause Time Goal
 * 
 * One amazing feature of G1 is
 * 
 * Pause Time Prediction.
 * 
 * The JVM allows us to specify
 * 
 * Our preferred maximum pause time.
 * 
 * Example
 * 
 * -XX:MaxGCPauseMillis=200
 * 
 * Meaning
 * 
 * Try to keep every Stop-The-World pause
 * 
 * around
 * 
 * 200 milliseconds
 * 
 * Important
 * 
 * This is NOT a guarantee.
 * 
 * It is only a goal.
 * 
 * The JVM tries its best.
 * 
 * ---------------------------------------------------------
 * 
 * JVM Options
 * 
 * Use G1 GC
 * 
 * java -XX:+UseG1GC MyProgram
 * 
 * ---------------------------------------------------------
 * 
 * Pause Time Goal
 * 
 * java -XX:MaxGCPauseMillis=200 MyProgram
 * 
 * ---------------------------------------------------------
 * 
 * Display GC Details
 * 
 * java -Xlog:gc MyProgram
 * 
 * Useful while debugging performance.
 * 
 * ---------------------------------------------------------
 * 
 * Advantages
 * 
 * ✔ Default Collector in Modern Java
 * 
 * ✔ Region-Based Heap
 * 
 * ✔ Better Pause Time
 * 
 * ✔ Concurrent Marking
 * 
 * ✔ Good Throughput
 * 
 * ✔ Predictable Performance
 * 
 * ✔ Excellent for Large Heaps
 * 
 * ✔ Suitable for Server Applications
 * 
 * ---------------------------------------------------------
 * 
 * Disadvantages
 * 
 * ✘ More Complex than Parallel GC
 * 
 * ✘ Slightly Higher CPU Usage
 * 
 * ✘ Not Always Best for Tiny Applications
 * 
 * ---------------------------------------------------------
 * 
 * Parallel GC vs G1 GC
 * 
 * Parallel GC
 * 
 * Uses Multiple Threads
 * 
 * Focus
 * 
 * Maximum Throughput
 * 
 * Stop-The-World
 * 
 * Longer Pause
 * 
 * Heap
 * 
 * Young + Old
 * 
 * ---------------------------------------------------------
 * 
 * G1 GC
 * 
 * Uses Multiple Threads
 * 
 * Focus
 * 
 * Balanced Throughput
 * 
 * +
 * 
 * Short Pause Time
 * 
 * Heap
 * 
 * Many Regions
 * 
 * ---------------------------------------------------------
 * 
 * When Should We Use G1?
 * 
 * G1 is a good choice for
 * 
 * ✔ Enterprise Applications
 * 
 * ✔ Banking Systems
 * 
 * ✔ E-Commerce Platforms
 * 
 * ✔ REST APIs
 * 
 * ✔ Microservices
 * 
 * ✔ Large Backend Systems
 * 
 * ✔ Applications with Large Heaps
 * 
 * ---------------------------------------------------------
 * 
 * Real-Life Analogy
 * 
 * Imagine a city with
 * 
 * 100 Streets.
 * 
 * Old Garbage Collectors
 * 
 * Clean
 * 
 * Every Street
 * 
 * Even if only
 * 
 * 10 Streets
 * 
 * are dirty.
 * 
 * G1
 * 
 * First checks
 * 
 * Which streets contain the most garbage.
 * 
 * Then cleans
 * 
 * Only those streets.
 * 
 * Time Saved
 * 
 * Performance Improved
 * 
 * ---------------------------------------------------------
 * 
 * Interview Questions
 * 
 * Q1.
 * 
 * What does G1 stand for?
 * 
 * Garbage First.
 * 
 * ---------------------------------------------------------
 * 
 * Q2.
 * 
 * Why is it called Garbage First?
 * 
 * Because it first collects Regions containing
 * the highest amount of garbage.
 * 
 * ---------------------------------------------------------
 * 
 * Q3.
 * 
 * Is G1 the default Garbage Collector?
 * 
 * Yes.
 * 
 * From Java 9 onwards.
 * 
 * ---------------------------------------------------------
 * 
 * Q4.
 * 
 * Does G1 completely remove Stop-The-World?
 * 
 * No.
 * 
 * It reduces pause time,
 * 
 * but does not eliminate Stop-The-World.
 * 
 * ---------------------------------------------------------
 * 
 * Q5.
 * 
 * What is Concurrent Marking?
 * 
 * The JVM identifies live and dead objects
 * while the application continues running.
 * 
 * ---------------------------------------------------------
 * 
 * Q6.
 * 
 * What is Mixed GC?
 * 
 * Garbage Collection that includes
 * 
 * Young Regions
 * 
 * +
 * 
 * Selected Old Regions
 * containing lots of garbage.
 * 
 * ---------------------------------------------------------
 * 
 * Q7.
 * 
 * What is the purpose of
 * 
 * -XX:MaxGCPauseMillis ?
 * 
 * It tells the JVM the desired maximum
 * pause time.
 * 
 * It is a goal,
 * 
 * not a guarantee.
 * 
 * ---------------------------------------------------------
 * 
 * Quick Revision
 * 
 * ✔ Default GC (Java 9+)
 * 
 * ✔ Region-Based Heap
 * 
 * ✔ Garbage First Strategy
 * 
 * ✔ Young GC
 * 
 * ✔ Concurrent Marking
 * 
 * ✔ Mixed GC
 * 
 * ✔ Short Pause Time
 * 
 * ✔ Predictable Performance
 * 
 * ✔ Suitable for Large Applications
 * 
 * ✔ JVM Option
 * 
 * 
 * =========================================================
 */