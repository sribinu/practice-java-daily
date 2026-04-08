package combined;

/**
 * ----------------------------------------------------------
 * Program No   : COM3
 * Question     : Write a program to compare behavior of static and instance variables for multiple objects.
 * Title        : Worker.java
 * Author       : Sribinu P
 * Created On   : 08-04-2026
 * Topic        : combined (static and instance variables)
 * Difficulty   : Easy
 * Description  : Write a program to compare behavior of static and instance variables for multiple objects.
 * ----------------------------------------------------------
 */

public class Worker {

    String name;
    static String company = "XYZ Company";

    public Worker(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name    : " + name);
        System.out.println("Company : " + company);
    }

    public static void main(String[] args) {
        // Program COM3: Worker
        // Instance = separate copy per object | Static = one shared copy
        Worker w1 = new Worker("John");
        Worker w2 = new Worker("Alice");

        w1.name = "Mike";
        w2.company = "XYZ College";    // affects all objects

        System.out.println("Worker 1 Details:");
        w1.display();

        System.out.println("\nWorker 2 Details:");
        w2.display();
    }
}

/* Output:
    Worker 1 Details:
    Name    : Mike
    Company : XYZ College

    Worker 2 Details:
    Name    : Alice
    Company : XYZ College
 */