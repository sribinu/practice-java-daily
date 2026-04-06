package combined;

/**
 * ----------------------------------------------------------
 * Program No   : COM1
 * Question     : Write a program to show the order of execution between static block, instance block, and constructor.
 * Title        : Demo.java
 * Author       : Sribinu P
 * Created On   : 06-04-2026
 * Topic        : combined (static, instance & constructor)
 * Difficulty   : Easy
 * Description  : Write a program to show the order of execution between static block, instance block, and constructor.
 * ----------------------------------------------------------
 */

public class Demo {

    static {
        System.out.println("1. Static Block Executed");
    }

    {
        System.out.println("2. Instance Block Executed");
    }

    public Demo() {
        System.out.println("3. Constructor Executed");
    }

    public static void main(String[] args) {
        // Program COM1: Demo
        // Static → Instance → Constructor (SIC order)
        System.out.println("Main Method Started");

        Demo obj1 = new Demo();

        System.out.println("\nCreating another object...\n");

        Demo obj2 = new Demo();
    }
}

/* Output:
    1. Static Block Executed
    Main Method Started
    2. Instance Block Executed
    3. Constructor Executed

    Creating another object...

    2. Instance Block Executed
    3. Constructor Executed
 */